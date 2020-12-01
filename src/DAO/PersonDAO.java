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
import Factory.PersonFactory;
import JDBC.ConnectionFactory;
import Model.Interface.PersonInterface;
import Model.Person;
import Util.Dialoger;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class PersonDAO implements PersonInterface{
    
    private Connection connection;
    private PersonFactory personFactory;

    public PersonDAO(PersonFactory personFactory) {

        this.personFactory = personFactory;
    }

    public PersonDAO() {
        
        this.personFactory = new PersonFactory();
    }
    
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
            ConnectionFactory.closeConnection(connection, statement);  
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
                ConnectionFactory.closeConnection(connection, statement);  
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
        
        connect();
        PreparedStatement statement = null;
        ResultSet result = null;
        List<Person> persons = new ArrayList<>();
        String sql = "SELECT * FROM pessoa;";

        try {

            statement = connection.prepareStatement(sql);   

            result = statement.executeQuery();    

            while (result.next()) {

                Person person = personFactory.generatePerson(result);

                persons.add(person);
               }
           } catch (SQLException ex) {
               Dialoger.errorMessage(null, "Erro ao Consultar o Banco de Dados:", ex);  
           } finally {
               ConnectionFactory.closeConnection(connection, statement);
           }

        return persons;
    }

    @Override
    public Person select(int id) throws ElementNotFoundException {
       
        connect();
        PreparedStatement statement = null;
        ResultSet result = null;
        Person person = null;
        String sql = "SELECT * FROM pessoa WHERE id = ?;";

        try {

            statement = connection.prepareStatement(sql);   

            statement.setInt(1, id);
            
            result = statement.executeQuery();    

                person = personFactory.generatePerson(result);
                
           } catch (SQLException ex) {
               Dialoger.errorMessage(null, "Erro ao Consultar o Banco de Dados:", ex);  
           } finally {
               ConnectionFactory.closeConnection(connection, statement);
           }

        return person;
    }
}
