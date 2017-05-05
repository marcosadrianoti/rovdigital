package br.com.ciacpla.rovdigital.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFabrica {
    private static Connection conexao;
    private static final String URL_CONNECTION = "jdbc:postgresql://localhost:5432/rovdb";
    private static final String USER = "postgres";
    private static final String PSW = "postgres";
    
    public static Connection getConexao() throws ErroSistema{
        if(conexao == null) {
            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(URL_CONNECTION, USER, PSW);
            } catch (SQLException ex) {
                throw new ErroSistema("Não foi possível conectar ao banco de dados", ex);
            } catch (ClassNotFoundException ex) {
                throw new ErroSistema("O driver não foi encontrado", ex);
            }
        }
        return conexao;
    }
    
    public static void closeConexao() throws ErroSistema{
        if(conexao != null){
            try {
                conexao.close();
                conexao = null;
            } catch (SQLException ex) {
                throw new ErroSistema("Não ao fechar o BD", ex);
            }
        }
    }
}
