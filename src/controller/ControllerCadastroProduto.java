/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaProduto;
import view.TelaCadastroProduto;

/**
 *
 * @author bianc
 */
public class ControllerCadastroProduto implements ActionListener {
    TelaCadastroProduto telaCadastroProduto;
    
    public ControllerCadastroProduto (TelaCadastroProduto  telaCadastroProduto){
        this.telaCadastroProduto = telaCadastroProduto;/*global = regional*/
        this.telaCadastroProduto.getjBNovo().addActionListener(this);
        this.telaCadastroProduto.getjBSair().addActionListener(this);
        this.telaCadastroProduto.getjBBuscar().addActionListener(this);
        this.telaCadastroProduto.getjBCancelar().addActionListener(this);
        this.telaCadastroProduto.getjBGravar().addActionListener(this);
        
        utilities.utilities.ativaDesativa(true, this.telaCadastroProduto.getjPRodape());
        utilities.utilities.limpaComponentes(false, this.telaCadastroProduto.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroProduto.getjBNovo()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroProduto.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroProduto.getjPCorpo());
            
        }else if (e.getSource() == this.telaCadastroProduto.getjBCancelar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroProduto.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroProduto.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroProduto.getjBGravar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroProduto.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroProduto.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroProduto.getjBBuscar()){
            TelaBuscaProduto telaBuscaProduto = new TelaBuscaProduto (null, true);
            telaBuscaProduto.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroProduto.getjBSair()){
            this.telaCadastroProduto.dispose();
        }
    }
    
}
