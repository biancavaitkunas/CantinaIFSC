package DAO;

import java.util.ArrayList;
import model.Bairro;
import model.Caixa;
import model.Carteirinha;
import model.Cidade;
import model.Cliente;
import model.Compra;
import model.Contas;
import model.Endereco;
import model.Fornecedor;
import model.Funcionario;
import model.ItemCompra;
import model.ItemVenda;
import model.MovimentacaoEstoque;
import model.Pessoa;
import model.Produto;
import model.Venda;


public class ClasseDados {
    
    private static ClasseDados instance;
    public static ArrayList<Bairro> listaBairro;
    public static ArrayList <Cidade> listaCidade;
    public static ArrayList <Endereco> listaEndereco;
    public static ArrayList <Caixa> caixa;
    public static ArrayList <Carteirinha> listaCarteirinha;
    public static ArrayList <Compra> compras;
    public static ArrayList <Cliente> listaCliente;
    public static ArrayList <Fornecedor> listaFornecedor;
    public static ArrayList <Funcionario> listaFuncionario;
    public static ArrayList <Contas> contas;
    public static ArrayList <ItemCompra> ItensCompra;
    public static ArrayList <ItemVenda> ItensVenda;
    public static ArrayList <MovimentacaoEstoque> MovimentacoesEstoque;
    public static ArrayList <Pessoa> pessoas;
    public static ArrayList <Produto> listaProduto;
    public static ArrayList <Venda> listaVendas;
    
    
    public static synchronized ClasseDados getInstance(){
        if (instance == null){
            instance = new ClasseDados();
        }
        return instance;
    }

    private ClasseDados() {
        listaBairro = new ArrayList<>();
        listaCidade = new ArrayList<>();
        listaEndereco = new ArrayList<>();
        caixa = new ArrayList<>();
        listaCarteirinha = new ArrayList<>();
        compras = new ArrayList<>();
        listaCliente = new ArrayList<>();
        listaFornecedor = new ArrayList<>();
        listaFuncionario = new ArrayList<>();
        contas = new ArrayList<>();
        ItensCompra = new ArrayList<>();
        ItensVenda = new ArrayList<>();
        MovimentacoesEstoque = new ArrayList<>();
        pessoas = new ArrayList<>();
        listaProduto = new ArrayList<>();
        listaVendas = new ArrayList<>();
        Bairro bairro1 = new Bairro(1, "Centro");
        Bairro bairro2 = new Bairro(2, "Santa Bárbara");
        Bairro bairro3 = new Bairro(3, "Humaitá");
        listaBairro.add(bairro1);
        listaBairro.add(bairro2);
        listaBairro.add(bairro3);
        Cidade cidade1 = new Cidade(1, "Tubarão", "SC");
        Cidade cidade2 = new Cidade(2, "Laguna", "SC");
        Cidade cidade3 = new Cidade(3, "São Paulo", "SP");
        listaCidade.add(cidade1);
        listaCidade.add(cidade2);
        listaCidade.add(cidade3);
        Endereco endereco1 = new Endereco(1, "12345-78", "Rua 1", bairro1, cidade1);
        Endereco endereco2 = new Endereco(2, "12345-78", "Rua 2", bairro2, cidade2);
        Endereco endereco3 = new Endereco(3, "12345-78", "Rua 3", bairro3, cidade3);
        listaEndereco.add(endereco1);
        listaEndereco.add(endereco2);
        listaEndereco.add(endereco3);
        Cliente cliente1 = new Cliente (1, "Cliente 1", "235698840", "123.456.789-10");
        Cliente cliente2 = new Cliente (2, "Cliente 2", "235698840", "123.456.789-10");
        Cliente cliente3 = new Cliente (3, "Cliente 3", "235698840", "123.456.789-10");
        listaCliente.add(cliente1);
        listaCliente.add(cliente2);
        listaCliente.add(cliente3);
        Carteirinha carteirinha1 = new Carteirinha(1, "1", "15/05/2022");
        Carteirinha carteirinha2 = new Carteirinha(2, "2", "15/05/2022");
        Carteirinha carteirinha3 = new Carteirinha(3, "3", "15/05/2022");
        listaCarteirinha.add(carteirinha1);
        listaCarteirinha.add(carteirinha2);
        listaCarteirinha.add(carteirinha3);
        Fornecedor fornecedor1 = new Fornecedor (1, "Fornecedor 1", "4587411", "455896", "123456", "48 1234-5678");
        Fornecedor fornecedor2 = new Fornecedor (2, "Fornecedor 1", "7445811", "558946", "123456", "48 1234-5678");
        Fornecedor fornecedor3 = new Fornecedor (3, "Fornecedor 1", "4574181", "894556", "123456", "48 1234-5678");
        listaFornecedor.add(fornecedor1);
        listaFornecedor.add(fornecedor2);
        listaFornecedor.add(fornecedor3);
        Funcionario funcionario1 = new Funcionario(1, "Funcionário 1", "123.456.789-10");
        Funcionario funcionario2 = new Funcionario(2, "Funcionário 2", "123.456.789-10");
        Funcionario funcionario3 = new Funcionario(3, "Funcionário 3", "123.456.789-10");
        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);
        Produto produto1 = new Produto(1, "Coxinha", "123");
        Produto produto2 = new Produto(2, "Risole", "456");
        Produto produto3 = new Produto(3, "Pão de Queijo", "789");
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
    }
    
    
}
