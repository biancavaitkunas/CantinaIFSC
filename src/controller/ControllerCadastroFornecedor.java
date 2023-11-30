package controller;

import static controller.ControllerCadastroCarteirinha.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Fornecedor;
import utilities.Utilities;
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
        
        List<Endereco> listaEnderecos = new ArrayList<Endereco>();
        
        listaEnderecos = Service.EnderecoService.carregar();

        this.telaCadastroFornecedor.getjFTFCep().removeAll();

        for (Endereco cidadeAtual : listaEnderecos) {
            //this.telaCadastroFornecedor.getjFTFCep().addItem(cidadeAtual.getLogradouro());
        }
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroFornecedor.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPCorpo());
            this.telaCadastroFornecedor.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroFornecedor.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBGravar()){
            
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(DAO.ClasseDados.listaBairro.size() + 1);
            fornecedor.setNome(this.telaCadastroFornecedor.getjTFNome().getText());
            fornecedor.setCnpj(this.telaCadastroFornecedor.getjFTFCep().getText());
            fornecedor.setRazaoSocial(this.telaCadastroFornecedor.getjTFRazaoSocial().getText());
            fornecedor.setInscricaoEstadual(this.telaCadastroFornecedor.getjTFInscricaoEstadual().getText());
            fornecedor.setEmail(this.telaCadastroFornecedor.getjTFEmail().getText());
            fornecedor.setFone1(this.telaCadastroFornecedor.getjTFTelefone1().getText());
            fornecedor.setFone2(this.telaCadastroFornecedor.getjTFTelefone2().getText());
            fornecedor.setComplementoEndereco(this.telaCadastroFornecedor.getjTFComplemento().getText());
            fornecedor.setStatus(this.telaCadastroFornecedor.getjRBAtivo().getText().charAt(0));
            
            //fornecedor.setEndereco(Service.EnderecoService.carregar("logradouro", this.telaCadastroFornecedor.getjFTFCep().getSelectedItem() + "").get(0));
            
            if (this.telaCadastroFornecedor.getjTFID().getText().equalsIgnoreCase("")){
                Service.FornecedorService.adicionar(fornecedor);
            }else{
                fornecedor.setId(Integer.parseInt(this.telaCadastroFornecedor.getjTFID().getText()));
              Service.FornecedorService.atualizar(fornecedor);
            }
            
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBBuscar()){
            codigo = 0;
            TelaBuscaFornecedor telaBuscaFornecedor = new TelaBuscaFornecedor (null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(telaBuscaFornecedor);
            telaBuscaFornecedor.setVisible(true);
            
            if(codigo != 0){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor = Service.FornecedorService.carregar(codigo);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPRodape());
                Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPCorpo());
                
                this.telaCadastroFornecedor.getjTFID().setText(fornecedor.getId() + "");
                this.telaCadastroFornecedor.getjTFNome().setText(fornecedor.getNome());
                this.telaCadastroFornecedor.getjFTFCep().setText(fornecedor.getCnpj());
                this.telaCadastroFornecedor.getjTFRazaoSocial().setText(fornecedor.getRazaoSocial());
                this.telaCadastroFornecedor.getjTFInscricaoEstadual().setText(fornecedor.getInscricaoEstadual());
                this.telaCadastroFornecedor.getjTFEmail().setText(fornecedor.getEmail());
                this.telaCadastroFornecedor.getjTFTelefone1().setText(fornecedor.getFone1());
                this.telaCadastroFornecedor.getjTFTelefone2().setText(fornecedor.getFone2());
                this.telaCadastroFornecedor.getjTFComplemento().setText(fornecedor.getComplementoEndereco());
                this.telaCadastroFornecedor.getjTFID().setEnabled(false);
            }
            
        } else if (e.getSource() == this.telaCadastroFornecedor.getjBSair()){
            this.telaCadastroFornecedor.dispose();
        }
    }
    
}
