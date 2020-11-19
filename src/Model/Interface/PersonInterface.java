/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import Exception.*;
import Model.Person;
import java.util.List;

/**
 *
 * @author Samuel
 */
public interface PersonInterface {
    
    public boolean inert (Person person) throws RegistrationSuccessfullyRegistredException;
    
    public boolean update (Person person) throws UpdateErrorException;
    
    public boolean delete (Person person) throws DeletedRecordException;
    
    public List<Person> selectAll () throws EmptyDatabaseException;
    
    public Person select (Person person) throws ElementNotFoundException;
}
