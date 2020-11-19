/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Model.Person;
import Util.Dialoger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class PersonFactory {
    
    public Person generatePerson(ResultSet result){
       
        Person person = null;
        
        try {
            
            person = new Person();
            
            person.setId(result.getInt("id"));
            person.setName(result.getString("nome"));
            person.setAddress(result.getString("endereco"));
            person.setAtivo(result.getInt("ativo"));
            person.setCargo(result.getString("cargo"));
            person.setGenre(result.getString("sexo"));
            
        } catch (SQLException ex) {
            Dialoger.errorMessage(null, "Erro ao gerar uma pessoa", ex);
        }
        
        return person;
    }
    
}
