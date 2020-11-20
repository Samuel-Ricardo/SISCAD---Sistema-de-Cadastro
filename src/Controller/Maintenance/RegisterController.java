/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Maintenance;

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
    private ButtonGroup genre;
    private static final ArrayList<String> CARGOS = new ArrayList<>();

    public RegisterController(RegisterView view) {
    
        this.view = view;
        genre = new ButtonGroup();
        
        start();
    }
    
    public void start(){
    
        genre.add(view.getjRadioButtonF());
        genre.add(view.getjRadioButtonM());
        
        fillComboBox();
    }

    private void fillComboBox() {
        
        FillCargos();
    
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) view.getjComboBoxCargo().getModel();
    
        for (String cargo : CARGOS) {
            
            model.addElement(cargo);
        }
        
        view.getjComboBoxCargo().setModel(model);
    }

    public void FillCargos() {
        
        CARGOS.add("Administrador");
        CARGOS.add("Analista de Sistemas");
        CARGOS.add("Contador");
        CARGOS.add("Desenvolvedor");
        CARGOS.add("Engenheiro Civil");
    }
    
}
