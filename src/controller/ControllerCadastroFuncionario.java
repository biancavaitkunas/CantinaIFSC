package controller;

import static controller.ControllerCadastroFornecedor.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Funcionario;
import utilities.Utilities;
import view.TelaBuscaFuncionario;
import view.TelaCadastroFuncionario;

public class ControllerCadastroFuncionario implements ActionListener {
    TelaCadastroFuncionario telaCadastroFuncionario;
    public static int codigo;
    
    public ControllerCadastroFuncionario (TelaCadastroFuncionario  telaCadastroFuncionario){
        this.telaCadastroFuncionario = telaCadastroFuncionario;/*global = regional*/
        this.telaCadastroFuncionario.getjBNovo().addActionListener(this);
        this.telaCadastroFuncionario.getjBSair().addActionListener(this);
        this.telaCadastroFuncionario.getjBBuscar().addActionListener(this);
        this.telaCadastroFuncionario.getjBCancelar().addActionListener(this);
        this.telaCadastroFuncionario.getjBGravar().addActionListener(this);
        
        List<Endereco> listaEnderecos = new ArrayList<Endereco>();
        
        listaEnderecos = Service.EnderecoService.carregar();

        this.telaCadastroFuncionario.getjCBCep().removeAll();

        for (Endereco cidadeAtual : listaEnderecos) {
            this.telaCadastroFuncionario.getjCBCep().addItem(cidadeAtual.getLogradouro());
        }
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroFuncionario.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPCorpo());
            
            this.telaCadastroFuncionario.getjTFID().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBGravar()) {

            Funcionario funcionario = new Funcionario();
            funcionario.setId(DAO.ClasseDados.listaBairro.size() + 1);
            funcionario.setNome(this.telaCadastroFuncionario.getjTFNome().getText());
            funcionario.setCpf(this.telaCadastroFuncionario.getjFTFCPF().getText());
            funcionario.setEmail(this.telaCadastroFuncionario.getjTFEmail().getText());
            funcionario.setFone1(this.telaCadastroFuncionario.getjTFTelefone1().getText());
            funcionario.setFone2(this.telaCadastroFuncionario.getjTFTelefone2().getText());
            funcionario.setRg(this.telaCadastroFuncionario.getjTFRg().getText());
            funcionario.setUsuario(this.telaCadastroFuncionario.getjTFUsuario().getText());
            funcionario.setSenha(this.telaCadastroFuncionario.getjTFSenha().getText());
            funcionario.setComplementoEndereco(this.telaCadastroFuncionario.getjTFComplementoEndereco().getText());
            funcionario.setEndereco(Service.EnderecoService.carregar("logradouro", this.telaCadastroFuncionario.getjCBCep().getSelectedItem() + "").get(0));
            
            if(this.telaCadastroFuncionario.getjTFID().getText().equalsIgnoreCase("")){
               Service.FuncionarioService.adicionar(funcionario);
            }else{
              funcionario.setId(Integer.parseInt(this.telaCadastroFuncionario.getjTFID().getText()));
              Service.FuncionarioService.atualizar(funcionario);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBBuscar()) {
            codigo = 0;
            TelaBuscaFuncionario telaBuscaFuncionario = new TelaBuscaFuncionario (null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(telaBuscaFuncionario);
            telaBuscaFuncionario.setVisible(true);

            if (codigo != 0) {
                Funcionario funcionario = new Funcionario();
                funcionario = Service.FuncionarioService.carregar(codigo);
                //funcionario = DAO.ClasseDados.listaFuncionario.get(codigo -1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPRodape());
                Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPCorpo());
                
                this.telaCadastroFuncionario.getjTFID().setText(funcionario.getId() + " ");
                this.telaCadastroFuncionario.getjTFNome().setText(funcionario.getNome());
                this.telaCadastroFuncionario.getjFTFCPF().setText(funcionario.getCpf());
                this.telaCadastroFuncionario.getjTFEmail().setText(funcionario.getEmail());
                this.telaCadastroFuncionario.getjTFTelefone1().setText(funcionario.getFone1());
                this.telaCadastroFuncionario.getjTFTelefone2().setText(funcionario.getFone2());
                this.telaCadastroFuncionario.getjTFComplementoEndereco().setText(funcionario.getComplementoEndereco());
                this.telaCadastroFuncionario.getjTFID().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBSair()) {
            this.telaCadastroFuncionario.dispose();

        }
    }
    
    
    
}
