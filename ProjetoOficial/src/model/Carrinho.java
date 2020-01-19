package model;


public class Carrinho {
    
    private int codigo_carrinho;

    public int getCodigo_carrinho() {
        return codigo_carrinho;
    }

    public void setCodigo_carrinho(int codigo_carrinho) {
        this.codigo_carrinho = codigo_carrinho;
    }
    private int codigo_pessoa;
    private int codigo_produto;
    private String descricao_produto;
    private double preco_produto;

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
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

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }
    

    public void setPreco_produto(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String codigo_produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}