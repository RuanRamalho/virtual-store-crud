
package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Connection getConexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projeto_oficial", "root", "");
        } 
        catch (Exception erro){
            throw new RuntimeException("Erro 1: " + erro );
        }
    }

}
