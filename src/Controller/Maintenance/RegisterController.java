/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Maintenance;

import View.Maintenance.RegisterView;
import javax.swing.ButtonGroup;

/**
 *
 * @author Samuel
 */
public class RegisterController {
    
    private final RegisterView view;
    private ButtonGroup genre;

    public RegisterController(RegisterView view) {
    
        this.view = view;
        genre = new ButtonGroup();
        
        start();
    }
    
    public void start(){
    
        genre.add(view.getJRadioButtonF);
        genre.add(view.getJRadioButtonM);
    }
    
}
