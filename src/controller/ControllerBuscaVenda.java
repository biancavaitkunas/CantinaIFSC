package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Venda;
import view.TelaBuscaVenda;


public class ControllerBuscaVenda implements ActionListener{
    
    TelaBuscaVenda telaBuscaVenda;
    
    public ControllerBuscaVenda (TelaBuscaVenda telaBuscaVenda){
        this.telaBuscaVenda.getjBFiltrar().addActionListener(this);
        this.telaBuscaVenda.getjBCarregar().addActionListener(this);
        this.telaBuscaVenda.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaVenda.getjBCarregar()){
            controller.ControllerCadastroProduto.codigo =  (int) this.telaBuscaVenda.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaVenda.getjTDados().getSelectedRow(), 0);
            
        }else if (e.getSource() == this.telaBuscaVenda.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaVenda.getjTDados().getModel();
            
            for (Venda vendaAtual : DAO.ClasseDados.listaVendas) {
                tabela.addRow(new Object[]{vendaAtual.getId(), vendaAtual.getFuncionario(), vendaAtual.getCarteirinha(), vendaAtual.getValorDesconto()});
            }
            
        }else if (e.getSource() == this.telaBuscaVenda.getjBSair()){
            
        }
    }
    
}
