package controller;

import Service.BairroService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
            if (this.telaBuscaBairro.getjTFFiltrar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telaBuscaBairro.getjTFFiltrar().requestFocus();
            } else {
                List<Bairro> listaBairros = new ArrayList<Bairro>();

                if (this.telaBuscaBairro.getjComboFiltro().getSelectedIndex() == 0) {
                    listaBairros.add(BairroService.carregar(Integer.parseInt(this.telaBuscaBairro.getjTFFiltrar().getText())));
                } else if (this.telaBuscaBairro.getjComboFiltro().getSelectedIndex() == 1) {
                    listaBairros = BairroService.carregar(this.telaBuscaBairro.getjTFFiltrar().getText().trim());
                }

                DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaBairro.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Bairro bairroAtual : listaBairros) {
                    tabela.addRow(new Object[]{bairroAtual.getId(),
                        bairroAtual.getDescricao()});
                }
            }
            
        }else if(e.getSource() == this.telaBuscaBairro.getjBSair()){
            this.telaBuscaBairro.dispose();
        }
    }

}
