package com.spotpush.Login;
/**
 * FXML Controller class
 *
 * @author Stephen Hardy @ spotpush.com
 */
import com.spotpush.connectivity.ConnectionClass;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLLoginController implements Initializable {

    @FXML
    private TextField userName;
    @FXML
    private Button submitLogin;
    @FXML
    private PasswordField passWord;
    @FXML
    private Label usernameerror;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    public void submitLoginRequest(ActionEvent event) {
        try {
            ConnectionClass connectionClass=new ConnectionClass();
            Connection connection=connectionClass.getConnection();
        
            String checkUserName = userName.getText();
            Statement stmt = connection.createStatement();
            String sql="SELECT * FROM login where username = '"+checkUserName+"'";
            ResultSet userExists = stmt.executeQuery(sql);
            
            if (userExists.next()) {
                usernameerror.setText("User Name Ok");
                loadMainScene(event);
            }
            else usernameerror.setText("Invalid User Name");
            
                
                    
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        
    }
    
    @FXML
    public void loadMainScene(ActionEvent event) throws IOException {
        Parent main = FXMLLoader.load(getClass().getResource("../javaFXMySQL/FXMLDocument.fxml"));
        Scene mainScene = new Scene(main);
        
        //This line picks up Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }
    
}
