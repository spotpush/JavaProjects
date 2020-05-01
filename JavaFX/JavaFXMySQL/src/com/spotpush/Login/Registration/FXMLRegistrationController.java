package com.spotpush.Login.Registration;
/**
 * FXML Controller class
 *
 * @author Stephen Hardy @ spotpush.com
 */
import com.spotpush.connectivity.ConnectionClass;
import java.net.URL;
import java.sql.Connection;

import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLRegistrationController implements Initializable {

    @FXML
    private TextField newusername;
    @FXML
    private TextField newpassword;
    @FXML
    private Label name;
    @FXML
    private Label email;
    @FXML
    private Label country;
    @FXML
    private TextField newname;
    @FXML
    private TextField newemail;
    @FXML
    private TextField newcountry;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void registerNewUser(ActionEvent event) {
        try {
            ConnectionClass connectionClass=new ConnectionClass();
            Connection connection=connectionClass.getConnection();
        
            Statement stmt = connection.createStatement();
            String sql = "INSERT INTO login VALUES("
            
            
                
                    
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        
    }

    @FXML
    private void backToLogin(ActionEvent event) {
    }
    
}
