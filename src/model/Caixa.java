package model;

public class Caixa {

    private int id;
    private String dataHoraAbertura;
    private String dataHoraFechamento;
    private float valorAbertuda;
    private float valorFechamento;
    private String observacao;
    private char status;

    private Funcionario funcionario;

    public Caixa() {
    }

    public Caixa(int id, String dataHoraAbertura, String dataHoraFechamento, float valorAbertuda, float valorFechamento, String observacao, char status, Funcionario funcionario) {
        this.id = id;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.valorAbertuda = valorAbertuda;
        this.valorFechamento = valorFechamento;
        this.observacao = observacao;
        this.status = status;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public void setDataHoraAbertura(String dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public float getValorAbertuda() {
        return valorAbertuda;
    }

    public void setValorAbertuda(float valorAbertuda) {
        this.valorAbertuda = valorAbertuda;
    }

    public float getValorFechamento() {
        return valorFechamento;
    }

    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
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

    public void setStatus(char status) {
        this.status = status;
    }

    public String getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public void setDataHoraFechamento(String dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
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
                + this.getDataHoraAbertura() + "/n , "
                + this.getDataHoraFechamento() + "/n , "
                + this.getValorAbertuda() + "/n , "
                + this.getValorFechamento() + "/n , "
                + this.getObservacao() + "/n , "
                + this.funcionario.getId() + "/n , "
                + this.getStatus();
    }

}
