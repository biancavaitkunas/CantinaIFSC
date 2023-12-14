package model;

public class ItemVenda {

    private int id;
    private int qtdProduto;
    private float valorUnitario;
    private char status;

    private Venda venda;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(int id, int qntProduto, float valorDesconto, char status, Venda venda, Produto produto) {
        this.id = id;
        this.qtdProduto = qntProduto;
        this.valorUnitario = valorDesconto;
        this.status = status;
        this.venda = venda;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qntProduto) {
        this.qtdProduto = qntProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorDesconto) {
        this.valorUnitario = valorDesconto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
   

}
