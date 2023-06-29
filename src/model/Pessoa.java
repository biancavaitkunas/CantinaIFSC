package model;

public abstract class Pessoa {   //abstract impede que a classe seja instanciada 

    private int id;
    private String nome;
    private String fone1;
    private String fone2;
    private String email;
    private char status;
    private String complementoEndereco;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone1, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.status = status;
        this.complementoEndereco = complementoEndereco;
        this.endereco = endereco;
    }
    
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return this.getId() + "/n ,"
                + this.getNome() + "/n ,"
                + this.getFone1() + "/n ,"
                + this.getFone2() + "/n ,"
                + this.getEmail() + "/n ,"
                + this.getComplementoEndereco() + "/n ,"
                + this.endereco.getCidade()+ "/n ,"
                + this.getStatus();

    }

}
