package org.acme.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    private static final String URL = System.getenv("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL");
    private static final String USER = System.getenv("rm566784");
    private static final String PASSWORD = System.getenv("250305");

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.OracleDriver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
