package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import view.TelaBuscaCliente;


public class ControllerBuscaCliente implements ActionListener{
    
    TelaBuscaCliente telabuscaCliente;
    
    public ControllerBuscaCliente (TelaBuscaCliente telabuscaCliente){
        this.telabuscaCliente.getjBFiltrar().addActionListener(this);
        this.telabuscaCliente.getjBCarregar().addActionListener(this);
        this.telabuscaCliente.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telabuscaCliente.getjBCarregar()){
            
        }else if (e.getSource() == this.telabuscaCliente.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telabuscaCliente.getjTDados().getModel();
            
            for (Cliente clienteAtual : DAO.ClasseDados.clientes) {
                tabela.addRow(new Object[]{clienteAtual.getId(), clienteAtual.getMatricula(), clienteAtual.getCpf()});
            }
            
        }else if (e.getSource() == this.telabuscaCliente.getjBSair()){
            
        }
    }
    
}
