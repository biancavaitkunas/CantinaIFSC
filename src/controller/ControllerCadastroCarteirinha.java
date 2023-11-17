package controller;

import static controller.ControllerCadastroBairro.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Carteirinha;
import model.Cliente;
import utilities.Utilities;
import view.TelaBuscaCarteirinha;
import view.TelaCadastroCarteirinha;


public class ControllerCadastroCarteirinha implements ActionListener {
    TelaCadastroCarteirinha telaCadastroCarteirinha;
    public static int codigo;
    
    public ControllerCadastroCarteirinha (TelaCadastroCarteirinha  telaCadastroCarteirinha){
        this.telaCadastroCarteirinha = telaCadastroCarteirinha;/*global = regional*/
        this.telaCadastroCarteirinha.getjBNovo().addActionListener(this);
        this.telaCadastroCarteirinha.getjBSair().addActionListener(this);
        this.telaCadastroCarteirinha.getjBBuscar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBCancelar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBGravar().addActionListener(this);
        
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        
        listaCliente = Service.ClienteService.carregar();

        this.telaCadastroCarteirinha.getjCBCliente().removeAll();

        for (Cliente bairroAtual : listaCliente) {
            this.telaCadastroCarteirinha.getjComboCliente().addItem(bairroAtual.getNome());
        }

        utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.telaCadastroCarteirinha.getjBNovo()){
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPRodape());
            Utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPCorpo());
            this.telaCadastroCarteirinha.getjTFID().setEnabled(false);
            
        }else if (e.getSource() == this.telaCadastroCarteirinha.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBGravar()){
            
            Carteirinha carteirinha = new Carteirinha();
            carteirinha.setCodigoBarra(this.telaCadastroCarteirinha.getjTFCodigoBarras().getText());
            carteirinha.setDataGeracao(this.telaCadastroCarteirinha.getjFTFDataGeracao().getText());
            carteirinha.setDataCancelamento(this.telaCadastroCarteirinha.getjFTFDataCancelamento().getText());

            carteirinha.setCliente(Service.ClienteService.carregar("nome", this.telaCadastroCarteirinha.getjCBCliente().getSelectedItem() + "").get(0)); 
            
            if (this.telaCadastroCarteirinha.getjLID().getText().equalsIgnoreCase("")){
                Service.CarteirinhaService.adicionar(carteirinha);
            } else {
                carteirinha.setId(Integer.parseInt(this.telaCadastroCarteirinha.getjTFID().getText()));
                Service.CarteirinhaService.atualizar(carteirinha);
            }
            
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBBuscar()){
            codigo = 0;
            TelaBuscaCarteirinha telaBuscaCarteirinha = new TelaBuscaCarteirinha (null, true);
            ControllerBuscaCarteirinha controllerBuscacarteirinha = new ControllerBuscaCarteirinha(telaBuscaCarteirinha);
            telaBuscaCarteirinha.setVisible(true);
            
            if(codigo != 0){
                Carteirinha carteirinha = new Carteirinha();
                carteirinha = Service.CarteirinhaService.carregar(codigo);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPRodape());
                Utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPCorpo());
                
                this.telaCadastroCarteirinha.getjTFID().setText(carteirinha.getId() + "");
                this.telaCadastroCarteirinha.getjTFCodigoBarras().setText(carteirinha.getCodigoBarra());
                this.telaCadastroCarteirinha.getjTFID().setEnabled(false);
            }
            
        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBSair()){
            this.telaCadastroCarteirinha.dispose();
        }
    }
    
}
