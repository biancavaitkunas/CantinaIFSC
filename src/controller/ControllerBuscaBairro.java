package controller;

import Service.BairroService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
        
        DefaultTableModel tabelaDados = (DefaultTableModel) telabuscaBairro.getjTDados().getModel();
      
        List<Bairro> listaBairros = new ArrayList<Bairro>();
        listaBairros = BairroService.carregar();
        
        for (Bairro bairroAtual : BairroService.carregar()) {
            tabelaDados.addRow(new Object[] {bairroAtual.getId(), bairroAtual.getDescricao()});
        }
        
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
            List<Bairro> listaBairros = new ArrayList<Bairro>();
            listaBairros = BairroService.carregar();
            
            DefaultTableModel tabela =  (DefaultTableModel) this.telaBuscaBairro.getjTDados().getModel();
            for (Bairro bairroAtual : listaBairros) {
                tabela.addRow(new Object[]{bairroAtual.getId(), 
                                           bairroAtual.getDescricao()});
            }
            
        }else if(e.getSource() == this.telaBuscaBairro.getjBSair()){
            this.telaBuscaBairro.dispose();
        }
    }

}
