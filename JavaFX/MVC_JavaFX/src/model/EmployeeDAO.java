package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.ObservableList;
import util.DBUtil;

/**
* Employee DAO handles employee related database operations
* Search/update/delete/insert
* 
* @author Stephen Hardy @ spotpush.com
*/

public class EmployeeDAO {
    
    /**
     * Search Employees
     * @param empId
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static Employee searchEmployee(String empId) throws SQLException, 
            ClassNotFoundException {
        
        String selectStmt = "SELECT * FROM employees WHERE employee_id="+empId;
        try {
            ResultSet reEmp = DBUtil.dbExecuteQuery(selectStmt);
            Employee employee = getEmployeeFromReaultSet(reEmp);
            return employee;
        } catch (SQLException e) {
            System.out.println("While searching an employee with "+empId+" id,"
                    + "an error occured: "+e);
            throw e;
        }
    }
    
    /**
     * 
     * @param rs
     * @return
     * @throws SQLException 
     */
    private static Employee getEmployeeFromReaultSet(ResultSet rs) throws 
            SQLException {
        
        Employee emp = null;
        if (rs.next()) {
            emp = new Employee();
            emp.setEmployeeId(rs.getInt("EMPLOYEE)ID"));
        }
        
        
    }
    
    /**
     * Select Employees
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static ObservableList<Employee> searchEmployees() throws SQLException,
            ClassNotFoundException {
        
    }
    
    /**
     * Select * from employees operations
     * @param rs
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    private static ObservableList<Employee> getEmployeeList(ResultSet rs)
            throws SQLException, ClassNotFoundException {
        
    }
    
    /**
     * Update an employees email address
     * @param empId
     * @param empEmail
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void updateEmpEmail(String empId, String empEmail) throws 
            SQLException, ClassNotFoundException {
        
    }
    
    /**
     * Delete an employee
     * @param empId
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void deleteEmpWithId(String empId) throws SQLException,
            ClassNotFoundException {
        
    }
    
    /**
     * Insert an Employee
     * @param name
     * @param lastname
     * @param email
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void insertEmp(String name, String lastname, String email)
            throws SQLException, ClassNotFoundException {
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
    
    }
}
