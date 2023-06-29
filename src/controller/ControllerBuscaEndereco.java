package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Endereco;
import view.TelaBuscaEndereco;


public class ControllerBuscaEndereco implements ActionListener{
    
    TelaBuscaEndereco telaBuscaEndereco;
    
    public ControllerBuscaEndereco (TelaBuscaEndereco telaBuscaEndereco){
        this.telaBuscaEndereco = telaBuscaEndereco;
        this.telaBuscaEndereco.getjBFiltrar().addActionListener(this);
        this.telaBuscaEndereco.getjBCarregar().addActionListener(this);
        this.telaBuscaEndereco.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaEndereco.getjBCarregar()){
            controller.ControllerCadastroEndereco.codigo =  (int) this.telaBuscaEndereco.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaEndereco.getjTDados().getSelectedRow(), 0);
            
        }else if (e.getSource() == this.telaBuscaEndereco.getjBFiltrar()){
            DAO.ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaEndereco.getjTDados().getModel();
            
            for (Endereco enderecoAtual : DAO.ClasseDados.listaEndereco) {
                tabela.addRow(new Object[]{enderecoAtual.getId(), enderecoAtual.getCep(), enderecoAtual.getLogradouro()});
            }
            
        }else if (e.getSource() == this.telaBuscaEndereco.getjBSair()){
            this.telaBuscaEndereco.dispose();
        }
    }
    
    
}
