/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import com.mysql.jdbc.Connection;

/**
 *
 * @author Samuel
 */
public class PersonDAO {
    
    private Connection connection;
    
    private void connect() {

        connection = ConnectionFactory.getConnection();

    }
}
