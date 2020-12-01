/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.Person;
import Util.TableModelPerson;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Samuel
 */
public class ListingHelper {
    
    public void fillTable(JTable table, List<Person> persons) {
        
        TableModelPerson model = new TableModelPerson(persons);
        
        table.setModel(model);
    }
    
    
}
