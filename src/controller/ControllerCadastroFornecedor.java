/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaCliente;
import view.TelaBuscaFornecedor;
import view.TelaCadastroFornecedor;

/**
 *
 * @author bianc
 */
public class ControllerCadastroFornecedor implements ActionListener {
    TelaCadastroFornecedor telaCadastroFornecedor;
    
    public ControllerCadastroFornecedor (TelaCadastroFornecedor  telaCadastroFornecedor){
        this.telaCadastroFornecedor = telaCadastroFornecedor;/*global = regional*/
        this.telaCadastroFornecedor.getjBNovo().addActionListener(this);
        this.telaCadastroFornecedor.getjBSair().addActionListener(this);
        this.telaCadastroFornecedor.getjBBuscar().addActionListener(this);
        this.telaCadastroFornecedor.getjBCancelar().addActionListener(this);
        this.telaCadastroFornecedor.getjBGravar().addActionListener(this);
        
        utilities.utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
        utilities.utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroFornecedor.getjBNovo()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPCorpo());
            
        }else if (e.getSource() == this.telaCadastroFornecedor.getjBCancelar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBGravar()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBBuscar()){
            TelaBuscaFornecedor telaBuscaFornecedor = new TelaBuscaFornecedor (null, true);
            telaBuscaFornecedor.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBSair()){
            this.telaCadastroFornecedor.dispose();
        }
    }
    
}
