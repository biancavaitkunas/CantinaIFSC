
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Carteirinha;
import view.TelaBuscaCarteirinha;

public class ControllerBuscaCarteirinha implements ActionListener{
    
    TelaBuscaCarteirinha telabuscaCarteirinha;
    
    public ControllerBuscaCarteirinha (TelaBuscaCarteirinha telabuscaCarteirinha){
        
        this.telabuscaCarteirinha = telabuscaCarteirinha;
        this.telabuscaCarteirinha.getjBFiltrar().addActionListener(this);
        this.telabuscaCarteirinha.getjBCarregar().addActionListener(this);
        this.telabuscaCarteirinha.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telabuscaCarteirinha.getjBCarregar()){
            controller.ControllerCadastroCarteirinha.codigo =  (int) this.telabuscaCarteirinha.
                                                            getjTDados().
                                                            getValueAt(this.telabuscaCarteirinha.getjTDados().getSelectedRow(), 0);
            
        }else if (e.getSource() == this.telabuscaCarteirinha.getjBFiltrar()){
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();
            
            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telabuscaCarteirinha.getjTDados().getModel();
            
            for (Carteirinha carteirinhaAtual : DAO.ClasseDados.listaCarteirinha) {
                tabela.addRow(new Object[]{carteirinhaAtual.getId(), carteirinhaAtual.getCodigoBarra(), carteirinhaAtual.getDataGeracao()});
            }
            
        }else if (e.getSource() == this.telabuscaCarteirinha.getjBSair()){
            this.telabuscaCarteirinha.dispose();
        }
    }
    
}
