package dao;

import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDao {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Produto> lista = new ArrayList<Produto>();
    
public ProdutoDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Produto produto) {
    String sql = "INSERT INTO PRODUTO (DESCRICAO_PRODUTO, PRECO_PRODUTO) VALUES (? , ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, produto.getDescricao_produto());
        stmt.setDouble(2, produto.getPreco_produto());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Produto produto) {
        String sql = "UPDATE PRODUTO set DESCRICAO_PRODUTO = ?, PRECO_PRODUTO = ? WHERE CODIGO_PRODUTO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, produto.getDescricao_produto());
            stmt.setDouble(2, produto.getPreco_produto());
            stmt.setInt(3, produto.getCodigo_produto());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "delete from produto where codigo_produto = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Produto> Listartodos(){
        String sql = "select * from produto";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Produto produto = new Produto();
                produto.setCodigo_produto(rs.getInt("codigo_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Produto> ListartodosDescricao(String valor){
        String sql = "select * from produto where descricao_produto like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Produto produto = new Produto();
                produto.setCodigo_produto(rs.getInt("codigo_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}



    
 