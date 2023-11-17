
package controller;

import Service.CarteirinhaService;
import Service.CidadeService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carteirinha;
import model.Cidade;
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
            
        this.telabuscaCarteirinha.dispose();
        }else if (e.getSource() == this.telabuscaCarteirinha.getjBFiltrar()){
            if (this.telabuscaCarteirinha.getjFFFiltro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telabuscaCarteirinha.getjFFFiltro().requestFocus();
            } else {
                List<Carteirinha> listaCidades = new ArrayList<Carteirinha>();

                if (this.telabuscaCarteirinha.getjComboFiltro().getSelectedIndex() == 0) {
                    listaCidades.add(CarteirinhaService.carregar(Integer.parseInt(this.telabuscaCarteirinha.getjFFFiltro().getText())));
                } else if (this.telabuscaCarteirinha.getjComboFiltro().getSelectedIndex() == 1) {
                   //listaCidades = CarteirinhaService.carregar(this.telabuscaCarteirinha.getjFFFiltro().getText().trim());
                }

                //Criar um objeto do tipo TableModel
                DefaultTableModel tabela = (DefaultTableModel) this.telabuscaCarteirinha.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Carteirinha bairroAtual : listaCidades) {
                    tabela.addRow(new Object[]{bairroAtual.getId(),
                        bairroAtual.getCodigoBarra(),
                    bairroAtual.getDataGeracao()});
                }
            }
            
        }else if (e.getSource() == this.telabuscaCarteirinha.getjBSair()){
            this.telabuscaCarteirinha.dispose();
        }
    }
    
}
