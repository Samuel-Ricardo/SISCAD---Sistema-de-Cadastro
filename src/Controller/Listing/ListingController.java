/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Listing;

import DAO.PersonDAO;
import Exception.EmptyDatabaseException;
import Helper.ListingHelper;
import Util.Dialoger;
import View.Listing.Listing;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class ListingController {
    
    private final Listing view;
    private final ListingHelper helper;
    private final PersonDAO dao;

    public ListingController(Listing view) {
        this.view = view;
        helper = new ListingHelper();
        dao = new PersonDAO();
    }

    public void start() {
        
        try {
            helper.fillTable(view.getjTable(),dao.selectAll());
        } catch (EmptyDatabaseException ex) {
            Dialoger.errorMessage(view, "Erro ao Consultar o Banco ", ex);
            ex.getLog();
        }
    }
    
    
}
