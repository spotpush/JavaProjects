/**
* This class holds data about the employee
* @author Stephen Hardy @ spotpush.com
*/
package model;
/* Imports */
import java.sql.Date;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {

    private IntegerProperty employee_id;
    private StringProperty first_name;
    private StringProperty last_name;
    private StringProperty email;
    private StringProperty phone_number;
    private SimpleObjectProperty<Date> hire_date;
    private StringProperty job_id;
    private IntegerProperty salary;
    private DoubleProperty commission_pct;
    private IntegerProperty manager_id;
    private IntegerProperty department_id;
    
    public Employee() {
        this.employee_id = new SimpleIntegerProperty();
        this.first_name = new SimpleStringProperty();
        this.last_name = new SimpleStringProperty();
        this.email = new SimpleStringProperty();
        this.phone_number = new SimpleStringProperty();
        this.hire_date = new SimpleObjectProperty<>();
        this.job_id = new SimpleStringProperty();
        this.salary = new SimpleIntegerProperty();
        this.commission_pct = new SimpleDoubleProperty();
        this.manager_id = new SimpleIntegerProperty();
        this.department_id = new SimpleIntegerProperty();
    }

    public int getEmployeeId() {
        return employee_id.get();
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id.set(employee_id);
    }
    
    public IntegerProperty employeeIdProperty(){
        return employee_id;
    }

    public String getFirstName() {
        return first_name.get();
    }

    public void setFirstName(String first_name) {
        this.first_name.set(first_name);
    }
    
    public StringProperty firstNameProperty() {
        return first_name;
    }

    public String getLastName() {
        return last_name.get();
    }

    public void setLastName(String last_name) {
        this.last_name.set(last_name);
    }
    
    public StringProperty lastNameProperty() {
        return last_name;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
    
    public StringProperty emailProperty() {
        return email;
    }

    public String getPhoneNumber() {
        return phone_number.get();
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number.set(phone_number);
    }
    
    public StringProperty phoneNumberProperty() {
        return phone_number;
    }

    public Object getHireDate() {
        return hire_date.get();
    }

    public void setHireDate(Date hire_date) {
        this.hire_date.set(hire_date);
    }
    
    public SimpleObjectProperty<Date> hireDateProperty(){
        return hire_date;
    }

    public String getJobId() {
        return job_id.get();
    }

    public void setJobId(String job_id) {
        this.job_id.set(job_id);
    }
    
    public StringProperty jobIdProperty() {
        return job_id;
    }

    public int getSalary() {
        return salary.get();
    }

    public void setSalary(int salary) {
        this.salary.set(salary);
    }
    
    public IntegerProperty salaryProperty(){
        return salary;
    }

    public double getCommissionPct() {
        return commission_pct.get();
    }

    public void setCommissionPct(double commission_pct) {
        this.commission_pct.set(commission_pct);
    }
    
    public DoubleProperty commissionPctProperty(){
        return commission_pct;
    }

    public int getManagerId() {
        return manager_id.get();
    }

    public void setManagerId(int manager_id) {
        this.manager_id.set(manager_id);
    }
    
    public IntegerProperty managerIdProperty(){
        return manager_id;
    }

    public int getDepartmentId() {
        return department_id.get();
    }

    public void setDepartmentId(int department_id) {
        this.department_id.set(department_id);
    }
    
    public IntegerProperty departmentIdProperty(){
        return department_id;
    }

    
   
    
    public static void main(String[] args) {
    
    }
}
