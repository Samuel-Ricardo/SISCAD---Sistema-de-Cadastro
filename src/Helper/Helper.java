/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Controller.Maintenance.UpdaterController;
import Model.Interface.View;
import Model.Person;
import Util.Dialoger;
import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Samuel
 */
public class Helper {
    
    private static final ArrayList<String> CARGOS = new ArrayList<>();
    private final ButtonGroup genre;
    private View view;

    public Helper(View view) {
        this.view = view;
        genre = new ButtonGroup();
        
        start();
    }
    
    public void start(){
    
        CreateButtonGroup();
        
        fillComboBox();
    }
    
    public void fillCargos() {
        
        CARGOS.clear();
        CARGOS.add("Administrador");
        CARGOS.add("Analista de Sistemas");
        CARGOS.add("Contador");
        CARGOS.add("Desenvolvedor");
        CARGOS.add("Engenheiro Civil");
    }
    
    public void clearFields(){
        
        view.getjTextFieldName().setText("");
        view.getjTextFieldAddress().setText("");
        view.getjCheckBoxActive().setSelected(false);
        view.getjComboBoxCargo().setSelectedIndex(0);
    }

      public void CreateButtonGroup() {
        genre.add(view.getjRadioButtonF());
        genre.add(view.getjRadioButtonM());
    }
    
    public void fillComboBox() {
        
        fillCargos();
    
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) view.getjComboBoxCargo().getModel();
    
        for (String cargo : CARGOS) {
            
            model.addElement(cargo);
        }
        
        view.getjComboBoxCargo().setModel(model);
    }
    
    public static ArrayList<String> getCARGOS() {
        return CARGOS;
    }

    public boolean isFieldsEmpty() {
        
        boolean isNameEmpty = view.getjTextFieldName().getText().equals(""); 
        boolean isAddressEmpty = view.getjTextFieldAddress().getText().equals("");
        boolean isGenreEmpty = !(view.getjRadioButtonF().isSelected() || view.getjRadioButtonM().isSelected());

        
        if(isAddressEmpty || isGenreEmpty || isNameEmpty){
            
            return true;
        }else{
            
            
            return false;
        }
    }

    public boolean isActiveSelected() {
        boolean isActiveEmpty = view.getjCheckBoxActive().isSelected();
        return isActiveEmpty;
    }

    public Person getPerson() {
  
        Person person = new Person();
        
        person.setName(view.getjTextFieldName().getText());
        person.setAddress(view.getjTextFieldAddress().getText());
        person.setCargo((String) view.getjComboBoxCargo().getSelectedItem()); 
       
        if(isActiveSelected()){
            
            person.setAtivo(1);
        }else{
            person.setAtivo(0);
        }
        
        if(view.getjRadioButtonM().isSelected()){
            
            person.setGenre("M");
        }else{
            person.setGenre("F");
        }
        
        return person;
    }

    public void fillFields() {
        
        Person person = UpdaterController.getSelectedPerson();
        
        view.getjTextFieldName().setText(person.getName());
        view.getjTextFieldAddress().setText(person.getAddress());
        
        if(person.getAtivo() == 0){
            view.getjCheckBoxActive().setSelected(false);
        }else{
            view.getjCheckBoxActive().setSelected(true);
        }
        
        view.getjComboBoxCargo().getModel().setSelectedItem(person.getCargo());
        
        if(person.getGenre().equals("M")){
        
            view.getjRadioButtonM().setSelected(true);
        }else{
             view.getjRadioButtonF().setSelected(true);
        }
    }
}
