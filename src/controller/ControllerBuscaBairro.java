
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
import view.TelaBuscaBairro;


public class ControllerBuscaBairro implements ActionListener {

    TelaBuscaBairro telabuscaBairro;

    public ControllerBuscaBairro(TelaBuscaBairro telabuscaBairro) {

        this.telabuscaBairro = telabuscaBairro;

        this.telabuscaBairro.getjBFiltrar().addActionListener(this);
        this.telabuscaBairro.getjBCarregar().addActionListener(this);
        this.telabuscaBairro.getjBSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telabuscaBairro.getjBFiltrar()) {
            //Criando/carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();

            //Criar objeto de tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telabuscaBairro.getjTDados().getModel();

            for (Bairro bairroAtual : DAO.ClasseDados.listaBairro) {
                tabela.addRow(new Object[]{bairroAtual.getId(), bairroAtual.getDescricao()});
            }
        }else if(e.getSource() == this.telabuscaBairro.getjBSair()){
            
        }else if(e.getSource() == this.telabuscaBairro.getjBCarregar()){
            controller.ControllerCadastroBairro.codigo = (int) this.telabuscaBairro.getjTDados().getValueAt
            (this.telabuscaBairro.getjTDados().getSelectedRow(), 0);
            
            this.telabuscaBairro.dispose();
        }
    }

}
