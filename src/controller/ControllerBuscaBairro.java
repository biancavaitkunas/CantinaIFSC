package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
import view.TelaBuscaBairro;


public class ControllerBuscaBairro implements ActionListener {

    TelaBuscaBairro telaBuscaBairro;

    public ControllerBuscaBairro(TelaBuscaBairro telabuscaBairro) {

        this.telaBuscaBairro = telabuscaBairro;

        this.telaBuscaBairro.getjBFiltrar().addActionListener(this);
        this.telaBuscaBairro.getjBCarregar().addActionListener(this);
        this.telaBuscaBairro.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == this.telaBuscaBairro.getjBCarregar()){
            
         controller.ControllerCadastroBairro.codigo =  (int) this.telaBuscaBairro.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaBairro.getjTDados().getSelectedRow(), 0);
            
         this.telaBuscaBairro.dispose();
        }else if (e.getSource() == this.telaBuscaBairro.getjBFiltrar()){
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            DefaultTableModel tabela =  (DefaultTableModel) this.telaBuscaBairro.getjTDados().getModel();
            for (Bairro bairroAtual : DAO.ClasseDados.listaBairro) {
                tabela.addRow(new Object[]{bairroAtual.getId(), 
                                           bairroAtual.getDescricao()});
            }
            
        }else if(e.getSource() == this.telaBuscaBairro.getjBSair()){
            this.telaBuscaBairro.dispose();
        }
    }

}
