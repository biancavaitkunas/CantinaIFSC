package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Fornecedor;
import view.TelaBuscaFornecedor;
import view.TelaCadastroFornecedor;


public class ControllerCadastroFornecedor implements ActionListener {
    TelaCadastroFornecedor telaCadastroFornecedor;
    public static int codigo;
    
    public ControllerCadastroFornecedor (TelaCadastroFornecedor  telaCadastroFornecedor){
        this.telaCadastroFornecedor = telaCadastroFornecedor;/*global = regional*/
        this.telaCadastroFornecedor.getjBNovo().addActionListener(this);
        this.telaCadastroFornecedor.getjBSair().addActionListener(this);
        this.telaCadastroFornecedor.getjBBuscar().addActionListener(this);
        this.telaCadastroFornecedor.getjBCancelar().addActionListener(this);
        this.telaCadastroFornecedor.getjBGravar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroFornecedor.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPRodape());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPCorpo());
            this.telaCadastroFornecedor.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroFornecedor.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBGravar()){
            
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(DAO.ClasseDados.listaBairro.size() + 1);
            fornecedor.setNome(this.telaCadastroFornecedor.getjTFNome().getText());
            fornecedor.setCnpj(this.telaCadastroFornecedor.getjTFCNPJ().getText());
            fornecedor.setRazaoSocial(this.telaCadastroFornecedor.getjTFRazaoSocial().getText());
            fornecedor.setInscricaoEstadual(this.telaCadastroFornecedor.getjTFInscricaoEstadual().getText());
            
            if (this.telaCadastroFornecedor.getjTFID().getText().equalsIgnoreCase("")){
                DAO.ClasseDados.listaFornecedor.add(fornecedor);
            } else {
                
            }
            
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBBuscar()){
            codigo = 0;
            TelaBuscaFornecedor telaBuscaFornecedor = new TelaBuscaFornecedor (null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(telaBuscaFornecedor);
            telaBuscaFornecedor.setVisible(true);
            
            if(codigo != 0){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor = DAO.ClasseDados.listaFornecedor.get(codigo-1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPRodape());
                utilities.Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPCorpo());
                
                this.telaCadastroFornecedor.getjTFID().setText(fornecedor.getId() + "");
                this.telaCadastroFornecedor.getjTFNome().setText(fornecedor.getNome());
                this.telaCadastroFornecedor.getjTFCNPJ().setText(fornecedor.getCnpj());
                this.telaCadastroFornecedor.getjTFRazaoSocial().setText(fornecedor.getRazaoSocial());
                this.telaCadastroFornecedor.getjTFInscricaoEstadual().setText(fornecedor.getInscricaoEstadual());
                this.telaCadastroFornecedor.getjTFID().setEnabled(false);
            }
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBSair()){
            this.telaCadastroFornecedor.dispose();
        }
    }
    
}
