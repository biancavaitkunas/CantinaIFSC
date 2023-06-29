package controller;

import static DAO.ClasseDados.listaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import view.TelaBuscaCliente;


public class ControllerBuscaCliente implements ActionListener{
    
    TelaBuscaCliente telaBuscaCliente;
    
    public ControllerBuscaCliente (TelaBuscaCliente telabuscaCliente){
        this.telaBuscaCliente = telabuscaCliente;
        this.telaBuscaCliente.getjBFiltrar().addActionListener(this);
        this.telaBuscaCliente.getjBCarregar().addActionListener(this);
        this.telaBuscaCliente.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCliente.getjBCarregar()){
           controller.ControllerCadastroCliente.codigo =  (int) this.telaBuscaCliente.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaCliente.getjTDados().getSelectedRow(), 0);
            
        }else if (e.getSource() == this.telaBuscaCliente.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCliente.getjTDados().getModel();
            
            for (Cliente clienteAtual : DAO.ClasseDados.listaCliente) {
                tabela.addRow(new Object[]{clienteAtual.getId(), clienteAtual.getNome(), clienteAtual.getMatricula(), clienteAtual.getCpf()});
            }
            
        }else if (e.getSource() == this.telaBuscaCliente.getjBSair()){
            this.telaBuscaCliente.dispose();
        }
    }
    
}
