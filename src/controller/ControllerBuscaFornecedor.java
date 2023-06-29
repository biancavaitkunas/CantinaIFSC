package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;
import view.TelaBuscaFornecedor;


public class ControllerBuscaFornecedor implements ActionListener{
    
    TelaBuscaFornecedor telaBuscaFornecedor;
    
    public ControllerBuscaFornecedor (TelaBuscaFornecedor telaBuscaFornecedor){
        this.telaBuscaFornecedor = telaBuscaFornecedor;
        this.telaBuscaFornecedor.getjBFiltrar().addActionListener(this);
        this.telaBuscaFornecedor.getjBCarregar().addActionListener(this);
        this.telaBuscaFornecedor.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaFornecedor.getjBCarregar()){
            
        }else if (e.getSource() == this.telaBuscaFornecedor.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFornecedor.getjTDados().getModel();
            
            for (Fornecedor fornecedorAtual : DAO.ClasseDados.listaFornecedor) {
                tabela.addRow(new Object[]{fornecedorAtual.getId(), fornecedorAtual.getNome(), fornecedorAtual.getCnpj(), fornecedorAtual.getRazaoSocial(), fornecedorAtual.getInscricaoEstadual()});
            }
            
        }else if (e.getSource() == this.telaBuscaFornecedor.getjBSair()){
            
        }
    }
    
}
