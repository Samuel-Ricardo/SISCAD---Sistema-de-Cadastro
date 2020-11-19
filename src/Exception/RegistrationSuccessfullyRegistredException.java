/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import Model.Interface.Exceptions;

/**
 *
 * @author Samuel
 */
public class RegistrationSuccessfullyRegistredException extends Exception implements Exceptions{

    public RegistrationSuccessfullyRegistredException() {
        super("Registro cadastrado com sucesso");
    }
    
    @Override
    public String getMessage(){
                
        return "Registro cadastrado com sucesso";
    }
    
    @Override
    public String toString(){
     
        return "Registro cadastrado com sucesso";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Registro cadastrado com sucesso";
    }
}
