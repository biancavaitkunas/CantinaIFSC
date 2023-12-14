package model;

import java.util.Date;


public class Venda {

    private int id;
    private Date dataHoraVenda;
    private float valorDesconto;
    private String flagTipoDesconto;
    private String observacao;
    private char status;

    private Carteirinha carteirinha;
    private Funcionario funcionario;

    public Venda() {
    }

    public Venda(int id, Date dataHoraVenda, float valorDesconto, String flagTipoDesconto, String observacao, char status, Carteirinha carteirinha, Funcionario funcionario) {
        this.id = id;
        this.dataHoraVenda = dataHoraVenda;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.observacao = observacao;
        this.status = status;
        this.carteirinha = carteirinha;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraVenda() {
        return dataHoraVenda;
    }

    public void setDataHoraVenda(Date dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(String flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
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

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(Carteirinha carteirinha) {
        this.carteirinha = carteirinha;
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
                + this.getDataHoraVenda() + "/n , "
                + this.getValorDesconto() + "/n , "
                + this.getFlagTipoDesconto() + "/n , "
                + this.getObservacao() + "/n , "
                + this.carteirinha.getCliente()+ "/n , "
                + this.funcionario.getId() + "/n , "
                + this.getStatus();
    }
}
