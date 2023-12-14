package controller;

import Service.ClienteService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
import model.Cliente;
import view.TelaBuscaCliente;


public class ControllerBuscaCliente implements ActionListener{
    
    public static String colunaFiltro;
    TelaBuscaCliente telaBuscaCliente;
    public static String nomeCliente;

    
    public ControllerBuscaCliente (TelaBuscaCliente telabuscaCliente){
        this.telaBuscaCliente = telabuscaCliente;
        this.telaBuscaCliente.getjBFiltrar().addActionListener(this);
        this.telaBuscaCliente.getjBCarregar().addActionListener(this);
        this.telaBuscaCliente.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCliente.getjBCarregar()){
            
           controller.ControllerCadastroCliente.codigo =  (int) this.telaBuscaCliente.getjTDados().getValueAt(this.telaBuscaCliente.getjTDados().getSelectedRow(), 0);
           nomeCliente = (String) this.telaBuscaCliente.getjTDados().getValueAt(this.telaBuscaCliente.getjTDados().getSelectedRow(), 1);
           this.telaBuscaCliente.dispose();
           
        }else if (e.getSource() == this.telaBuscaCliente.getjBFiltrar()){
            if (this.telaBuscaCliente.getjTFFiltrar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telaBuscaCliente.getjTFFiltrar().requestFocus();
                
            } else {
                
                List<Cliente> listaClientes = new ArrayList<Cliente>();
                
                if (this.telaBuscaCliente.getjComboFiltro().getSelectedIndex() == 0) {
                    listaClientes.add(ClienteService.carregar(Integer.parseInt(this.telaBuscaCliente.getjTFFiltrar().getText())));
                } else {
                    colunaFiltro = this.telaBuscaCliente.getjComboFiltro().getSelectedItem().toString().trim();
                    listaClientes = ClienteService.carregar(this.telaBuscaCliente.getjTFFiltrar().getText().trim());
                }

                /*if (this.telaBuscaCliente.getjComboFiltro().getSelectedIndex() == 0) {
                    listaClientes.add(ClienteService.carregar(Integer.parseInt(this.telaBuscaCliente.getjTFFiltrar().getText())));
                } else if (this.telaBuscaCliente.getjComboFiltro().getSelectedIndex() == 1) {
                    listaClientes = ClienteService.carregar(this.telaBuscaCliente.getjTFFiltrar().getText().trim());
                }*/

                //Criar um objeto do tipo TableModel
                DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCliente.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Cliente clienteAtual : listaClientes) {
                    tabela.addRow(new Object[]{
                        clienteAtual.getId(),
                        clienteAtual.getNome(),
                        clienteAtual.getRg(),
                        clienteAtual.getMatricula(),
                        clienteAtual.getCpf(),
                        clienteAtual.getDataNascimento(),
                        clienteAtual.getFone1(),
                        clienteAtual.getFone2(),
                        clienteAtual.getEmail(),
                        clienteAtual.getComplementoEndereco()
                    });
            }
        }
            
        }else if (e.getSource() == this.telaBuscaCliente.getjBSair()){
            this.telaBuscaCliente.dispose();
        }
    }
    
}
