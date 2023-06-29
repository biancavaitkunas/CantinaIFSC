package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
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
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroCliente.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPRodape());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPCorpo());
            this.telaCadastroCliente.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroCliente.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCliente.getjBGravar()){
            
            Cliente cliente = new Cliente();
            cliente.setId(DAO.ClasseDados.listaCidade.size() +1);
            cliente.setNome(this.telaCadastroCliente.getjTFNome().getText());
            cliente.setCpf(this.telaCadastroCliente.getjTFCPF().getText());
            cliente.setMatricula(this.telaCadastroCliente.getjTFMatricula().getText());

            if (this.telaCadastroCliente.getjTFID().getText().equalsIgnoreCase("")){
            DAO.ClasseDados.listaCliente.add(cliente);
            }else{
            //inserir codigo para alterar na lista
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCliente.getjBBuscar()){
            codigo = 0;
            TelaBuscaCliente telaBuscaCliente = new TelaBuscaCliente (null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(telaBuscaCliente);
            telaBuscaCliente.setVisible(true);
            
            if (codigo != 0){
            Cliente  cliente = new Cliente();
            cliente = DAO.ClasseDados.listaCliente.get(codigo-1);
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
            
            this.telaCadastroCliente.getjTFID().setText(cliente.getId() + " ");
            this.telaCadastroCliente.getjTFNome().setText(cliente.getNome());
            this.telaCadastroCliente.getjTFCPF().setText(cliente.getCpf());
            this.telaCadastroCliente.getjTFMatricula().setText(cliente.getMatricula());
            this.telaCadastroCliente.getjTFID().setEnabled(false);
            }

            
        } else if (e.getSource() == this.telaCadastroCliente.getjBSair()){
            this.telaCadastroCliente.dispose();
        }
    }
    
    
}
