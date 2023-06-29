package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroCliente;

import view.TelaBuscaCliente;
public class ControllerCadastroCliente implements ActionListener{
    
    TelaCadastroCliente  telaCadastroCliente;
    
    public ControllerCadastroCliente (TelaCadastroCliente  telaCadastroCliente){
        
        this.telaCadastroCliente = telaCadastroCliente;
        this.telaCadastroCliente = telaCadastroCliente;/*global = regional*/
        this.telaCadastroCliente.getjBNovo().addActionListener(this);
        this.telaCadastroCliente.getjBSair().addActionListener(this);
        this.telaCadastroCliente.getjBBuscar().addActionListener(this);
        this.telaCadastroCliente.getjBCancelar().addActionListener(this);
        this.telaCadastroCliente.getjBGravar().addActionListener(this);
        
        utilities.utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
        utilities.utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroCliente.getjBNovo()){
            utilities.utilities.ativaDesativa(true, this.telaCadastroCliente.getjPRodape());
            utilities.utilities.limpaComponentes(false, this.telaCadastroCliente.getjPCorpo());
        }else if (e.getSource() == this.telaCadastroCliente.getjBCancelar()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroCliente.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroCliente.getjPCorpo());
        } else if (e.getSource() == this.telaCadastroCliente.getjBGravar()){
            utilities.utilities.ativaDesativa(false, this.telaCadastroCliente.getjPRodape());
            utilities.utilities.limpaComponentes(true, this.telaCadastroCliente.getjPCorpo());
        } else if (e.getSource() == this.telaCadastroCliente.getjBBuscar()){
            TelaBuscaCliente telaBuscaCliente = new TelaBuscaCliente (null, true);
            //Inserir o controller da busca d bairros
            telaBuscaCliente.setVisible(true);
        } else if (e.getSource() == this.telaCadastroCliente.getjBSair()){
            this.telaCadastroCliente.dispose();
        }
    }
    
    
}
