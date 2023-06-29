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
    public static ArrayList <Cliente> clientes;
    public static ArrayList <Fornecedor> listaFornecedor;
    public static ArrayList <Funcionario> listaFuncionarios;
    public static ArrayList <Contas> contas;
    public static ArrayList <ItemCompra> ItensCompra;
    public static ArrayList <ItemVenda> ItensVenda;
    public static ArrayList <MovimentacaoEstoque> MovimentacoesEstoque;
    public static ArrayList <Pessoa> pessoas;
    public static ArrayList <Produto> listaProdutos;
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
        clientes = new ArrayList<>();
        listaFornecedor = new ArrayList<>();
        listaFuncionarios = new ArrayList<>();
        contas = new ArrayList<>();
        ItensCompra = new ArrayList<>();
        ItensVenda = new ArrayList<>();
        MovimentacoesEstoque = new ArrayList<>();
        pessoas = new ArrayList<>();
        listaProdutos = new ArrayList<>();
        listaVendas = new ArrayList<>();
        Bairro bairro1 = new Bairro(1, "Centro");
        Bairro bairro2 = new Bairro(2, "Santa bàrbara");
        Bairro bairro3 = new Bairro(3, "Humaitá");
        listaBairro.add(bairro1);
        listaBairro.add(bairro2);
        listaBairro.add(bairro3);
        Cidade cidade1 = new Cidade(8, "Cidade 1", "AA");
        Cidade cidade2 = new Cidade(9, "Cidade 2", "BB");
        Cidade cidade3 = new Cidade(10, "Cidade 3", "CC");
        listaCidade.add(cidade1);
        listaCidade.add(cidade2);
        listaCidade.add(cidade3);
        Endereco endereco1 = new Endereco(4, "123456", "Rua 1", bairro1, cidade1);
        Endereco endereco2 = new Endereco(5, "789456", "Rua 2", bairro2, cidade2);
        Endereco endereco3 = new Endereco(6, "123789", "Rua 3", bairro3, cidade3);
        listaEndereco.add(endereco1);
        listaEndereco.add(endereco2);
        listaEndereco.add(endereco3);
        Cliente cliente1 = new Cliente ("12345678910", "235698840", "1", "01/01/2000", 11, "Cliente 1", "123456", "456789", "Cliente1", 'A', "258", endereco1);
        Cliente cliente2 = new Cliente ("12345678910", "235698840", "1", "01/01/2000", 12, "Cliente 1", "123456", "456789", "Cliente2", 'A', "258", endereco2);
        Cliente cliente3 = new Cliente ("12345678910", "235698840", "1", "01/01/2000", 13, "Cliente 1", "123456", "456789", "Cliente3", 'A', "258", endereco3);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        Carteirinha carteirinha1 = new Carteirinha(20, "456852", "15/05/2022", "04/08/2022", cliente1);
        Carteirinha carteirinha2 = new Carteirinha(21, "456852", "15/05/2022", "04/08/2022", cliente1);
        Carteirinha carteirinha3 = new Carteirinha(22, "456852", "15/05/2022", "04/08/2022", cliente1);
        listaCarteirinha.add(carteirinha1);
        listaCarteirinha.add(carteirinha2);
        listaCarteirinha.add(carteirinha3);
        Fornecedor fornecedor1 = new Fornecedor ("5874222", "4587411", "455896", 14, "Empresa1", "123456", "456789", "empresa1@gmail", 'A', "456", endereco1);
        Fornecedor fornecedor2 = new Fornecedor ("4562147", "7445811", "558946", 15, "Empresa2", "456789", "526987", "empresa2@gmail", 'A', "456", endereco2);
        Fornecedor fornecedor3 = new Fornecedor ("8965744", "4574181", "894556", 16, "Empresa3", "123456", "456789", "empresa3@gmail", 'A', "456", endereco3);
        listaFornecedor.add(fornecedor1);
        listaFornecedor.add(fornecedor2);
        listaFornecedor.add(fornecedor3);
        Funcionario funcionario1 = new Funcionario("4562147", "4587411", "894556", "f123", 17, "Funcionario1", "123456", "456789", "funcionario1@gmail", 'A', "456", endereco1);
        Funcionario funcionario2 = new Funcionario("1236587", "4587411", "894556", "f123", 18, "Funcionario2", "123456", "456789", "funcionario2@gmail", 'A', "456", endereco2);
        Funcionario funcionario3 = new Funcionario("9985474", "4587411", "894556", "f123", 19, "Funcionario3", "123456", "456789", "funcionario3@gmail", 'A', "456", endereco3);
        listaFuncionarios.add(funcionario1);
        listaFuncionarios.add(funcionario2);
        listaFuncionarios.add(funcionario3);
    }
    
    
}
