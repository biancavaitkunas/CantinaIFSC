package controller;

import Service.CidadeService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
            
         controller.ControllerCadastroCidade.codigo =  (int) this.telaBuscaCidade.
                                                            getjTDados().
                                                            getValueAt(this.telaBuscaCidade.getjTDados().getSelectedRow(), 0);
            
         this.telaBuscaCidade.dispose();
        }else if (e.getSource() == this.telaBuscaCidade.getjBFiltrar()){
            if (this.telaBuscaCidade.getjTFFiltrar().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\nOpção de Filtro Vazia...");
                this.telaBuscaCidade.getjTFFiltrar().requestFocus();
            } else {
                List<Cidade> listaCidades = new ArrayList<Cidade>();

                if (this.telaBuscaCidade.getjComboFiltro().getSelectedIndex() == 0) {
                    listaCidades.add(CidadeService.carregar(Integer.parseInt(this.telaBuscaCidade.getjTFFiltrar().getText())));
                } else if (this.telaBuscaCidade.getjComboFiltro().getSelectedIndex() == 1) {
                   // listaBairros = BairroService.carregar(this.telaBuscaBairro.getjTFFiltrar().getText().trim());
                }

                //Criar um objeto do tipo TableModel
                DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCidade.getjTDados().getModel();
                tabela.setRowCount(0);

                for (Cidade bairroAtual : listaCidades) {
                    tabela.addRow(new Object[]{bairroAtual.getId(),
                        bairroAtual.getDescricao()});
                }
            }
            
        }else if(e.getSource() == this.telaBuscaCidade.getjBSair()){
            this.telaBuscaCidade.dispose();
        }
            
    }
    
}
