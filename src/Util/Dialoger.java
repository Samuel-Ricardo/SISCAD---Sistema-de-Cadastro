/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Dialoger {
    
    
    public static void message(Component component, String body){
        
        JOptionPane.showMessageDialog(component, body);
        
    }
    
    public static void errorMessage(Component component, Exception exception){
        
        JOptionPane.showMessageDialog(component, "Ocorreu um erro: " + exception.getMessage());
    }
    
    public static void errorMessage(Component component, String message, Exception exception){
        
        JOptionPane.showMessageDialog(component, message + " " + exception.getMessage());
    }

    public static boolean confirm(Component component, String body) {
       
       if(JOptionPane.showConfirmDialog(component, body) == JOptionPane.YES_OPTION){
           
           return true;
       }else{
           return false;
       } 
    }
}
