/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Person;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Samuel
 */
public class TableModelPerson extends AbstractTableModel{

    private List<Person> personsList; 
    
    public TableModelPerson (List<Person> personList){
        
    }
    
    @Override
    public int getRowCount() {
        return 6;
    }

    @Override
    public int getColumnCount() {
        
        return this.personsList.size();
    }
    
    public String getColumnName(final int column){
    
        switch(column){
            
            case 0:
                return "id";
            case 1:
                return "nome";
            case 2:
                return "sexo";
            case 3:
                return "Endereço";
            case 4:
                return "Cargo";
            case 5:
                return "Ativo";
            default: 
                return "?";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        
    }
    
}
