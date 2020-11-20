/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Maintenance;

import Helper.Helper;
import View.Maintenance.RegisterView;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Samuel
 */
public class RegisterController {
    
    private final RegisterView view;
    private final Helper helper;
    private ButtonGroup genre;
    

    public RegisterController(RegisterView view) {
    
        this.view = view;
        genre = new ButtonGroup();
        
        start();
    }
    
    public void start(){
    
        CreateButtonGroup();
        
        fillComboBox();
    }

    public void CreateButtonGroup() {
        genre.add(view.getjRadioButtonF());
        genre.add(view.getjRadioButtonM());
    }

    private void fillComboBox() {
        
        helper.fillCargos();
    
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) view.getjComboBoxCargo().getModel();
    
        for (String cargo : Helper.gCARGOS) {
            
            model.addElement(cargo);
        }
        
        view.getjComboBoxCargo().setModel(model);
    }

    public void ClearFields() {
       
        helper.clearFields(view);
    }
    
}
