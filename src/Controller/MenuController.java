/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Maintenance.RegisterView;
import View.Maintenance.UpdaterView;
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

    public void openRegisterView() {
    
        RegisterView register = new RegisterView(view,true);
        
        register.setVisible(true);
        
    }

    public void openUpdateView() {
        
        UpdaterView updater = new UpdaterView(view,true);
        
        updater.setVisible(true);
    }
    
    
}
