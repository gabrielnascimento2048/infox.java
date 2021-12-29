package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    // metodo responsavel pela conexão do banco de dados  
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //comando para chamar o driver
        String driver = "com.mysql.jdbc.Driver";
        //armazena informações referente ao Banco de Dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabelecendo a conexão entre o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro    
            //System.out.println(e);
            return null;
        }
    }
}
