/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.EmployeeDAO;
import model.Employee;

/**
 * FXML Controller class
 *
 * @author Stephen Hardy @ spotpush.com
 */
public class EmployeeViewController implements Initializable {

    @FXML
    private TextField empIdText;
    @FXML
    private TextField newEmailText;
    @FXML
    private TextField nameText;
    @FXML
    private TextField surnameText;
    @FXML
    private TextField emailText;
    @FXML
    private TextArea resultArea;
    @FXML
    private TableView employeeTable;
    @FXML
    private TableColumn<Employee, Integer> empIdColumn;
    @FXML
    private TableColumn<Employee, String> empNameColumn;
    @FXML
    private TableColumn<Employee, String> empLastNameColumn;
    @FXML
    private TableColumn<Employee, String> empEmailColumn;
    @FXML
    private TableColumn<Employee, String> empPhoneNumberColumn;
    @FXML
    private TableColumn<Employee, Date> empHireDateColumn;
    @FXML
    private Button searchEmpsBtn;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        empIdColumn.setCellValueFactory
        (cellData -> cellData.getValue().employeeIdProperty().asObject());
         empNameColumn.setCellValueFactory
        (cellData -> cellData.getValue().firstNameProperty());
        empLastNameColumn.setCellValueFactory
        (cellData -> cellData.getValue().lastNameProperty());
        empEmailColumn.setCellValueFactory
        (cellData -> cellData.getValue().emailProperty());
        empPhoneNumberColumn.setCellValueFactory
        (cellData -> cellData.getValue().phoneNumberProperty());
        empHireDateColumn.setCellValueFactory
        (cellData -> cellData.getValue().hireDateProperty());
    }    

    @FXML
    private void searchEmployee(ActionEvent event) throws ClassNotFoundException, 
            SQLException {
        
        try {
            Employee emp = EmployeeDAO.searchEmployee(empIdText.getText());
            populateAndShowEmployee(emp);
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error pccure while getting employee information from db.\n"+e);
        }
    }

    @FXML
    private void searchEmployees(ActionEvent event) throws SQLException, 
            ClassNotFoundException {
        
        try {
            ObservableList<Employee> empData = EmployeeDAO.searchEmployees();
            populateEmployees(empData);
        } catch (SQLException e) {
            System.out.println("Error occured while getting employees information from DB.\n"+e);
            throw e;
        }
    }
    
    @FXML
    private void deleteEmployee(ActionEvent event) throws SQLException, 
            ClassNotFoundException {
        
        try {
            EmployeeDAO.deleteEmpWithId(empIdText.getText());
            resultArea.setText("Employee Deleted! Employee id: "+empIdText.getText()+"\n");
        } catch (SQLException e) {
            resultArea.setText("Problem occured while deleting employee " + e);
            throw e;
        }
    }

    @FXML
    private void updateEmployeeEmail(ActionEvent event) throws SQLException, 
            ClassNotFoundException {
        
        try {
            EmployeeDAO.updateEmpEmail(empIdText.getText(),newEmailText.getText());
            resultArea.setText("Email has been updated for, employee id: "+empIdText.getText());
        } catch (SQLException e) {
            resultArea.setText("Problem occured while updating email: "+e);
        }
        
    }

    @FXML
    private void insertEmployee(ActionEvent event) throws SQLException, ClassNotFoundException {
        try {
            EmployeeDAO.insertEmp(nameText.getText(),surnameText.getText(),emailText.getText());
            resultArea.setText("Employee inserted! \n");
        } catch (SQLException e) {
            resultArea.setText("Problem occurred while inserting employee " + e);
            throw e;
        }
    }
    
    @FXML
    private void populateAndShowEmployee(Employee emp) throws ClassNotFoundException {
        if (emp != null) {
            populateEmployee(emp);
            setEmpInfoToTextArea(emp);
        } else {
            resultArea.setText("This employee does not exist!\n");
        }
    }
    
    @FXML
    private void populateEmployee(Employee emp) throws ClassNotFoundException {
        ObservableList<Employee> empData = FXCollections.observableArrayList();
        empData.add(emp);
        employeeTable.setItems(empData);
    }
    
    @FXML
    private void setEmpInfoToTextArea(Employee emp) {
        resultArea.setText("First Name: "+emp.getFirstName()+"\n"+
            "Last Name: "+ emp.getLastName());
    }
    
    @FXML
    private void populateEmployees(ObservableList<Employee> empData) throws 
            ClassNotFoundException {
        
        employeeTable.setItems(empData);
    }
}
