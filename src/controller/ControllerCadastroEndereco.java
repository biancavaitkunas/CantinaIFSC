package controller;

import static controller.ControllerCadastroBairro.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Cidade;
import model.Bairro;
import utilities.Utilities;
import view.TelaBuscaEndereco;
import view.TelaCadastroEndereco;


public class ControllerCadastroEndereco implements ActionListener {
    TelaCadastroEndereco telaCadastroEndereco;
    public static int codigo;
    
    public ControllerCadastroEndereco (TelaCadastroEndereco  telaCadastroEndereco){
        
        this.telaCadastroEndereco = telaCadastroEndereco;/*global = regional*/
        this.telaCadastroEndereco.getjBNovo().addActionListener(this);
        this.telaCadastroEndereco.getjBSair().addActionListener(this);
        this.telaCadastroEndereco.getjBBuscar().addActionListener(this);
        this.telaCadastroEndereco.getjBCancelar().addActionListener(this);
        this.telaCadastroEndereco.getjBGravar().addActionListener(this);
        
        List<Cidade> listaCidades = new ArrayList<Cidade>();
        List<Bairro> listaBairros = new ArrayList<Bairro>();
        
        listaCidades = Service.CidadeService.carregar();
        listaBairros = Service.BairroService.carregar();

        this.telaCadastroEndereco.getjComboBairro().removeAll();
        this.telaCadastroEndereco.getjComboCidade().removeAll();

        for (Bairro bairroAtual : listaBairros) {
            this.telaCadastroEndereco.getjComboBairro().addItem(bairroAtual.getDescricao());
        }

        for (Cidade cidadeAtual : listaCidades) {
            this.telaCadastroEndereco.getjComboCidade().addItem(cidadeAtual.getDescricao());
        }

        utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroEndereco.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroEndereco.getjPCorpo());
            this.telaCadastroEndereco.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroEndereco.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroEndereco.getjBGravar()){
            
            Endereco endereco = new Endereco();
            endereco.setCep(this.telaCadastroEndereco.getjTFCEP().getText());
            endereco.setLogradouro(this.telaCadastroEndereco.getjTFLogradouro().getText());
            //endereco.setCidade(this.telaCadastroEndereco.getjTFCidade().getText());
            
            endereco.setBairro(Service.BairroService.carregar("" + this.telaCadastroEndereco.getjComboBairro().getSelectedItem()).get(0));
            endereco.setCidade(Service.CidadeService.carregar("descricao", this.telaCadastroEndereco.getjComboCidade().getSelectedItem() + "").get(0));

            if (this.telaCadastroEndereco.getjTFID().getText().equalsIgnoreCase("")){
                Service.EnderecoService.adicionar(endereco);
            }else {
            //inserir codigo para alterar na lista
            endereco.setId(Integer.parseInt(this.telaCadastroEndereco.getjTFID().getText()));
             Service.EnderecoService.atualizar(endereco);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroEndereco.getjBBuscar()){
            codigo = 0;
            TelaBuscaEndereco telaBuscaEndereco = new TelaBuscaEndereco (null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco);
            telaBuscaEndereco.setVisible(true);
            
            if (codigo != 0){
            Endereco  endereco = new Endereco();
            endereco = Service.EnderecoService.carregar(codigo);
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
           Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
            
            this.telaCadastroEndereco.getjTFID().setText(endereco.getId() + "");
            this.telaCadastroEndereco.getjTFCEP().setText(endereco.getCep());
            this.telaCadastroEndereco.getjTFLogradouro().setText(endereco.getLogradouro());
            this.telaCadastroEndereco.getjTFID().setEnabled(false);
            }
            
        } else if (e.getSource() == this.telaCadastroEndereco.getjBSair()){
            this.telaCadastroEndereco.dispose();
        }
    }
    
}
