/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Model.Interface.PersonInterface;
import Model.Person;
import Util.Dialoger;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Samuel
 */
public class PersonDAO implements PersonInterface{
    
    private Connection connection;
    
    public boolean insert(Person person) {
        connect();
        PreparedStatement statement = null;
        String sql = "INSERT INTO usuario (nome , endereco, cargo, sexo, ativo) VALUES (?, ?, ?, ?, ?);";

        try {

            statement = connection.prepareStatement(sql);   

            

            statement.setString(1, person.getName());     
            statement.setString(2, person.getAddress());
            statement.setString(3, person.getCargo());
            statement.setString(4, person.getGenre());
            statement.setInt(5, person.getAtivo());

            statement.execute();    

            return true;    
        } catch (SQLException ex) {
            Dialoger.errorMessage(null, "Erro ao salvar:", ex);  
            return false;   
        } finally {
            ConnectionFactory.closeConnection(connection, statement);  // closes all connections regardless of success  // fecha todas as conexoes independente de sucesso
        }
    }
    
    private void connect() {

        connection = ConnectionFactory.getConnection();

    }
}
