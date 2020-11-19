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
public class UpdateErrorException extends Exception implements Exceptions{

    public UpdateErrorException() {
        super("Erro ao atualizar");
    }
    
    @Override
    public String getMessage(){
                
        return "Erro ao atualizar";
    }
    
    @Override
    public String toString(){
     
        return "Erro ao atualizar";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Erro ao atualizar";
    }
}
