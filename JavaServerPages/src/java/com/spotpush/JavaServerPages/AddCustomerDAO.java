/**
 * JDBC code for connecting to the database
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.JavaServerPages;
/* Imports */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddCustomerDAO {
    public int addCustomer(AddCustomerBean addcustomerbean) 
            throws ClassNotFoundException {
        String INSERT_NEW_CUSTOMER = "INSERT INTO customers" +
                "(customerNumber,customerName,contactLastName,contactFirstName, " +
                "phone,addressLine1,addressLine2,city,state, " +
                "postalCode,country,salesRepEmployeeNumber,creditLimit) VALUES" +
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        int result = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?useSSL=false","root", "spotpush");
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_CUSTOMER)) {
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,addcustomerbean.getCustomerName());
            preparedStatement.setString(3,addcustomerbean.getContactLastName());
            preparedStatement.setString(4,addcustomerbean.getContactFirstName());
            preparedStatement.setString(5,addcustomerbean.getPhoneNumber());
            preparedStatement.setString(6,addcustomerbean.getAddressLine1());
            preparedStatement.setString(7,addcustomerbean.getAddressLine2());
            preparedStatement.setString(8,addcustomerbean.getCity());
            preparedStatement.setString(9,addcustomerbean.getState());
            preparedStatement.setString(10,addcustomerbean.getPostalCode());
            preparedStatement.setString(11,addcustomerbean.getCountry());
            preparedStatement.setInt(12,addcustomerbean.getSalesRepEmployeeNumber());
            preparedStatement.setDouble(13,addcustomerbean.getCreditLimit());
            
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
        return result;
    }
    
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
