package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Carteirinha;
import view.TelaBuscaCarteirinha;
import view.TelaCadastroCarteirinha;


public class ControllerCadastroCarteirinha implements ActionListener {
    TelaCadastroCarteirinha telaCadastroCarteirinha;
    public static int codigo;
    
    public ControllerCadastroCarteirinha (TelaCadastroCarteirinha  telaCadastroCarteirinha){
        this.telaCadastroCarteirinha = telaCadastroCarteirinha;/*global = regional*/
        this.telaCadastroCarteirinha.getjBNovo().addActionListener(this);
        this.telaCadastroCarteirinha.getjBSair().addActionListener(this);
        this.telaCadastroCarteirinha.getjBBuscar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBCancelar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBGravar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroCarteirinha.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPRodape());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPCorpo());
            this.telaCadastroCarteirinha.getjTFID().setEditable(false);
            
        }else if (e.getSource() == this.telaCadastroCarteirinha.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBGravar()){
            
            Carteirinha carteirinha = new Carteirinha();
            carteirinha.setId(DAO.ClasseDados.listaCarteirinha.size() + 1);
            carteirinha.setCodigoBarra(this.telaCadastroCarteirinha.getjTFCodigoBarras().getText());
            
            if (this.telaCadastroCarteirinha.getjLID().getText().equalsIgnoreCase("")){
                DAO.ClasseDados.listaCarteirinha.add(carteirinha);
            } else {
                
            }
            
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBBuscar()){
            codigo = 0;
            TelaBuscaCarteirinha telaBuscaCarteirinha = new TelaBuscaCarteirinha (null, true);
            ControllerBuscaCarteirinha controllerBuscacarteirinha = new ControllerBuscaCarteirinha(telaBuscaCarteirinha);
            telaBuscaCarteirinha.setVisible(true);
            
            if(codigo != 0){
                Carteirinha carteirinha = new Carteirinha();
                carteirinha = DAO.ClasseDados.listaCarteirinha.get(codigo-1);
                utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
                utilities.Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
                
                this.telaCadastroCarteirinha.getjTFID().setText(carteirinha.getId() + "");
                this.telaCadastroCarteirinha.getjTFCodigoBarras().setText(carteirinha.getCodigoBarra());
                this.telaCadastroCarteirinha.getjTFID().setEnabled(false);
            }
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBSair()){
            this.telaCadastroCarteirinha.dispose();
        }
    }
    
}
