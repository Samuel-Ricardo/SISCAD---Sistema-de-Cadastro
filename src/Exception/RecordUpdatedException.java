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
public class RecordUpdatedException extends Exception implements Exceptions{

    public RecordUpdatedException() {
        super("Registro alterado com sucesso");
    }
    
    @Override
    public String getMessage(){
                
        return "Registro alterado com sucesso";
    }
    
    @Override
    public String toString(){
     
        return "Registro alterado com sucesso";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Registro alterado com sucesso";
    }
}
