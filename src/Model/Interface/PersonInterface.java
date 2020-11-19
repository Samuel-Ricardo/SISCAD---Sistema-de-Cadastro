/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import Exception.*;
import Model.Person;

/**
 *
 * @author Samuel
 */
public interface PersonInterface {
    
    public void inert (Person person) throws RegistrationSuccessfullyRegistredException;
    
    public void update (Person person) throws UpdateErrorException;
    
    public void delete (Person person) throws DeletedRecordException;
}
