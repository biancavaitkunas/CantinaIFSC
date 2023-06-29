package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Funcionario;
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
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
        utilities.Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroFuncionario.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPRodape());
            utilities.Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPCorpo());
            
            this.telaCadastroFuncionario.getjTFID().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBGravar()) {

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(this.telaCadastroFuncionario.getjTFNome().getText());
            funcionario.setCpf(this.telaCadastroFuncionario.getjTFCpf().getText());
            
            if(this.telaCadastroFuncionario.getjTFID().getText().equalsIgnoreCase("")){
               DAO.ClasseDados.listaFuncionario.add(funcionario);
            }else{
              //inserir o código para alterar na lista  
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPRodape());
            utilities.Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPCorpo());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBBuscar()) {
            codigo = 0;
            TelaBuscaFuncionario telaBuscaFuncionario = new TelaBuscaFuncionario (null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(telaBuscaFuncionario);
            telaBuscaFuncionario.setVisible(true);

            if (codigo != 0) {
                Funcionario funcionario = new Funcionario();
                funcionario = DAO.ClasseDados.listaFuncionario.get(codigo -1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPRodape());
                utilities.Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPCorpo());
                
                this.telaCadastroFuncionario.getjTFID().setText(funcionario.getId() + " ");
                this.telaCadastroFuncionario.getjTFNome().setText(funcionario.getNome());
                this.telaCadastroFuncionario.getjTFCpf().setText(funcionario.getCpf());
                this.telaCadastroFuncionario.getjTFID().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBSair()) {
            this.telaCadastroFuncionario.dispose();

        }
    }
    
    
    
}
