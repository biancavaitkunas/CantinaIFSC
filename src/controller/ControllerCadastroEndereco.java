package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Endereco;
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
        
        utilities.utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
        utilities.utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroEndereco.getjBNovo()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroEndereco.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroEndereco.getjPCorpo());
            this.telaCadastroEndereco.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroEndereco.getjBCancelar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroEndereco.getjBGravar()){
            
            Endereco endereco = new Endereco();
            endereco.setId(DAO.ClasseDados.listaCidade.size() +1);
            endereco.setLogradouro(this.telaCadastroEndereco.getjTFLogradouro().getText());

            if (this.telaCadastroEndereco.getjTFID().getText().equalsIgnoreCase("")){
            DAO.ClasseDados.listaEndereco.add(endereco);
            }else{
            //inserir codigo para alterar na lista
            }
            utilities.utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroEndereco.getjBBuscar()){
            codigo = 0;
            TelaBuscaEndereco telaBuscaEndereco = new TelaBuscaEndereco (null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco);
            telaBuscaEndereco.setVisible(true);
            
            if (codigo != 0){
            Endereco  endereco = new Endereco();
            endereco = DAO.ClasseDados.listaEndereco.get(codigo-1);
            utilities.utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPCorpo());
            
            this.telaCadastroEndereco.getjTFID().setText(endereco.getId() + " ");
            this.telaCadastroEndereco.getjTFLogradouro().setText(endereco.getLogradouro());
            this.telaCadastroEndereco.getjTFID().setEnabled(false);
            }
            
        } else if (e.getSource() == this.telaCadastroEndereco.getjBSair()){
            this.telaCadastroEndereco.dispose();
        }
    }
    
}
