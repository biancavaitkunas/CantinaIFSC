/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaCarteirinha;
import view.TelaCadastroCarteirinha;

/**
 *
 * @author bianc
 */
public class ControllerCadastroCarteirinha implements ActionListener {
    TelaCadastroCarteirinha telaCadastroCarteirinha;
    
    public ControllerCadastroCarteirinha (TelaCadastroCarteirinha  telaCadastroCarteirinha){
        this.telaCadastroCarteirinha = telaCadastroCarteirinha;/*global = regional*/
        this.telaCadastroCarteirinha.getjBNovo().addActionListener(this);
        this.telaCadastroCarteirinha.getjBSair().addActionListener(this);
        this.telaCadastroCarteirinha.getjBBuscar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBCancelar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBGravar().addActionListener(this);
        
        utilities.utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
        utilities.utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroCarteirinha.getjBNovo()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPCorpo());
            
        }else if (e.getSource() == this.telaCadastroCarteirinha.getjBCancelar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBGravar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBBuscar()){
            TelaBuscaCarteirinha telaBuscaCarteirinha = new TelaBuscaCarteirinha (null, true);
            telaBuscaCarteirinha.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBSair()){
            this.telaCadastroCarteirinha.dispose();
        }
    }
    
}
