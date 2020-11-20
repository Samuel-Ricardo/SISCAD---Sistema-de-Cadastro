/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Maintenance.RegisterView;
import View.Maintenance.UpdaterView;
import View.Menu;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void openGitHubOfProject() {
      
        try {
            URI link = new URI("https://github.com/Samuel-Ricardo/SISCAD---Sistema-de-Cadastro");
            Desktop.getDesktop().browse(link);
            
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }
        
    }

    public void openGitHubOfAuthor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
