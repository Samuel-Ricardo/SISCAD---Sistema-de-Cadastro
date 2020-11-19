/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exception.DeletedRecordException;
import Exception.ElementNotFoundException;
import Exception.EmptyDatabaseException;
import Exception.RegistrationSuccessfullyRegistredException;
import Exception.UpdateErrorException;
import JDBC.ConnectionFactory;
import Model.Interface.PersonInterface;
import Model.Person;
import Util.Dialoger;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class PersonDAO implements PersonInterface{
    
    private Connection connection;
    
    @Override
    public boolean inert(Person person) throws RegistrationSuccessfullyRegistredException {
        
        connect();
        PreparedStatement statement = null;
        String sql = "INSERT INTO pessoa (nome , endereco, cargo, sexo, ativo) VALUES (?, ?, ?, ?, ?);";

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

    @Override
    public boolean update(Person person) throws UpdateErrorException {
       
        connect();
            PreparedStatement statement = null;
            String sql = "UPDATE pessoa SET nome = ?, SET endereco = ?, SET cargo = ?, SET  sexo = ?, SET ativo = ?  WHERE id = ?";

            try {

                statement = connection.prepareStatement(sql);   



                statement.setString(1, person.getName());     
                statement.setString(2, person.getAddress());
                statement.setString(3, person.getCargo());
                statement.setString(4, person.getGenre());
                statement.setInt(5, person.getAtivo());
                statement.setInt(6, person.getId());

                statement.execute();    

                return true;    
            } catch (SQLException ex) {
                Dialoger.errorMessage(null, "Erro ao Atualizar os dados:", ex);  
                return false;   
            } finally {
                ConnectionFactory.closeConnection(connection, statement);  // closes all connections regardless of success  // fecha todas as conexoes independente de sucesso
            }
    }

    @Override
    public boolean delete(Person person) throws DeletedRecordException {
       
        connect();
        PreparedStatement statement = null;
        String sql = "DELETE FROM pessoa WHERE id = ?;";

        try {

            statement = connection.prepareStatement(sql);   

            statement.setLong(1, person.getId());       

            statement.execute();
             return true;    
        } catch (SQLException ex) {
            Dialoger.errorMessage(null, "Erro ao Deletar:", ex);  
            return false;   
       } finally {
            ConnectionFactory.closeConnection(connection, statement);  
      }
    }

    @Override
    public List<Person> selectAll() throws EmptyDatabaseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person select(Person person) throws ElementNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
