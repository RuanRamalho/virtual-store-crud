/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Pagamento;
import model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Dário Felipe
 */
public class PagamentoDao {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Pagamento> lista = new ArrayList<Pagamento>();

public PagamentoDao(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Pagamento pagamento) {
    String sql = "INSERT INTO PAGAMENTO (NOME_TITULAR, NUMERO_CARTAO, CODIGO_PESSOA) VALUES (? , ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, pagamento.getNome_titular());
        stmt.setString(2, pagamento.getNumero_cartao());
        stmt.setInt(3, pagamento.getCodigo_pessoa());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}

public void alterar(Pagamento pagamento) {
        String sql = "UPDATE PAGAMENTO set NOME_TITULAR = ?, NUMERO_CARTAO = ? WHERE CODIGO_PAGAMENTO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, pagamento.getNome_titular());
            stmt.setString(2, pagamento.getNumero_cartao());
            stmt.setInt(3, pagamento.getCodigo_pagamento());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }


public void excluir (int valor) {
        String sql = "delete from pagamento where codigo_pagamento = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

public ArrayList <Pagamento> Listartodos(int codigo){
        String sql = "select * from pagamento where codigo_pessoa = " +codigo;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Pagamento pagamento = new Pagamento();
                pagamento.setCodigo_pagamento(rs.getInt("codigo_pagamento"));
                pagamento.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
                pagamento.setNome_titular(rs.getString("nome_titular"));
                pagamento.setNumero_cartao(rs.getString("numero_cartao"));
                lista.add(pagamento);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }

public ArrayList <Pagamento> ListartodosDescricao(String valor){
        String sql = "select * from pagamento where nome_titular like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Pagamento pagamento = new Pagamento();
                pagamento.setCodigo_pagamento(rs.getInt("codigo_pagamento"));
                pagamento.setNome_titular(rs.getString("nome_titular"));
                pagamento.setNumero_cartao(rs.getString("numero_cartao"));
                lista.add(pagamento);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
    
}
