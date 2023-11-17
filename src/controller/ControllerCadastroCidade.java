package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cidade;
import utilities.Utilities;
import view.TelaBuscaCidade;
import view.TelaCadastroCidade;


public class ControllerCadastroCidade implements ActionListener {
    TelaCadastroCidade telaCadastroCidade;
    public static int codigo;
    
    public ControllerCadastroCidade (TelaCadastroCidade  telaCadastroCidade){
        
        this.telaCadastroCidade = telaCadastroCidade;/*global = regional*/
        this.telaCadastroCidade.getjBNovo().addActionListener(this);
        this.telaCadastroCidade.getjBSair().addActionListener(this);
        this.telaCadastroCidade.getjBBuscar().addActionListener(this);
        this.telaCadastroCidade.getjBCancelar().addActionListener(this);
        this.telaCadastroCidade.getjBGravar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCidade.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroCidade.getjPCorpo());
            
            this.telaCadastroCidade.getjTFId().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroCidade.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroCidade.getjBGravar()) {

            Cidade cidade = new Cidade();
            cidade.setDescricao(this.telaCadastroCidade.getjTFDescricao().getText());
            cidade.setUf((String) this.telaCadastroCidade.getjCBUF().getSelectedItem());
            
            if(this.telaCadastroCidade.getjTFId().getText().equalsIgnoreCase("")){
               Service.CidadeService.adicionar(cidade);
            }else{
              cidade.setId(Integer.parseInt(this.telaCadastroCidade.getjTFId().getText()));
              Service.CidadeService.atualizar(cidade);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroCidade.getjBBuscar()) {
            codigo = 0;
       
            TelaBuscaCidade telaBuscaCidade = new TelaBuscaCidade (null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(telaBuscaCidade);
            telaBuscaCidade.setVisible(true);

            if (codigo != 0) {
                Cidade cidade = new Cidade();
                cidade = DAO.ClasseDados.listaCidade.get(codigo -1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getjPRodape());
                Utilities.limpaComponentes(true, this.telaCadastroCidade.getjPCorpo());
                
                this.telaCadastroCidade.getjTFId().setText(cidade.getId() + "");
                this.telaCadastroCidade.getjTFDescricao().setText(cidade.getDescricao());
                this.telaCadastroCidade.getjTFId().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroCidade.getjBSair()) {
            this.telaCadastroCidade.dispose();

        }
    }
    
}
