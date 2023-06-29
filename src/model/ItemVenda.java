package model;

public class ItemVenda {

    private int id;
    private int qntProduto;
    private float valorDesconto;
    private char status;

    private Venda venda;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(int id, int qntProduto, float valorDesconto, char status, Venda venda, Produto produto) {
        this.id = id;
        this.qntProduto = qntProduto;
        this.valorDesconto = valorDesconto;
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

    public int getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(int qntProduto) {
        this.qntProduto = qntProduto;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
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
    
    @Override
    public String toString() {
        return this.getId() + "/n , "
                + this.getQntProduto() + "/n , "
                + this.getValorDesconto() + "/n , "
                + this.venda.getId() + "/n , "
                + this.produto.getId() + "/n , "
                + this.getStatus();
    }

}
