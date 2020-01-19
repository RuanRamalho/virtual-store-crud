package dao;

import model.Carrinho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CarrinhoDao {

private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Carrinho> lista = new ArrayList<Carrinho>();

public CarrinhoDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Carrinho carrinho) {
    String sql = "INSERT INTO Carrinho "
              + "(CODIGO_PESSOA, CODIGO_PRODUTO,"
              + "PRECO_PRODUTO, DESCRICAO_PRODUTO) "
              + "VALUES (?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, carrinho.getCodigo_pessoa());
        stmt.setInt(2, carrinho.getCodigo_produto());
        stmt.setDouble(3, carrinho.getPreco_produto());
        stmt.setString(4, carrinho.getDescricao_produto());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void excluir (int valor) {
        String sql = "delete from carrinho where codigo_carrinho = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public void esvaziar() {
        String sql = "truncate carrinho";
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public ArrayList <Carrinho> Listartodos(int codigo){
        String sql = "select * from carrinho where codigo_pessoa = "+codigo;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Carrinho carrinho = new Carrinho();
                carrinho.setCodigo_carrinho(rs.getInt("codigo_carrinho"));
                carrinho.setCodigo_produto(rs.getInt("codigo_produto"));
                carrinho.setDescricao_produto(rs.getString("descricao_produto"));
                carrinho.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                carrinho.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(carrinho);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Carrinho> ListartodosDescricao(String valor){
        String sql = "select * from produto where preco_produto like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Carrinho carrinho = new Carrinho();
                carrinho.setCodigo_produto(rs.getInt("codigo_produto"));
                carrinho.setDescricao_produto(rs.getString("descricao_produto"));
                carrinho.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                carrinho.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(carrinho);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}
