/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import Util.Dialoger;
import com.mysql.jdbc.Connection;

/**
 *
 * @author Samuel
 */
public class Test {
    
    public static void main(String[] args) {
        
        Connection connection = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection(connection);
    }
    
    public static boolean testConnection(){
        
        Connection connection = ConnectionFactory.getConnection();
        
        if(connection != null){
            
            ConnectionFactory.closeConnection(connection);
            return true;
        }else{
            ConnectionFactory.closeConnection(connection);
            return false;
        }
    }
}
