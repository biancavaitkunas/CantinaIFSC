package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Bairro;
import utilities.Utilities;
import view.TelaBuscaBairro;
import view.TelaCadastroBairro;

public class ControllerCadastroBairro implements ActionListener {

    TelaCadastroBairro telaCadastroBairro;
    public static int codigo;

    public ControllerCadastroBairro(TelaCadastroBairro telaCadastroBairro) {
        
        this.telaCadastroBairro = telaCadastroBairro;
        this.telaCadastroBairro.getjBNovo().addActionListener(this);
        this.telaCadastroBairro.getjBSair().addActionListener(this);
        this.telaCadastroBairro.getjBCancelar().addActionListener(this);
        this.telaCadastroBairro.getjBGravar().addActionListener(this);
        this.telaCadastroBairro.getjBBuscar().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPCorpo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroBairro.getjBNovo()) {
            Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPCorpo());
            this.telaCadastroBairro.getjTFID().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroBairro.getjBCancelar()) {
            Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroBairro.getjBGravar()) {

            Bairro bairro = new Bairro();
            bairro.setDescricao(this.telaCadastroBairro.getjTFDescricao().getText());
            
            if(this.telaCadastroBairro.getjTFID().getText().equalsIgnoreCase("")){
               Service.BairroService.adicionar(bairro);
            }else{
              bairro.setId(Integer.parseInt(this.telaCadastroBairro.getjTFID().getText()));
              Service.BairroService.atualizar(bairro);
            }

            Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroBairro.getjBBuscar()) {
            codigo = 0;
            TelaBuscaBairro telaBuscaBairro = new TelaBuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(telaBuscaBairro);
            telaBuscaBairro.setVisible(true);

            if (codigo != 0) {
                Bairro bairro = new Bairro();
                bairro = Service.BairroService.carregar(codigo);
                Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPRodape());
                Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPCorpo());
                
                this.telaCadastroBairro.getjTFID().setText(bairro.getId() + "");
                this.telaCadastroBairro.getjTFDescricao().setText(bairro.getDescricao());
                this.telaCadastroBairro.getjTFID().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroBairro.getjBSair()) {
            this.telaCadastroBairro.dispose();
        }
    }

}
