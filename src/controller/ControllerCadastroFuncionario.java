/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaFuncionario;
import view.TelaCadastroFuncionario;

/**
 *
 * @author bianc
 */
public class ControllerCadastroFuncionario implements ActionListener {
    TelaCadastroFuncionario telaCadastroFuncionario;
    
    public ControllerCadastroFuncionario (TelaCadastroFuncionario  telaCadastroFuncionario){
        this.telaCadastroFuncionario = telaCadastroFuncionario;/*global = regional*/
        this.telaCadastroFuncionario.getjBNovo().addActionListener(this);
        this.telaCadastroFuncionario.getjBSair().addActionListener(this);
        this.telaCadastroFuncionario.getjBBuscar().addActionListener(this);
        this.telaCadastroFuncionario.getjBCancelar().addActionListener(this);
        this.telaCadastroFuncionario.getjBGravar().addActionListener(this);
        
        utilities.utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
        utilities.utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroFuncionario.getjBNovo()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPCorpo());
            
        }else if (e.getSource() == this.telaCadastroFuncionario.getjBCancelar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFuncionario.getjBGravar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFuncionario.getjBBuscar()){
            TelaBuscaFuncionario telaBuscaFuncionario = new TelaBuscaFuncionario (null, true);
            telaBuscaFuncionario.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroFuncionario.getjBSair()){
            this.telaCadastroFuncionario.dispose();
        }
    }
    
}
