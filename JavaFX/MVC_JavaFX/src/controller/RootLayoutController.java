package controller;
/**
 * FXML Controller class RootLayout
 *
 * @author Stephen Hardy @ spotpush.com
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class RootLayoutController implements Initializable {

    @FXML
    private MenuBar myMenuBar;
    @FXML
    private MenuItem menuEmployee;
    @FXML
    private MenuItem menuJob;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void exitMenuItem(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void loadHelpScreen(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("This is a sample JavaFX application");
        alert.setContentText("You can Search, Delete, Update and Insert a new employee");
        alert.show();
    }
    
    @FXML
    private void loadJobScreen(ActionEvent event) throws IOException {
        Parent parentView = FXMLLoader.load(getClass().getResource("../view/JobsView.fxml"));
        Scene jobsView = new Scene(parentView); 
        Stage stage = (Stage) myMenuBar.getScene().getWindow();
        stage.setScene(jobsView);
        stage.show();
    } 
      
    @FXML
    private void loadEmployeeScreen(ActionEvent event) throws IOException {
        Parent parentView = FXMLLoader.load(getClass().getResource("../view/EmployeeView.fxml"));
        Scene employeeView = new Scene(parentView); 
        Stage stage = (Stage) myMenuBar.getScene().getWindow();
        stage.setScene(employeeView);
        stage.show();
    }
 
    
    
        
}
