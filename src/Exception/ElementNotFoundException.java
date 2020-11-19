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
public class ElementNotFoundException extends Exception implements Exceptions{

    public ElementNotFoundException() {
        super("Registro não encontrado");
    }
    
    @Override
    public String getMessage(){
                
        return "Registro não encontrado";
    }
    
    @Override
    public String toString(){
     
        return "Registro não encontrado";
    } 
    
    public String getLog(){
        
        this.printStackTrace();
        
        return "Registro não encontrado";
    }
}
