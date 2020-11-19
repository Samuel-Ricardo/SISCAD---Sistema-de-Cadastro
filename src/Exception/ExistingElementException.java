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
public class ExistingElementException extends Exception{

    public ExistingElementException() {
        super("Registro já cadastrado");
    }
    
    @Override
    public String getMessage(){
        
        return "Registro já cadastrado";
    }
    
    @Override
    public String toString(){
     
        return "Registro já cadastrado";
    } 
}
