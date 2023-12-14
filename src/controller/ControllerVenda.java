package controller;

import DAO.ItemVendaDAO;
import Service.ItemVendaService;
import Service.ProdutoService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadastroVenda;
import view.TelaCadastroCliente;
import view.TelaCadastroFuncionario;
import view.TelaBuscaCliente;
import view.TelaBuscaFuncionario;
import view.TelaBuscaVenda;
import view.TelaBuscaProduto;
import controller.ControllerBuscaCliente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carteirinha;
import model.Funcionario;
import model.ItemVenda;
import model.Produto;
import model.Venda;
import utilities.Utilities;
import view.TelaBuscaCarteirinha;

public class ControllerVenda implements ActionListener {
    
    TelaCadastroVenda telaCadastroVenda;
    public static int codigo;
    public float valorTotal = 0;
    Venda venda = new Venda();
    private int codVenda = 0;
    private int codFunc = 0;
    private int codCarteirinha = 0;    
    private int codItem = 0;
    private final static SimpleDateFormat sdf = new SimpleDateFormat();
    
    public ControllerVenda (TelaCadastroVenda  telaCadastroVenda){
        
        this.telaCadastroVenda = telaCadastroVenda;/*global = regional*/
        
        this.telaCadastroVenda.getjBNovo().addActionListener(this);
        this.telaCadastroVenda.getjBBuscaCliente().addActionListener(this);
        this.telaCadastroVenda.getjBCadastraCliente().addActionListener(this);
        this.telaCadastroVenda.getjBBuscaFuncionario().addActionListener(this);
        this.telaCadastroVenda.getjBCadastraFuncionario().addActionListener(this);
        this.telaCadastroVenda.getjBBuscaItem().addActionListener(this);
        this.telaCadastroVenda.getjBAdicionar().addActionListener(this);
        this.telaCadastroVenda.getjBFinalizarVenda().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPRodape());
        Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPCorpo());
        this.telaCadastroVenda.getjBBuscaFuncionario().setEnabled(true);
        this.telaCadastroVenda.getjLFuncionario().setEnabled(true);
        this.telaCadastroVenda.getjLCarteirinha().setEnabled(true);
        this.telaCadastroVenda.getjBBuscaCarteirinha().setEnabled(true);
        this.telaCadastroVenda.getjBCadastraFuncionario().setEnabled(true);
        this.telaCadastroVenda.getjBCadastraCarteirinha().setEnabled(true);
        this.telaCadastroVenda.getjFTFData().setText(sdf.format(new Date()));
        this.telaCadastroVenda.getjBNovo().setEnabled(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        TelaBuscaFuncionario telaBuscaFuncionario = new TelaBuscaFuncionario (null, true);
        ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(telaBuscaFuncionario);
        
        TelaBuscaCarteirinha telaBuscaCarteirinha = new TelaBuscaCarteirinha (null, true);
        ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(telaBuscaCarteirinha);
        
        TelaBuscaProduto telaBuscaProduto = new TelaBuscaProduto (null, true);
        ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(telaBuscaProduto);
        
                    List<ItemVenda> listaItens = new ArrayList<ItemVenda>();

        
        if (e.getSource() == this.telaCadastroVenda.getjBBuscaFuncionario()){
            
            telaBuscaFuncionario.setVisible(true);
            this.telaCadastroVenda.getjTFNomeFuncionario().setText(controllerBuscaFuncionario.nomeFuncionario);
            this.telaCadastroVenda.getjTFIdFuncionario().setText(String.valueOf(controllerBuscaFuncionario.func));
            codFunc = controllerBuscaFuncionario.func;
            
        }else if (e.getSource() == this.telaCadastroVenda.getjBBuscaCarteirinha()){
            
            telaBuscaCarteirinha.setVisible(true);
            codCarteirinha = controllerBuscaCarteirinha.codCarteirinha;
            this.telaCadastroVenda.getjTFNomeCliente().setText(controllerBuscaCarteirinha.nomeCliente);
            this.telaCadastroVenda.getjTFCodCarteirinha().setText(String.valueOf(codCarteirinha));
            this.telaCadastroVenda.getjTFCodBarras().setText(String.valueOf(controllerBuscaCarteirinha.codBarras));
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBBuscaItem()){
            
            telaBuscaProduto.setVisible(true);
            codItem = controllerBuscaProduto.codProduto;
            this.telaCadastroVenda.getjTFNomeItem().setText(controllerBuscaProduto.nomeProduto);
            this.telaCadastroVenda.getjTFCodItem().setText(String.valueOf(codItem));
            this.telaCadastroVenda.getjTFValorUnitario().setText(String.valueOf(controllerBuscaProduto.valorUnitarioProduto));
        
        } else if (e.getSource() == this.telaCadastroVenda.getjBNovo()){
            
            if (this.telaCadastroVenda.getjTFIdFuncionario().getText().equals("")){
                JOptionPane.showMessageDialog(telaCadastroVenda, "Selecione o funcionário e a carterinha!");
                
            } else {
                
            this.telaCadastroVenda.getjTFDesconto().setEnabled(true);
            this.telaCadastroVenda.getjTFObservacao().setEnabled(true);
            this.telaCadastroVenda.getjSQuantidade().setEnabled(true);
            this.telaCadastroVenda.getjTFValorUnitario().setEnabled(true);
            this.telaCadastroVenda.getjCBTipoDesconto().setEnabled(true);
            this.telaCadastroVenda.getjBAdicionar().setEnabled(true);
            this.telaCadastroVenda.getjBBuscaItem().setEnabled(true);
            this.telaCadastroVenda.getjLDesconto().setEnabled(true);
            this.telaCadastroVenda.getjLTipoDesconto().setEnabled(true);
            this.telaCadastroVenda.getjLNovoItem().setEnabled(true);
            this.telaCadastroVenda.getjLQtd().setEnabled(true);
            this.telaCadastroVenda.getjLStatus().setEnabled(true);
            this.telaCadastroVenda.getButtonGroup1().getElements().asIterator().forEachRemaining(button -> button.setEnabled(true));
            this.telaCadastroVenda.getjLObservacao().setEnabled(true);
            
            venda.setDataHoraVenda(new Date());
            venda.setObservacao("0");
            venda.setStatus('A');
            venda.setFlagTipoDesconto("S");
            venda.setValorDesconto(0);

            Funcionario funcionario = new Funcionario();
            funcionario.setId(codFunc);
            venda.setFuncionario(funcionario);
            
            Carteirinha carteirinha = new Carteirinha();
            carteirinha.setId(codCarteirinha);
            venda.setCarteirinha(carteirinha);
            
            Service.VendaService.adicionar(venda);
            
          }

            
        }else if (e.getSource() == this.telaCadastroVenda.getjBCancelar()){
            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPRodape());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPCorpo());
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBCadastraCliente()){
            TelaCadastroCliente telacadastroCliente = new TelaCadastroCliente (null, true);
            telacadastroCliente.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBCadastraFuncionario()){
            TelaCadastroFuncionario telacadastroFuncionario = new TelaCadastroFuncionario (null, true);
            telacadastroFuncionario.setVisible(true);
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBAdicionar()){

            ItemVenda item = new ItemVenda();
            item.setValorUnitario(Float.valueOf(this.telaCadastroVenda.getjTFValorUnitario().getText()));
            item.setQtdProduto((int)this.telaCadastroVenda.getjSQuantidade().getValue());
            
            Produto produto = new Produto();
            produto.setId(codItem);
            String desc = Service.ProdutoService.carregar(codigo).getDescricao();
            item.setProduto(produto);
            
            codVenda = Service.VendaService.getMaiorId();
            this.venda.setId(codVenda);
           
            item.setVenda(venda);
            Service.ItemVendaService.adicionar(item);

            listaItens.add(item);
            
            DefaultTableModel tabela = (DefaultTableModel) this.telaCadastroVenda.getjTItens().getModel();
            
            String nome = ProdutoService.carregar(item.getProduto().getId()).getDescricao();
            
            for (ItemVenda itemAtual : listaItens) {
                    tabela.addRow(new Object[]{nome,
                        itemAtual.getQtdProduto(),
                        itemAtual.getValorUnitario(),
                        itemAtual.getValorUnitario()*itemAtual.getQtdProduto()});
                        valorTotal += itemAtual.getValorUnitario()*itemAtual.getQtdProduto();
                }
            
            this.telaCadastroVenda.getjTFNomeItem().setText("");
            this.telaCadastroVenda.getjTFValorUnitario().setText("");
            this.telaCadastroVenda.getjSQuantidade().setValue(0);
            this.telaCadastroVenda.getjTFDesconto().setText("");
            this.telaCadastroVenda.getjTFCodItem().setText("");
            this.telaCadastroVenda.getjFTFValorTotal().setText(String.valueOf(valorTotal));
            
        } else if (e.getSource() == this.telaCadastroVenda.getjBFinalizarVenda()){
            
            this.venda.setId(codVenda);
            this.venda.setValorDesconto(Float.valueOf(this.telaCadastroVenda.getjTFDesconto().getText()));
            this.venda.setObservacao(this.telaCadastroVenda.getjTFObservacao().getText());
            this.venda.setFlagTipoDesconto(this.telaCadastroVenda.getjCBTipoDesconto().getSelectedItem().toString());
            
            if (this.telaCadastroVenda.getjRBAtivo().isSelected()){
                this.venda.setStatus('A');
            } else {
                this.venda.setStatus('I');
            }
            Service.VendaService.atualizar(venda);
            
            JOptionPane.showMessageDialog(telaBuscaProduto, "Compra finalizada com sucesso! \nValor Total: " + valorTotal + 
                    "\nDesconto: " + this.venda.getValorDesconto() + 
                    "\nValor Final: " + (valorTotal - this.venda.getValorDesconto()));
            this.telaCadastroVenda.dispose();

        } else if (e.getSource() == this.telaCadastroVenda.getjBSair()){
            
        }
    }
    
}
