package controller;

import Service.FuncionarioService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;
import model.Funcionario;
import view.TelaBuscaFuncionario;


public class ControllerBuscaFuncionario implements ActionListener{
    
    TelaBuscaFuncionario telaBuscaFuncionario;
    
    public ControllerBuscaFuncionario (TelaBuscaFuncionario telaBuscaFuncionario){
        
        this.telaBuscaFuncionario = telaBuscaFuncionario;
        this.telaBuscaFuncionario.getjBFiltrar().addActionListener(this);
        this.telaBuscaFuncionario.getjBCarregar().addActionListener(this);
        this.telaBuscaFuncionario.getjBSair().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaFuncionario.getjBCarregar()){
            
            controller.ControllerCadastroFornecedor.codigo =  (int) this.telaBuscaFuncionario.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaFuncionario.getjTDados().getSelectedRow(), 0);
            
        this.telaBuscaFuncionario.dispose();
        }else if (e.getSource() == this.telaBuscaFuncionario.getjBFiltrar()){
            if (this.telaBuscaFuncionario.getjTFFiltrar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telaBuscaFuncionario.getjTFFiltrar().requestFocus();
            } else {
                List<Funcionario> listaFornecedores = new ArrayList<Funcionario>();

                if (this.telaBuscaFuncionario.getjComboFiltro().getSelectedIndex() == 0) {
                    listaFornecedores.add(FuncionarioService.carregar(Integer.parseInt(this.telaBuscaFuncionario.getjTFFiltrar().getText())));
                } else if (this.telaBuscaFuncionario.getjComboFiltro().getSelectedIndex() == 1) {
                    listaFornecedores = FuncionarioService.carregar(this.telaBuscaFuncionario.getjTFFiltrar().getText().trim());
                }

                //Criar um objeto do tipo TableModel
                DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFuncionario.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Funcionario clienteAtual : listaFornecedores) {
                    tabela.addRow(new Object[]{clienteAtual.getId(),
                        clienteAtual.getNome(),
                    clienteAtual.getCpf(), clienteAtual.getEmail()});
                }
            }

            
        }else if (e.getSource() == this.telaBuscaFuncionario.getjBSair()){
            
        }
    }
    
}
