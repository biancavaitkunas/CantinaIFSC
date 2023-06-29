package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
import model.Produto;
import view.TelaBuscaProduto;


public class ControllerBuscaProduto implements ActionListener{
    
    TelaBuscaProduto telaBuscaProduto;
    
    public ControllerBuscaProduto (TelaBuscaProduto telaBuscaProduto){
        this.telaBuscaProduto.getjBFiltrar().addActionListener(this);
        this.telaBuscaProduto.getjBCarregar().addActionListener(this);
        this.telaBuscaProduto.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaProduto.getjBCarregar()){
            
        }else if (e.getSource() == this.telaBuscaProduto.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProduto.getjTDados().getModel();
            
            for (Produto produtoAtual : DAO.ClasseDados.listaProdutos) {
                tabela.addRow(new Object[]{produtoAtual.getId(), produtoAtual.getDescricao(), produtoAtual.getCodigoBarra()});
            }
            
        }else if (e.getSource() == this.telaBuscaProduto.getjBSair()){
            
        }
    }
    
}
