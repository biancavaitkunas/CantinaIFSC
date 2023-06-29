package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import view.TelaBuscaBairro;
import view.TelaBuscaFuncionario;


public class ControllerBuscaFuncionario implements ActionListener{
    
    TelaBuscaFuncionario telaBuscaFuncionario;
    
    public ControllerBuscaFuncionario (TelaBuscaBairro telabuscaBairro){
        this.telaBuscaFuncionario.getjBFiltrar().addActionListener(this);
        this.telaBuscaFuncionario.getjBCarregar().addActionListener(this);
        this.telaBuscaFuncionario.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaFuncionario.getjBCarregar()){
            
        }else if (e.getSource() == this.telaBuscaFuncionario.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFuncionario.getjTDados().getModel();
            
            for (Funcionario funcionarioAtual : DAO.ClasseDados.listaFuncionarios) {
                tabela.addRow(new Object[]{funcionarioAtual.getId(), funcionarioAtual.getCpf(), funcionarioAtual.getRg()});
            }
            
        }else if (e.getSource() == this.telaBuscaFuncionario.getjBSair()){
            
        }
    }
    
}
