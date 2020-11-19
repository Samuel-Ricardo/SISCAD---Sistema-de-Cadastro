/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Samuel
 */
public class EmptyDatabaseException extends Exception{

    public EmptyDatabaseException() {
        super("Nenhum registro cadastrado na Base de Dados");
    }
    
    @Override
    public String getMessage(){
        
        return "Nenhum registro cadastrado na Base de Dados";
    }
    
    @Override
    public String toString(){
     
        return "Nenhum registro cadastrado na Base de Dados";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Nenhum registro cadastrado na Base de Dados";
    }
}
