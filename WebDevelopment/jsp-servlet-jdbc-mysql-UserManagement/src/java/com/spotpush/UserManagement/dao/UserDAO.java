package com.spotpush.UserManagement.dao;
/**
* UserDAO (Data Access Layer/Object) provides CRUD operations for the 
* table 'users' with the demo database
* @author Stephen Hardy @ spotpush.com
*/
import com.spotpush.UserManagement.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    
    private final String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private final String jdbcUserName = "root";
    private final String jdbcPassword = "spotpush";
    
    private static final String INSERT_USERS_SQL = "INSERT INTO users"
            + "(name, email, country) VALUES (?,?,?);";

    public UserDAO() {}
    
    /**
     * Establish a connection to the database for this DAO
     * Includes Multi-exception catch statement
     * @return connection to the db  
     */
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUserName, 
                    jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
        return connection;
    }
    
    /**
     * Inserts 'user' into the user table
     * @param user
     * @throws SQLException 
     */
    public void insertUser(User user) throws SQLException {
        System.out.print(INSERT_USERS_SQL);
        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
                    preparedStatement.setString(1,user.getName());
                    preparedStatement.setString(2,user.getEmail());
                    preparedStatement.setString(3,user.getCountry());
                    System.out.println(preparedStatement);
                    preparedStatement.executeUpdate();
                } catch (SQLException e) {
                    printSQLException(e);
                }
    }
    
    /**
     * Handles SQL exception calls from methods
     * @param ex 
     */
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: "+((SQLException) e).getSQLState());
                System.err.println("Error Code: "+((SQLException) e).getErrorCode());
                System.err.println("Message: "+e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: "+ t);
                    t=t.getCause();
                }
            }
        }
        
    }
    
}
