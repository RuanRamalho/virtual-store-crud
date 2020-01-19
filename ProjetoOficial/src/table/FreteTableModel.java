/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import model.Frete;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
/**
 *
 * @author Dário Felipe
 */
public class FreteTableModel extends AbstractTableModel {
   
    public static final int COL_CODIGO_ENVIO = 0;
    public static final int COL_CODIGO_PESSOA = 1;
    public static final int COL_ENDERECO_PESSOA = 2;
    public static final int COL_COMPLEMENTO = 3;
    public static final int COL_CEP = 4;
    public ArrayList <Frete> lista;
    
 public FreteTableModel (ArrayList<Frete> l){
        lista = new ArrayList<Frete> (l);
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
        Frete frete = lista.get(linhas);
        if (colunas == COL_CODIGO_ENVIO) return frete.getCodigo_envio();
        if (colunas == COL_CODIGO_PESSOA) return frete.getCodigo_pessoa();
        if (colunas == COL_ENDERECO_PESSOA) return frete.getEndereco_pessoa();
        if (colunas == COL_COMPLEMENTO) return frete.getComplemento();
        if (colunas == COL_CEP) return frete.getCep();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO_ENVIO) return "Codigo";
        if (colunas == COL_CODIGO_PESSOA) return "Pessoa";
        if (colunas == COL_ENDERECO_PESSOA) return "Endereço";
        if (colunas == COL_COMPLEMENTO) return "Complemento";
        if (colunas == COL_CEP) return "Cep";
        return "";
    }  
}
