package model;

public class Funcionario extends Pessoa {

    private String cpf;
    private String rg;
    private String usuario;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, String usuario, String senha, int id, String nome, String fone1, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Funcionario(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
        this.rg = rg;
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString() + "/n ,"
                + this.getCpf() + "/n ,"
                + this.getRg() + "/n ,"
                + this.getUsuario() + "/n ,"
                + this.getSenha();
    }

}
