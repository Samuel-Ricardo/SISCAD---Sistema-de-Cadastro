/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Maintenance;

import Helper.Helper;
import Model.Person;
import Util.Dialoger;
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
    
    

    public RegisterController(RegisterView view) {
    
        this.view = view;
        helper = new Helper(view);

    }

    public void ClearFields() {
       
        helper.clearFields();
    }

    public void save() {
    
        if(helper.isFieldsEmpty()){
            
            Dialoger.message(null, "Algum campo está vazio!!!!!"
                    + "\n"
                    + "\n Por Favor Certifique-se de que todos os campos estao preenchidos");
        }else{
            
            Person person = helper.getPerson();
        }
    
    }
    
}
