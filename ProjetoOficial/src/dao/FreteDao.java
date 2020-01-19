
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Frete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author Dário Felipe
 */
public class FreteDao{
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Frete> lista = new ArrayList<Frete>();
    
public FreteDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Frete frete) {
    String sql = "INSERT INTO Frete "
              + "(ENDERECO_PESSOA,"
              + "CODIGO_PESSOA,"
              + "COMPLEMENTO, "
              + "CEP) "
              + "VALUES (?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, frete.getEndereco_pessoa());
        stmt.setInt(2, frete.getCodigo_pessoa());
        stmt.setString(3, frete.getComplemento());
        stmt.setString(4, frete.getCep());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}

public void alterar(Frete frete) {
        String sql = "UPDATE Frete set ENDERECO_PESSOA = ?, COMPLEMENTO = ?, CEP = ? WHERE CODIGO_ENVIO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, frete.getEndereco_pessoa());
            stmt.setString(2, frete.getComplemento());
            stmt.setString(3, frete.getCep());
            stmt.setInt(4, frete.getCodigo_envio());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "delete from Frete where codigo_envio = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public ArrayList <Frete> Listartodos(int codigo){
        String sql = "select * from Frete where codigo_pessoa = " + codigo;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Frete frete = new Frete();
                frete.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                frete.setCodigo_envio(rs.getInt("codigo_envio"));
                frete.setEndereco_pessoa(rs.getString("endereco_pessoa"));
                frete.setComplemento(rs.getString("complemento"));
                frete.setCep(rs.getString("cep"));
                lista.add(frete);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Frete> ListartodosDescricao(String valor){
        String sql = "select * from Frete where codigo_envio like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Frete frete = new Frete();
                frete.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                frete.setEndereco_pessoa(rs.getString("endereco_pessoa"));
                frete.setComplemento(rs.getString("complemento"));
                frete.setCep(rs.getString("cep"));
                lista.add(frete);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}
