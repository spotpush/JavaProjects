package com.spotpush.javafxmysql;
/*
 * @author Stephen Hardy @ spotpush.com
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXMySQL extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("./FXMLDocument.fxml"));
        Scene scene = new Scene(root,600,475);
        stage.setTitle("HW");
        stage.setScene(scene);
        stage.show();
        
              
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
