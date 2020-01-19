package dao;

import model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDao {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
boolean check = false;
private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
    
public PessoaDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Pessoa pessoa) {
    String sql = "INSERT INTO PESSOA "
              + "(NOME_PESSOA, CPF_PESSOA,"
              + "ENDERECO_PESSOA, EMAIL_PESSOA, SENHA_PESSOA) "
              + "VALUES (?, ?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, pessoa.getNome_pessoa());
        stmt.setString(2, pessoa.getCpf_pessoa());
        stmt.setString(3, pessoa.getEndereco_pessoa());
        stmt.setString(4, pessoa.getEmail_pessoa());
        stmt.setString(5, pessoa.getSenha_pessoa());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Pessoa pessoa) {
        String sql = "UPDATE PESSOA set NOME_PESSOA = ?, CPF_PESSOA = ?, ENDERECO_PESSOA = ?, EMAIL_PESSOA = ?, SENHA_PESSOA = ? WHERE CODIGO_PESSOA = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, pessoa.getNome_pessoa());
            stmt.setString(2, pessoa.getCpf_pessoa());
            stmt.setString(3, pessoa.getEndereco_pessoa());
            stmt.setString(4, pessoa.getEmail_pessoa());
            stmt.setString(5, pessoa.getSenha_pessoa());
            stmt.setInt(6, pessoa.getCodigo_pessoa());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "delete from pessoa where codigo_pessoa = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Pessoa> Listartodos(){
        String sql = "select * from pessoa";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Pessoa pessoa = new Pessoa();
                pessoa.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
                pessoa.setCpf_pessoa(rs.getString("cpf_pessoa"));
                pessoa.setEndereco_pessoa(rs.getString("endereco_pessoa"));
                pessoa.setEmail_pessoa(rs.getString("email_pessoa"));
                pessoa.setSenha_pessoa(rs.getString("senha_pessoa"));
                lista.add(pessoa);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Pessoa> ListartodosDescricao(String valor){
        String sql = "select * from pessoa where nome_pessoa like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Pessoa pessoa = new Pessoa();
                pessoa.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
                pessoa.setCpf_pessoa(rs.getString("cpf_pessoa"));
                pessoa.setEndereco_pessoa(rs.getString("endereco_pessoa"));
                pessoa.setEmail_pessoa(rs.getString("email_pessoa"));
                pessoa.setSenha_pessoa(rs.getString("senha_pessoa"));
                lista.add(pessoa);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}



    
 