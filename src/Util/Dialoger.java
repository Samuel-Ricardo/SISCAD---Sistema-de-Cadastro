/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Interface.Exceptions;
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
    
    public static void errorMessage(Component component, Exceptions exception){
        
        JOptionPane.showMessageDialog(component, exception.getLog(), "Occorreu um Erro", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void errorMessage(Component component, String message, Exceptions exception){
        
        JOptionPane.showMessageDialog(component, exception.getLog(), message, JOptionPane.WARNING_MESSAGE);
    }

    public static boolean confirm(Component component, String body) {
       
       if(JOptionPane.showConfirmDialog(component, body) == JOptionPane.YES_OPTION){
           
           return true;
       }else{
           return false;
       } 
    }
}
