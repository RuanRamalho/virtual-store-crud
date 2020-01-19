package table;

import model.Carrinho;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CarrinhoTableModel extends AbstractTableModel{
    public static final int COL_CODIGO_CARRINHO = 0;
    public static final int COL_CODIGO_PESSOA = 1;
    public static final int COL_CODIGO_PRODUTO = 2;
    public static final int COL_DESCRICAO_PRODUTO = 3;
    public static final int COL_PRECO_PRODUTO = 4;
    public ArrayList <Carrinho> lista;
     
      public CarrinhoTableModel (ArrayList<Carrinho> l){
        lista = new ArrayList<Carrinho> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Carrinho carrinho = lista.get(linhas);
        if (colunas == COL_CODIGO_CARRINHO) return carrinho.getCodigo_carrinho();
        if (colunas == COL_CODIGO_PESSOA) return carrinho.getCodigo_pessoa();
        if (colunas == COL_CODIGO_PRODUTO) return carrinho.getCodigo_produto();
        if (colunas == COL_DESCRICAO_PRODUTO) return carrinho.getDescricao_produto();
        if (colunas == COL_PRECO_PRODUTO) return carrinho.getPreco_produto();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO_CARRINHO) return "Carrinho";
        if (colunas == COL_CODIGO_PESSOA) return "Codigo de Pessoa";
        if (colunas == COL_CODIGO_PRODUTO) return "Codigo de Produto";
        if (colunas == COL_DESCRICAO_PRODUTO) return "Descricao de Produto";
        if (colunas == COL_PRECO_PRODUTO) return "Preço";
        return "";
    } 
}