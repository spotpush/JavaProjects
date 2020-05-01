package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
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
     * Select an Employee
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
     * use ResultSet from db as parameters and set Employee object attributes
     * returning Employee object
     * @param rs
     * @return
     * @throws SQLException 
     */
    private static Employee getEmployeeFromReaultSet(ResultSet rs) throws 
            SQLException {
        
        Employee emp = null;
        if (rs.next()) {
            emp = new Employee();
            emp.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
            emp.setFirstName(rs.getString("FIRST_NAME"));
            emp.setLastName(rs.getString("LAST_NAME"));
            emp.setEmail(rs.getString("EMAIL"));
            emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
            emp.setHireDate(rs.getDate("HIRE_DATE"));
            emp.setJobId(rs.getString("JOB_ID"));
            emp.setSalary(rs.getInt("SALARY"));
            emp.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
            emp.setManagerId(rs.getInt("MANAGER_ID"));
            emp.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
        }
        return emp;
    }
    
    /**
     * Select Employees
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static ObservableList<Employee> searchEmployees() throws SQLException,
            ClassNotFoundException {
        
        String stmt = "SELECT * FROM employees";
        try {
            ResultSet rsEmps = DBUtil.dbExecuteQuery(stmt);
            ObservableList<Employee> empList = getEmployeeList(rsEmps);
            return empList;
        } catch (SQLException e) {
            System.out.println("SQL select operaton has been failed: "+e);
            throw e;
        }
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
        
        ObservableList<Employee> empList = FXCollections.observableArrayList();
        while (rs.next()) {
            Employee emp = new Employee();
            emp.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
            emp.setFirstName(rs.getString("FIRST_NAME"));
            emp.setLastName(rs.getString("LAST_NAME"));
            emp.setEmail(rs.getString("EMAIL"));
            emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
            emp.setHireDate(rs.getDate("HIRE_DATE"));
            emp.setJobId(rs.getString("JOB_ID"));
            emp.setSalary(rs.getInt("SALARY"));
            emp.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
            emp.setManagerId(rs.getInt("MANAGER_ID"));
            emp.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
        }
        return empList;
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
        
        String updateStmt = "BEGIN\n" +
                " UPDATE employees\n" +
                " SET EMAIL = '"+ empEmail +"'\n" +
                " WHERE EMPLOYEE_ID = "+ empId + ";\n" +
                "END;";
        
       try {
           DBUtil.dbExecuteUpdate(updateStmt);
       } catch (SQLException e) {
           System.out.println("Error occured while UPDATE Operation: "+e);
           throw e;
       }
    }
    
    /**
     * Delete an employee
     * @param empId
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void deleteEmpWithId(String empId) throws SQLException,
            ClassNotFoundException {
        
        String updateStmt = " BEGIN\n" +
                " DELETE FROM employees\n" +
                " WHERE employee_id ="+ empId +";\n" +
                " COMMIT;\n" +
                "END;";
        
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.println("Error occured while DELETE Operation: "+e);
            throw e;
        }
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
        
        String updateStmt = " BEGIN\n" +
                " INSERT INTO employees\n" +
                "(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)\n" +
                "VALUES\n" +
                "(sequence_employee.nextval, '"+name+"','"+lastname+"','"+email+"',SYSDATE, 'IT_PROG');\n" +
                " END;";
        
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occured while INSERT operation: "+e);
            throw e;
        }
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
    
    }
}
