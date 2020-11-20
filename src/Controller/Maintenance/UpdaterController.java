/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Maintenance;

import DAO.PersonDAO;
import Exception.RegistrationSuccessfullyRegistredException;
import Exception.UpdateErrorException;
import Helper.Helper;
import Model.Person;
import Util.Dialoger;
import View.Maintenance.UpdaterView;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Samuel
 */
public class UpdaterController {
    
    private final UpdaterView view;
    private final Helper helper;
    private final PersonDAO dao;
    
    

    public UpdaterController(UpdaterView view) {
    
        this.view = view;
        helper = new Helper(view);
        dao = new PersonDAO();

    }

    public void ClearFields() {
       
        helper.clearFields();
    }

    public void Update() {
    
        if(helper.isFieldsEmpty() || view.getjLabelId().getText().equals("")){
            
            Dialoger.message(null, "Algum campo está vazio!!!!!"
                    + "\n"
                    + "\n Por Favor Certifique-se de que todos os campos estao preenchidos");
        }else{
            
            try {
                Person person = helper.getPerson();
                person.setId(Integer.parseInt(view.getjLabelId().getText()));
                
                if(dao.update(person)){
                    Dialoger.message(view, "Atualizado com Sucesso");
                }
            } catch (UpdateErrorException ex) {
                Logger.getLogger(UpdaterController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }

    public void search() {
     
        Dialoger.inputDialog();
    
    }
    
}
