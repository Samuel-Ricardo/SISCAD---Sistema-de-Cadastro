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
public class InsertErrorException extends Exception implements Exceptions{

    public InsertErrorException() {
        super("Erro ao inserir");
    }
    
    @Override
    public String getMessage(){
                
        return "Erro ao inserir";
    }
    
    @Override
    public String toString(){
     
        return "Erro ao inserir";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Erro ao inserir";
    }
}
