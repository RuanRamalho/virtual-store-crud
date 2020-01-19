package dao;

import model.Confirmacao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConfirmacaoDao {
   
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Confirmacao> lista = new ArrayList<Confirmacao>();
    
public ConfirmacaoDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Confirmacao confirmacao) {
    String sql = "INSERT INTO Confirmacao "
              + "(CODIGO_PESSOA, "
              + " CODIGO_PRODUTO,"
              + " DATA_COMPRA"
              + ") "
              + "VALUES (?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, confirmacao.getCodigo_pessoa());
        stmt.setInt(2, confirmacao.getCodigo_produto());
        stmt.setDate(3, confirmacao.getData_compra());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void excluir (int valor) {
        String sql = "delete from confirmacao where codigo_confirmacao = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    /*
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
*/    
    public ArrayList <Confirmacao> Listartodos(int codigo){
        String sql = "select * from confirmacao where codigo_carrinho = "+codigo;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Confirmacao confirmacao = new Confirmacao();
                confirmacao.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                confirmacao.setCodigo_produto(rs.getInt("codigo_produto"));
                lista.add(confirmacao);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Confirmacao> ListartodosDescricao(String valor){
        String sql = "select * from confirmacao where codigo_carrinho like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Confirmacao confirmacao = new Confirmacao();
                confirmacao.setCodigo_pessoa(rs.getInt("descricao_produto"));
                confirmacao.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                lista.add(confirmacao);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }

}
