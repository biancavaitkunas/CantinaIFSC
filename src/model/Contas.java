package model;

public class Contas {

    private int id;
    private String dataHoraEmissao;
    private String dataVencimento;
    private String dataQuitacao;
    private float valorEmitido;
    private float valorDesconto;
    private float valorCrescimento;
    private float valorQuitado;
    private char flagTipoConta;
    private String observacao;
    private char status;

    private Venda venda;
    private Compra compra;

    public Contas() {
    }

    public Contas(int id, String dataHoraEmissao, String dataVencimento, String dataQuitacao, float valorEmitido, float valorDesconto, float valorCrescimento, float valorQuitado, char flagTipoConta, String observacao, char status, Venda venda, Compra compra) {
        this.id = id;
        this.dataHoraEmissao = dataHoraEmissao;
        this.dataVencimento = dataVencimento;
        this.dataQuitacao = dataQuitacao;
        this.valorEmitido = valorEmitido;
        this.valorDesconto = valorDesconto;
        this.valorCrescimento = valorCrescimento;
        this.valorQuitado = valorQuitado;
        this.flagTipoConta = flagTipoConta;
        this.observacao = observacao;
        this.status = status;
        this.venda = venda;
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(String dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(String dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorCrescimento() {
        return valorCrescimento;
    }

    public void setValorCrescimento(float valorCrescimento) {
        this.valorCrescimento = valorCrescimento;
    }

    public float getValorQuitado() {
        return valorQuitado;
    }

    public void setValorQuitado(float valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public String getObservacao() {
        return observacao;
    }

    public char getFlagTipoConta() {
        return flagTipoConta;
    }

    public void setFlagTipoConta(char flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return this.getId() + "/n , "
                + this.getDataHoraEmissao() + "/n , "
                + this.getDataVencimento() + "/n , "
                + this.getDataQuitacao() + "/n , "
                + this.getValorEmitido() + "/n , "
                + this.getValorDesconto() + "/n , "
                + this.getValorCrescimento() + "/n , "
                + this.getValorQuitado() + "/n , "
                + this.getFlagTipoConta() + "/n , "
                + this.venda.getId() + "/n , "
                + this.compra.getNumeroNF() + "/n , "
                + this.getObservacao() + "/n , "
                + this.getStatus();
    }

}
