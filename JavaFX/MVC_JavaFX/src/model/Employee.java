/**
* This class holds data about the employee
* @author Stephen Hardy @ spotpush.com
*/
package model;

import java.sql.Date;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/* Imports */


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

    public IntegerProperty getEmployee_id() {
        return employee_id;
    }

    public StringProperty getFirst_name() {
        return first_name;
    }

    public StringProperty getLast_name() {
        return last_name;
    }

    public StringProperty getEmail() {
        return email;
    }

    public StringProperty getPhone_number() {
        return phone_number;
    }

    public SimpleObjectProperty<Date> getHire_date() {
        return hire_date;
    }

    public StringProperty getJob_id() {
        return job_id;
    }

    public IntegerProperty getSalary() {
        return salary;
    }

    public DoubleProperty getCommission_pct() {
        return commission_pct;
    }

    public IntegerProperty getManager_id() {
        return manager_id;
    }

    public IntegerProperty getDepartment_id() {
        return department_id;
    }

   
        
    
    public static void main(String[] args) {
    
    }
}
