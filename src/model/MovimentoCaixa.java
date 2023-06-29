package model;

public class MovimentoCaixa {

    private int id;
    private String dataHoraMovimento;
    private float valorMovimento;
    private String observacao;
    private char flagTipoMovimento;
    private char status;
   
    private Caixa caixa;
    private Contas contas;

    public MovimentoCaixa() {
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Contas getContas() {
        return contas;
    }

    public void setContas(Contas contas) {
        this.contas = contas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(String dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public float getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getId() + "/n , "
                + this.getDataHoraMovimento() + "/n , "
                + this.getValorMovimento() + "/n , "
                + this.getFlagTipoMovimento() + "/n , "
                + this.caixa.getId() + "/n , "
                + this.contas.getId() + "/n , "
                + this.getObservacao() + "/n , "
                + this.getStatus();
    }

}
