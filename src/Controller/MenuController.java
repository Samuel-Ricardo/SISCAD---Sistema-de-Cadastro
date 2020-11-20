/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Maintenance.Register;
import View.Menu;

/**
 *
 * @author Samuel
 */
public class MenuController {
    
    private final Menu view;

    public MenuController(Menu view) {
        this.view = view;
    }

    public void openRegister() {
    
        Register register = new Register();
        
        register.setVisible(true);
        
    }
    
    
}
