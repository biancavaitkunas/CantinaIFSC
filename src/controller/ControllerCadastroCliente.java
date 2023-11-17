package controller;

import static controller.ControllerCadastroBairro.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Cliente;
import utilities.Utilities;
import view.TelaCadastroCliente;

import view.TelaBuscaCliente;
public class ControllerCadastroCliente implements ActionListener{
    
    TelaCadastroCliente  telaCadastroCliente;
    public static int codigo;
    
    public ControllerCadastroCliente (TelaCadastroCliente  telaCadastroCliente){
        
        this.telaCadastroCliente = telaCadastroCliente;
        this.telaCadastroCliente = telaCadastroCliente;/*global = regional*/
        this.telaCadastroCliente.getjBNovo().addActionListener(this);
        this.telaCadastroCliente.getjBSair().addActionListener(this);
        this.telaCadastroCliente.getjBBuscar().addActionListener(this);
        this.telaCadastroCliente.getjBCancelar().addActionListener(this);
        this.telaCadastroCliente.getjBGravar().addActionListener(this);
        
        List<Endereco> listaEnderecos = new ArrayList<Endereco>();
        
        listaEnderecos = Service.EnderecoService.carregar();

        this.telaCadastroCliente.getjCBCep().removeAll();

        for (Endereco cidadeAtual : listaEnderecos) {
            this.telaCadastroCliente.getjCBCep().addItem(cidadeAtual.getLogradouro());
        }
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroCliente.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPCorpo());
            this.telaCadastroCliente.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroCliente.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCliente.getjBGravar()){
            
            Cliente cliente = new Cliente();
            cliente.setNome(this.telaCadastroCliente.getjTFNome().getText());
            cliente.setCpf(this.telaCadastroCliente.getjTFCPF().getText());
            cliente.setMatricula(this.telaCadastroCliente.getjTFMatricula().getText());
            cliente.setComplementoEndereco(this.telaCadastroCliente.getjTFComplemento().getText());
            cliente.setDataNascimento(this.telaCadastroCliente.getjTFDataNascimento().getText());
            cliente.setMatricula(this.telaCadastroCliente.getjTFMatricula().getText());
            cliente.setFone1(this.telaCadastroCliente.getjTFTelefone1().getText());
            cliente.setFone2(this.telaCadastroCliente.getjTFTelefone2().getText());
            cliente.setRg(this.telaCadastroCliente.getjTFRg().getText());
            cliente.setComplementoEndereco(this.telaCadastroCliente.getjTFComplemento().getText());
            
            cliente.setEndereco(Service.EnderecoService.carregar("logradouro", this.telaCadastroCliente.getjCBCep().getSelectedItem() + "").get(0));

            if (this.telaCadastroCliente.getjTFID().getText().equalsIgnoreCase("")){
                Service.ClienteService.adicionar(cliente);
            }else{
                cliente.setId(Integer.parseInt(this.telaCadastroCliente.getjTFID().getText()));
                Service.ClienteService.atualizar(cliente);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCliente.getjBBuscar()){
            codigo = 0;
            TelaBuscaCliente telaBuscaCliente = new TelaBuscaCliente (null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(telaBuscaCliente);
            telaBuscaCliente.setVisible(true);
            
            if (codigo != 0){
            Cliente  cliente = new Cliente();
            cliente = Service.ClienteService.carregar(codigo);
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPCorpo());
            
            this.telaCadastroCliente.getjTFID().setText(cliente.getId() + "");
            this.telaCadastroCliente.getjTFNome().setText(cliente.getNome());
            this.telaCadastroCliente.getjTFCPF().setText(cliente.getCpf());
            this.telaCadastroCliente.getjTFMatricula().setText(cliente.getMatricula());
            this.telaCadastroCliente.getjTFComplemento().setText(cliente.getComplementoEndereco());
            this.telaCadastroCliente.getjTFTelefone1().setText(cliente.getFone1());
            this.telaCadastroCliente.getjTFTelefone2().setText(cliente.getFone2());
            this.telaCadastroCliente.getjTFEmail().setText(cliente.getEmail());
            this.telaCadastroCliente.getjTFRg().setText(cliente.getRg());
            this.telaCadastroCliente.getjTFDataNascimento().setText(cliente.getDataNascimento());
            this.telaCadastroCliente.getjTFID().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroCliente.getjBSair()){
            this.telaCadastroCliente.dispose();
        }
    }
    
    
}
