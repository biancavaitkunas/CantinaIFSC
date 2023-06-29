/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaVenda;
import view.TelaVenda;

/**
 *
 * @author bianc
 */
public class ControllerVenda implements ActionListener {
    TelaVenda telaCadastroVenda;
    
    public ControllerVenda (TelaVenda  telaCadastroVenda){
        this.telaCadastroVenda = telaCadastroVenda;/*global = regional*/
        this.telaCadastroVenda.getjBNovo().addActionListener(this);
        this.telaCadastroVenda.getjBSair().addActionListener(this);
        this.telaCadastroVenda.getjBBuscar().addActionListener(this);
        this.telaCadastroVenda.getjBCancelar().addActionListener(this);
        this.telaCadastroVenda.getjBGravar().addActionListener(this);
        
        utilities.utilities.ativaDesativa(true, this.telaCadastroVenda.getjPRodape());
        utilities.utilities.limpaComponentes(false, this.telaCadastroVenda.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroVenda.getjBNovo()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroVenda.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroVenda.getjPCorpo());
            
        }else if (e.getSource() == this.telaCadastroVenda.getjBCancelar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroVenda.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroVenda.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBGravar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroVenda.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroVenda.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBBuscar()){
            TelaBuscaVenda telaBuscaVenda = new TelaBuscaVenda (null, true);
            telaBuscaVenda.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBSair()){
            this.telaCadastroVenda.dispose();
        }
    }
    
}