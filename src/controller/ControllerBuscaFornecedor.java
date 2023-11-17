package controller;

import Service.FornecedorService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
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
            controller.ControllerCadastroFornecedor.codigo =  (int) this.telaBuscaFornecedor.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaFornecedor.getjTDados().getSelectedRow(), 0);
            
        this.telaBuscaFornecedor.dispose();
        }else if (e.getSource() == this.telaBuscaFornecedor.getjBFiltrar()){
            if (this.telaBuscaFornecedor.getjTFFiltrar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telaBuscaFornecedor.getjTFFiltrar().requestFocus();
            } else {
                List<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();

                if (this.telaBuscaFornecedor.getjComboFiltro().getSelectedIndex() == 0) {
                    listaFornecedores.add(FornecedorService.carregar(Integer.parseInt(this.telaBuscaFornecedor.getjTFFiltrar().getText())));
                } else if (this.telaBuscaFornecedor.getjComboFiltro().getSelectedIndex() == 1) {
                    listaFornecedores = FornecedorService.carregar(this.telaBuscaFornecedor.getjTFFiltrar().getText().trim());
                }

                //Criar um objeto do tipo TableModel
                DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFornecedor.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Fornecedor clienteAtual : listaFornecedores) {
                    tabela.addRow(new Object[]{clienteAtual.getId(),
                    clienteAtual.getNome(),
                    clienteAtual.getCnpj(),
                    clienteAtual.getRazaoSocial(),
                    clienteAtual.getInscricaoEstadual(),
                    clienteAtual.getFone1()});
                }
            }
            
        }else if (e.getSource() == this.telaBuscaFornecedor.getjBSair()){
            this.telaBuscaFornecedor.dispose();
        }
    }
    
}
