package model;

import java.sql.Date;

public class Confirmacao {
    
    private int codigo_confirmacao;
    private int codigo_pessoa;
    private int codigo_produto;
    private Date data_compra;

     public int getCodigo_confirmacao() {
        return codigo_confirmacao;
    }

    public void setCodigo_confirmacao(int codigo_confirmacao) {
        this.codigo_confirmacao = codigo_confirmacao;
    }
    
    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public int getCodigo_pessoa() {
        return codigo_pessoa;
    }

    public void setCodigo_pessoa(int codigo_pessoa) {
        this.codigo_pessoa = codigo_pessoa;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public void setData_compra(String now) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
