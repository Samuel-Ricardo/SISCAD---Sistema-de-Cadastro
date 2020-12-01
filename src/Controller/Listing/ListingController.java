/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Listing;

import Helper.ListingHelper;
import View.Listing.Listing;

/**
 *
 * @author Samuel
 */
public class ListingController {
    
    private final Listing view;
    private final ListingHelper helper;

    public ListingController(Listing view) {
        this.view = view;
        helper = new ListingHelper();
    }

    public void start() {
        
        helper.fillTable(view.getjTable(),);
    }
    
    
}
