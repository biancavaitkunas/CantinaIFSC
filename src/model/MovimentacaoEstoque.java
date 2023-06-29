package model;

public class MovimentacaoEstoque {

    private int id;
    private String dataHoraMovimentacao;
    private char flagTipoMovimento;
    private int qntMovimentada;
    private String observacao;
    private char status;

    private ItemCompra itemCompra;
    private Produto produto;
    private ItemVenda itemVenda;
    private Funcionario funcionario;

    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(int id, String dataHoraMovimentacao, char flagTipoMovimento, int qntMovimentada, String observacao, char status, ItemCompra itemCompra, Produto produto, ItemVenda itemVenda, Funcionario funcionario) {
        this.id = id;
        this.dataHoraMovimentacao = dataHoraMovimentacao;
        this.flagTipoMovimento = flagTipoMovimento;
        this.qntMovimentada = qntMovimentada;
        this.observacao = observacao;
        this.status = status;
        this.itemCompra = itemCompra;
        this.produto = produto;
        this.itemVenda = itemVenda;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraMovimentacao() {
        return dataHoraMovimentacao;
    }

    public void setDataHoraMovimentacao(String dataHoraMovimentacao) {
        this.dataHoraMovimentacao = dataHoraMovimentacao;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public int getQntMovimentada() {
        return qntMovimentada;
    }

    public void setQntMovimentada(int qntMovimentada) {
        this.qntMovimentada = qntMovimentada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char Status) {
        this.status = status;
    }

    public ItemCompra getItemCompra() {
        return itemCompra;
    }

    public void setItemCompra(ItemCompra itemCompra) {
        this.itemCompra = itemCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemVenda getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return this.getId() + "/n , "
                + this.getDataHoraMovimentacao() + "/n , "
                + this.getFlagTipoMovimento() + "/n , "
                + this.getQntMovimentada() + "/n , "
                + this.getObservacao() + "/n , "
                + this.itemCompra.getId() + "/n , "
                + this.produto.getId() + "/n , "
                + this.itemVenda.getId() + "/n , "
                + this.funcionario.getId() + "/n , "
                + this.getStatus();
    }

}
