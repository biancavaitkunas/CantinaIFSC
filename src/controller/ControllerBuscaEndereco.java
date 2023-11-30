package controller;

import Service.EnderecoService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
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
            
            if (this.telaBuscaEndereco.getjTFFiltrar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telaBuscaEndereco.getjTFFiltrar().requestFocus();
            } else {
                List<Endereco> listaEnderecos = new ArrayList<Endereco>();

                if (this.telaBuscaEndereco.getjComboFiltro().getSelectedIndex() == 0) {
                    listaEnderecos.add(EnderecoService.carregar(Integer.parseInt(this.telaBuscaEndereco.getjTFFiltrar().getText())));
                } else if (this.telaBuscaEndereco.getjComboFiltro().getSelectedIndex() == 1) {
                    listaEnderecos = EnderecoService.carregar(this.telaBuscaEndereco.getjTFFiltrar().getText().trim());
                }

                DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaEndereco.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Endereco enderecoAtual : listaEnderecos) {
                    tabela.addRow(new Object[]{enderecoAtual.getId(),
                        enderecoAtual.getCep(), enderecoAtual.getLogradouro()});
                }
            }
            
        }else if (e.getSource() == this.telaBuscaEndereco.getjBSair()){
            this.telaBuscaEndereco.dispose();
        }
    }
    
    
}
