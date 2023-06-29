package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
import model.Cidade;
import view.TelaBuscaCidade;


public class ControllerBuscaCidade implements ActionListener{
    
    TelaBuscaCidade telaBuscaCidade;
    
    public ControllerBuscaCidade (TelaBuscaCidade telaBuscaCidade){
        
        this.telaBuscaCidade = telaBuscaCidade;
        this.telaBuscaCidade.getjBFiltrar().addActionListener(this);
        this.telaBuscaCidade.getjBCarregar().addActionListener(this);
        this.telaBuscaCidade.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaBuscaCidade.getjBCarregar()){
            
         controller.ControllerCadastroBairro.codigo =  (int) this.telaBuscaCidade.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaCidade.getjTDados().getSelectedRow(), 0);
            
         this.telaBuscaCidade.dispose();
        }else if (e.getSource() == this.telaBuscaCidade.getjBFiltrar()){
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar um objeto do tipo TableModel
            DefaultTableModel tabela =  (DefaultTableModel) this.telaBuscaCidade.getjTDados().getModel();
            for (Cidade cidadeAtual : DAO.ClasseDados.listaCidade) {
                tabela.addRow(new Object[]{cidadeAtual.getId(), cidadeAtual.getDescricao(), cidadeAtual.getUf()});
            }
            
        }else if(e.getSource() == this.telaBuscaCidade.getjBSair()){
            this.telaBuscaCidade.dispose();
        }
            
    }
    
}
