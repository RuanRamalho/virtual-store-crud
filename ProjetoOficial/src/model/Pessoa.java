
package model;


public class Pessoa {
    
    private int codigo_pessoa;
    private String nome_pessoa;
    private String cpf_pessoa;
    private String endereco_pessoa;
    private String email_pessoa;
    private String senha_pessoa;

    public String getSenha_pessoa() {
        return senha_pessoa;
    }

    public void setSenha_pessoa(String senha_pessoa) {
        this.senha_pessoa = senha_pessoa;
    }

    public int getCodigo_pessoa() {
        return codigo_pessoa;
    }

    public void setCodigo_pessoa(int codigo_pessoa) {
        this.codigo_pessoa = codigo_pessoa;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getCpf_pessoa() {
        return cpf_pessoa;
    }

    public void setCpf_pessoa(String cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }

    public String getEndereco_pessoa() {
        return endereco_pessoa;
    }

    public void setEndereco_pessoa(String endereco_pessoa) {
        this.endereco_pessoa = endereco_pessoa;
    }

    public String getEmail_pessoa() {
        return email_pessoa;
    }

    public void setEmail_pessoa(String email_pessoa) {
        this.email_pessoa = email_pessoa;
    }

        
}
