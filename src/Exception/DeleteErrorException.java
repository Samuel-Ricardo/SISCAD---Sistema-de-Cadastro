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
public class DeleteErrorException extends Exception implements Exceptions{

    public DeleteErrorException() {
        super("Erro ao Deletar");
    }
    
    @Override
    public String getMessage(){
                
        return "Erro ao Deletar";
    }
    
    @Override
    public String toString(){
     
        return "Erro ao Deletar";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Erro ao Deletar";
    }
}
