package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
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
            
        }else if (e.getSource() == this.telaBuscaFuncionario.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFuncionario.getjTDados().getModel();
            
            for (Funcionario funcionarioAtual : DAO.ClasseDados.listaFuncionario) {
                tabela.addRow(new Object[]{funcionarioAtual.getId(),funcionarioAtual.getNome(), funcionarioAtual.getCpf()});
            }
            
        }else if (e.getSource() == this.telaBuscaFuncionario.getjBSair()){
            
        }
    }
    
}
