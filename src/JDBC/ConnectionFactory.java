/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import Util.Dialoger;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdetemb?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
     
        try {
            
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL,USER,PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Dialoger.errorMessage(null, "Erro ão realizar conexão com o banco de dados:", ex);
            throw new RuntimeException("Erro ão realizar conexão com o banco de dados: " + ex);
        }
    }
    
    public static void closeConnection(Connection connection){
     
        try {
              if(connection != null) {
                
                connection.close();
               }
              
            } catch (SQLException ex) {
               Dialoger.errorMessage(null, "Não foi possivel encerrar conexão com o banco:", ex);
            }
        }
    
    public static void closeConnection(Connection connection, PreparedStatement statement ){ 

        closeConnection(connection);

        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            Dialoger.errorMessage(null, "Não foi possivel encerrar conexão com o banco:", ex); 
        }

    }

    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet result) { 

        closeConnection(connection, statement);

        try {

            if (result != null) {
                result.close();
            }
        } catch (SQLException ex) {
            Dialoger.errorMessage(null, "Não foi possivel encerrar conexão com o banco:", ex); 
        }

    }

    
}
