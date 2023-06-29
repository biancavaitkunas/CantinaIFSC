package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Produto;
import view.TelaBuscaProduto;
import view.TelaCadastroProduto;


public class ControllerCadastroProduto implements ActionListener {
    TelaCadastroProduto telaCadastroProduto;
    public static int codigo;
    
    public ControllerCadastroProduto (TelaCadastroProduto  telaCadastroProduto){
        this.telaCadastroProduto = telaCadastroProduto;/*global = regional*/
        this.telaCadastroProduto.getjBNovo().addActionListener(this);
        this.telaCadastroProduto.getjBSair().addActionListener(this);
        this.telaCadastroProduto.getjBBuscar().addActionListener(this);
        this.telaCadastroProduto.getjBCancelar().addActionListener(this);
        this.telaCadastroProduto.getjBGravar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getjPRodape());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroProduto.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroProduto.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroProduto.getjPRodape());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroProduto.getjPCorpo());
            this.telaCadastroProduto.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroProduto.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroProduto.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroProduto.getjBGravar()){
            
            Produto produto = new Produto();
            produto.setId(DAO.ClasseDados.listaCarteirinha.size() + 1);
            produto.setDescricao(this.telaCadastroProduto.getjTFDescricao().getText());
            produto.setCodigoBarra(this.telaCadastroProduto.getjTFCodigoBarra().getText());
            
            if (this.telaCadastroProduto.getjTFID().getText().equalsIgnoreCase("")){
                DAO.ClasseDados.listaProduto.add(produto);
            } else {
                
            }
            
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroProduto.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroProduto.getjBBuscar()){
            codigo = 0;
            TelaBuscaProduto telaBuscaProduto = new TelaBuscaProduto (null, true);
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(telaBuscaProduto);
            telaBuscaProduto.setVisible(true);
            
            if(codigo != 0){
                Produto produto = new Produto();
                produto = DAO.ClasseDados.listaProduto.get(codigo-1);
                utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getjPRodape());
                utilities.Utilities.limpaComponentes(false, this.telaCadastroProduto.getjPCorpo());
                
                this.telaCadastroProduto.getjTFID().setText(produto.getId() + "");
                this.telaCadastroProduto.getjTFDescricao().setText(produto.getDescricao());
                this.telaCadastroProduto.getjTFCodigoBarra().setText(produto.getCodigoBarra());
                this.telaCadastroProduto.getjTFID().setEnabled(false);
            }
            
        } else if (e.getSource() == this.telaCadastroProduto.getjBSair()){
            this.telaCadastroProduto.dispose();
        }
    }
    
}
