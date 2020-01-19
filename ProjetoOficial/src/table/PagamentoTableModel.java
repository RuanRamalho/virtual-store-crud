/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import model.Pagamento;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 *
 * @author Dário Felipe
 */
public class PagamentoTableModel extends AbstractTableModel {
    
    public static final int COL_CODIGO_PAGAMENTO = 0;
    public static final int COL_CODIGO_PESSOA = 1;
    public static final int COL_NOME_TITULAR = 2;
    public static final int COL_NUMERO_CARTAO = 3;
    public ArrayList <Pagamento> lista;
    
    public PagamentoTableModel (ArrayList<Pagamento> l){
        lista = new ArrayList<Pagamento> (l);
    }
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Pagamento pagamento = lista.get(linhas);
        if (colunas == COL_CODIGO_PAGAMENTO) return pagamento.getCodigo_pagamento();
        if (colunas == COL_CODIGO_PESSOA) return pagamento.getCodigo_pessoa();
        if (colunas == COL_NOME_TITULAR) return pagamento.getNome_titular();
        if (colunas == COL_NUMERO_CARTAO) return pagamento.getNumero_cartao();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO_PAGAMENTO) return "Codigo";
        if (colunas == COL_CODIGO_PESSOA) return "Pessoa";
        if (colunas == COL_NOME_TITULAR) return "Nome do titular";
        if (colunas == COL_NUMERO_CARTAO) return "Numero do cartão";
        return "";
    } 

    
}
