/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author Dário Felipe
 */
public class Frete {
    
    private int codigo_envio;
    private int codigo_pessoa;

    public int getCodigo_pessoa() {
        return codigo_pessoa;
    }

    public void setCodigo_pessoa(int codigo_pessoa) {
        this.codigo_pessoa = codigo_pessoa;
    }
    private String endereco_pessoa;
    private String complemento;
    private String cep;

    public int getCodigo_envio() {
        return codigo_envio;
    }

    public void setCodigo_envio(int codigo_envio) {
        this.codigo_envio = codigo_envio;
    }

    public String getEndereco_pessoa() {
        return endereco_pessoa;
    }

    public void setEndereco_pessoa(String endereco_pessoa) {
        this.endereco_pessoa = endereco_pessoa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
