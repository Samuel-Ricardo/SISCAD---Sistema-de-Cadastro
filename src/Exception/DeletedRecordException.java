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
public class DeletedRecordException extends Exception implements Exceptions{

    public DeletedRecordException() {
        super("Registro excluido com sucesso");
    }
    
    @Override
    public String getMessage(){
                
        return "Registro excluido com sucesso";
    }
    
    @Override
    public String toString(){
     
        return "Registro excluido com sucesso";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Registro excluido com sucesso";
    }
}
