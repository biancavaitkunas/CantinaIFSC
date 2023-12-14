package model;

public class Produto {

    private int id;
    private String descricao;
    private String codigoBarra;
    private char status;
    private float valorUnitario;

    public Produto() {
    }

    public Produto(int id, String descricao, String codigoBarra, char status, float valorUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.status = status;
        this.valorUnitario = valorUnitario;
    }
    
    public Produto(int id, String descricao, String codigoBarra) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    

    @Override
    public String toString() {
        return this.getId() + "/n , "
                + this.getDescricao() + "/n , "
                + this.getCodigoBarra() + "/n , "
                + this.getStatus();

    }

}
