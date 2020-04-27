package com.spotpush.newscene;
/**
 * FXML Controller class
 *
 * @author Stephen Hardy @ spotpush.com
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PageoneController implements Initializable {

    public void changeSceneButton(ActionEvent event) throws IOException {
        Parent pageOne = FXMLLoader.load(getClass().getResource("../javafxmysql/FXMLDocument.fxml"));
        Scene pageOneScene = new Scene(pageOne);
        
        //This line picks up Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(pageOneScene);
        window.show();
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
