package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroMovimentacaoEstoque;

public class ControllerCadastroMovimentacaoEstoque implements ActionListener {
    TelaCadastroMovimentacaoEstoque telaCadastroMovimentacaoEstoque;
    
    public ControllerCadastroMovimentacaoEstoque (TelaCadastroMovimentacaoEstoque  telaCadastroMovimentacaoEstoque){
        this.telaCadastroMovimentacaoEstoque = telaCadastroMovimentacaoEstoque;/*global = regional*/
        this.telaCadastroMovimentacaoEstoque.getjBNovo().addActionListener(this);
        this.telaCadastroMovimentacaoEstoque.getjBSair().addActionListener(this);
        this.telaCadastroMovimentacaoEstoque.getjBBuscar().addActionListener(this);
        this.telaCadastroMovimentacaoEstoque.getjBCancelar().addActionListener(this);
        this.telaCadastroMovimentacaoEstoque.getjBGravar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroMovimentacaoEstoque.getjPRodape());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroMovimentacaoEstoque.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroMovimentacaoEstoque.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroMovimentacaoEstoque.getjPRodape());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroMovimentacaoEstoque.getjPCorpo());
            
        }else if (e.getSource() == this.telaCadastroMovimentacaoEstoque.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroMovimentacaoEstoque.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroMovimentacaoEstoque.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroMovimentacaoEstoque.getjBGravar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroMovimentacaoEstoque.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroMovimentacaoEstoque.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroMovimentacaoEstoque.getjBBuscar()){
            TelaCadastroMovimentacaoEstoque telaCadastroMovimentacaoEstoque = new TelaCadastroMovimentacaoEstoque (null, true);
            telaCadastroMovimentacaoEstoque.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroMovimentacaoEstoque.getjBSair()){
            this.telaCadastroMovimentacaoEstoque.dispose();
        }
    }
    
}
