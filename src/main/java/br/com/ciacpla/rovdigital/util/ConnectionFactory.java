package br.com.ciacpla.rovdigital.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private static Connection conexao;
    private static final String URL_CONNECTION = "jdbc:postgresql://localhost/rovdb";
    private static final String USER = "postgres";
    private static final String PSW = "postgres";
    
    public static Connection getConexao() {
        if(conexao == null) {
            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(URL_CONNECTION, USER, PSW);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexao;
    }
    
    public static void closeConexao(){
        if(conexao != null){
            try {
                conexao.close();
                conexao = null;
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
