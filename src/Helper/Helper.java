/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.Interface.View;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Samuel
 */
public class Helper {
    
    private static final ArrayList<String> CARGOS = new ArrayList<>();
    
    
    public void fillCargos() {
        
        CARGOS.add("Administrador");
        CARGOS.add("Analista de Sistemas");
        CARGOS.add("Contador");
        CARGOS.add("Desenvolvedor");
        CARGOS.add("Engenheiro Civil");
    }
    
    public void clearFields(View view){
        
        view.getjTextFieldName().setText("");
        view.getjTextFieldAddress().setText("");
        view.getjCheckBoxActive().setSelected(false);
        view.getjComboBoxCargo().setSelectedIndex(0);
    }

    public void fillComboBox(View view) {
        
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
}
