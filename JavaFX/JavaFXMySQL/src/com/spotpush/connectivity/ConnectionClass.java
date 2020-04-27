/**
* 
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.connectivity;
/* Imports */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

    public Connection connection;
    
    public Connection getConnection() {
        
        String dbname="demo";
        String username="root";
        String password="spotpush";
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    +dbname,username,password);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                
        return connection;
    }
    
    public static void main(String[] args) {
    
    }
}
