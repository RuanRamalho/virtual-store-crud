package table;

import model.Pessoa;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PessoaTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO_PESSOA = 0;
    public static final int COL_NOME_PESSOA = 1;
    public static final int COL_CPF_PESSOA = 2;
    public static final int COL_ENDERECO_PESSOA = 3;
    public static final int COL_EMAIL_PESSOA = 4;
    public static final int COL_SENHA_PESSOA = 5;
    
    public ArrayList <Pessoa> lista;

    public PessoaTableModel (ArrayList<Pessoa> l){
        lista = new ArrayList<Pessoa> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Pessoa pessoa = lista.get(linhas);
        if (colunas == COL_CODIGO_PESSOA) return pessoa.getCodigo_pessoa();
        if (colunas == COL_NOME_PESSOA) return pessoa.getNome_pessoa();
        if (colunas == COL_CPF_PESSOA) return pessoa.getCpf_pessoa();
        if (colunas == COL_ENDERECO_PESSOA) return pessoa.getEndereco_pessoa();
        if (colunas == COL_EMAIL_PESSOA) return pessoa.getEmail_pessoa();
        if (colunas == COL_SENHA_PESSOA) return pessoa.getSenha_pessoa();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO_PESSOA) return "Codigo";
        if (colunas == COL_NOME_PESSOA) return "Nome";
        if (colunas == COL_CPF_PESSOA) return "CPF";
        if (colunas == COL_ENDERECO_PESSOA) return "Endereço";
        if (colunas == COL_EMAIL_PESSOA) return "Email";
        if (colunas == COL_SENHA_PESSOA) return "Senha";
        return "";
    } 


}
