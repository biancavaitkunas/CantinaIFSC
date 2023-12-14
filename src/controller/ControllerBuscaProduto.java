package controller;

import Service.ProdutoService;
import static controller.ControllerBuscaCliente.nomeCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import view.TelaBuscaProduto;


public class ControllerBuscaProduto implements ActionListener{
    
    TelaBuscaProduto telaBuscaProduto;
    public static String nomeProduto;
    public static int codProduto;
    public static float valorUnitarioProduto;
    
    public ControllerBuscaProduto (TelaBuscaProduto telaBuscaProduto){
        
        this.telaBuscaProduto = telaBuscaProduto;
        this.telaBuscaProduto.getjBFiltrar().addActionListener(this);
        this.telaBuscaProduto.getjBCarregar().addActionListener(this);
        this.telaBuscaProduto.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaProduto.getjBCarregar()){
            
            controller.ControllerCadastroProduto.codigo =  (int) this.telaBuscaProduto.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaProduto.getjTDados().getSelectedRow(), 0);
            
            nomeProduto = (String) this.telaBuscaProduto.getjTDados().getValueAt(this.telaBuscaProduto.getjTDados().getSelectedRow(), 1);
            codProduto = (int) this.telaBuscaProduto.getjTDados().getValueAt(this.telaBuscaProduto.getjTDados().getSelectedRow(), 0);
            valorUnitarioProduto = (float) this.telaBuscaProduto.getjTDados().getValueAt(this.telaBuscaProduto.getjTDados().getSelectedRow(), 3);

            this.telaBuscaProduto.dispose();
        }else if (e.getSource() == this.telaBuscaProduto.getjBFiltrar()){
            if (this.telaBuscaProduto.getjTFFiltrar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telaBuscaProduto.getjTFFiltrar().requestFocus();
            } else {
                List<Produto> listaProdutos = new ArrayList<Produto>();

                if (this.telaBuscaProduto.getjComboFiltro().getSelectedIndex() == 0) {
                    listaProdutos.add(ProdutoService.carregar(Integer.parseInt(this.telaBuscaProduto.getjTFFiltrar().getText())));
                } else if (this.telaBuscaProduto.getjComboFiltro().getSelectedIndex() == 1) {
                    listaProdutos = ProdutoService.carregar(this.telaBuscaProduto.getjTFFiltrar().getText().trim());
                }

                DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProduto.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Produto produtoAtual : listaProdutos) {
                    tabela.addRow(new Object[]{produtoAtual.getId(),
                        produtoAtual.getDescricao(),
                        produtoAtual.getCodigoBarra(),
                    produtoAtual.getValorUnitario()});
                }
            }
            
        }else if (e.getSource() == this.telaBuscaProduto.getjBSair()){
            this.telaBuscaProduto.dispose();
        }
    }
    
}
