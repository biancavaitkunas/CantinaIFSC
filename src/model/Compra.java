package model;

public class Compra {

    private int id;
    private int numeroNF;
    private String dataHoraCompra;
    private float valorDesconto;
    private char flagTipoDesconto;
    private char status;
    private String observacao;

    private Fornecedor fornecedor;

    public Compra() {
    }

    public Compra(int id, int numeroNF, String dataHoraCompra, float valorDesconto, char flagTipoDesconto, char status, String observacao, Fornecedor fornecedor) {
        this.id = id;
        this.numeroNF = numeroNF;
        this.dataHoraCompra = dataHoraCompra;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.status = status;
        this.observacao = observacao;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(int numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return this.getId() + "/n , "
                + this.getNumeroNF() + "/n , "
                + this.getDataHoraCompra() + "/n , "
                + this.getDataHoraCompra() + "/n , "
                + this.getValorDesconto() + "/n , "
                + this.getFlagTipoDesconto() + "/n , "
                + this.fornecedor.getCnpj() + "/n , "
                + this.getStatus() + "/n , "
                + this.getObservacao();
    }

}
