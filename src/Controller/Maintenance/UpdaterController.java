/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Maintenance;

import DAO.PersonDAO;
import Exception.DeletedRecordException;
import Exception.ElementNotFoundException;
import Exception.UpdateErrorException;
import Helper.Helper;
import Model.Person;
import Util.Dialoger;
import View.Maintenance.UpdaterView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class UpdaterController {
    
    private final UpdaterView view;
    private final Helper helper;
    private final PersonDAO dao;
    private static Person selectedPerson = null;
    

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
        }else if(selectedPerson == null){
        
        Dialoger.message(null, "Nenhuma Pessoa Encontrada!!!!!"
                    + "\n"
                    + "\n Por Favor faça uma pesquisa para encontrar a Pessoa");
    }else{
            
            try {
                
                if(dao.update(selectedPerson)){
                    Dialoger.message(view, "Atualizado com Sucesso");
                }
            } catch (UpdateErrorException ex) {
                Logger.getLogger(UpdaterController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }      

    public void search() {
     
        try {
            int id = Integer.parseInt(Dialoger.inputDialog(view, "Pesquisa", "Digite o id: "));
            
            selectedPerson = dao.select(id);
            
            if(selectedPerson != null){
                
                 helper.fillFields();
                 view.getjLabelId().setText(selectedPerson.getId()+"");
            }else{
                Dialoger.message(view, "Pessoa nao Encontrada ;-;");
            }
           
        } catch (ElementNotFoundException ex) {
            Logger.getLogger(UpdaterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Person getSelectedPerson() {
        return selectedPerson;
    }

    public static void setSelectedPerson(Person selectedPerson) {
        UpdaterController.selectedPerson = selectedPerson;
    }

    public void delete() {
        
     if(helper.isFieldsEmpty() || view.getjLabelId().getText().equals("")){
            
            Dialoger.message(null, "Algum campo está vazio!!!!!"
                    + "\n"
                    + "\n Por Favor Certifique-se de que todos os campos estao preenchidos");
        }else if(selectedPerson == null){
        
        Dialoger.message(null, "Nenhuma Pessoa Encontrada!!!!!"
                    + "\n"
                    + "\n Por Favor faça uma pesquisa para encontrar a Pessoa");
    }else{
                
            try {
                if(dao.delete(selectedPerson)){
                    Dialoger.message(view, "Deletado com Sucesso");
                }
            } catch (DeletedRecordException ex) {
                Logger.getLogger(UpdaterController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
