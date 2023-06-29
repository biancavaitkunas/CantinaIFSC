package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Bairro;
import model.Endereco;
import view.TelaBuscaBairro;
import view.TelaCadastroBairro;

public class ControllerCadastroBairro implements ActionListener {
    TelaCadastroBairro telaCadastroBairro;
    public static int codigo;
    
    public ControllerCadastroBairro (TelaCadastroBairro  telaCadastroBairro){
        
        this.telaCadastroBairro = telaCadastroBairro;/*global = regional*/
        
        this.telaCadastroBairro.getjBNovo().addActionListener(this);
        this.telaCadastroBairro.getjBSair().addActionListener(this);
        this.telaCadastroBairro.getjBBuscar().addActionListener(this);
        this.telaCadastroBairro.getjBCancelar().addActionListener(this);
        this.telaCadastroBairro.getjBGravar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPRodape());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroBairro.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPRodape());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPCorpo());
            
            this.telaCadastroBairro.getjTFID().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroBairro.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroBairro.getjBGravar()) {

            Bairro bairro = new Bairro();
            bairro.setId(DAO.ClasseDados.listaBairro.size() + 1);
            bairro.setDescricao(this.telaCadastroBairro.getjTFDescricao().getText());
            
            if(this.telaCadastroBairro.getjTFID().getText().equalsIgnoreCase("")){
               DAO.ClasseDados.listaBairro.add(bairro);
               JOptionPane.showMessageDialog(null, bairro.getId());
            }else {
                DAO.ClasseDados.listaBairro.remove(bairro);
                bairro.setDescricao(this.telaCadastroBairro.getjTFDescricao().getText());
                DAO.ClasseDados.listaBairro.add(bairro);
            }
            JOptionPane.showMessageDialog(null, bairro.getId());

            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroBairro.getjBBuscar()) {
            codigo = 0;
            TelaBuscaBairro telaBuscaBairro = new TelaBuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(telaBuscaBairro);
            telaBuscaBairro.setVisible(true);

            if (codigo != 0) {
                Bairro bairro = new Bairro();
                bairro = DAO.ClasseDados.listaBairro.get(codigo -1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPRodape());
                utilities.Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPCorpo());
                
                this.telaCadastroBairro.getjTFID().setText(bairro.getId() + "");
                this.telaCadastroBairro.getjTFDescricao().setText(bairro.getDescricao());
                this.telaCadastroBairro.getjTFID().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroBairro.getjBSair()) {
            this.telaCadastroBairro.dispose();

        }
    }
    
}
