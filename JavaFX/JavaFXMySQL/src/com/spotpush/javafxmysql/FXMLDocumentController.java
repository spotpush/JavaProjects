package com.spotpush.javafxmysql;

/*
 * @author Stephen Hardy @ spotpush.com
 */
import com.spotpush.connectivity.ConnectionClass;
import com.spotpush.users.UserDetails;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FXMLDocumentController {

    @FXML
    public TextField textfield;
    @FXML
    public Label textlabel;
    @FXML
    private Button button;
    @FXML
    private Label userdetails;
    @FXML
    private TableView<UserDetails> tableusers;
    @FXML
    private TableColumn<UserDetails, Integer> colid;
    @FXML
    private TableColumn<UserDetails, String> colname;
    @FXML
    private TableColumn<UserDetails, String> colemail;
    @FXML
    private TableColumn<UserDetails, String> colcountry;
    @FXML
    private Button btnload;
    private ObservableList<UserDetails>data;
    
    
        
    @FXML
    private void button(ActionEvent event) throws SQLException {
        
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        
        /**
         * This inserts user entry 
         */
        String sql="INSERT INTO names VALUES('"+textfield.getText()+"')";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        
        /**
         * This displays what the user just entered
         */
        sql="SELECT * FROM names;";
        ResultSet resultSet=stmt.executeQuery(sql);
        while (resultSet.next()) {
            textlabel.setText(resultSet.getString(1));
        }
    }

    @FXML
    private void loadDataFromDatabase(ActionEvent event) {
        
        try {
            ConnectionClass connectionClass=new ConnectionClass();
            Connection connection=connectionClass.getConnection();
            data=FXCollections.observableArrayList();
            ResultSet resultSet=connection.createStatement().executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                data.add(new UserDetails(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4)));
            }
        } catch (SQLException ex) {
            System.err.println("Error"+ex);
        }
        
        colid.setCellValueFactory(new PropertyValueFactory<>("id"));
        colname.setCellValueFactory(new PropertyValueFactory<>("name"));
        colemail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colcountry.setCellValueFactory(new PropertyValueFactory<>("country"));
        
        tableusers.setItems(null);
        tableusers.setItems(data);
        
    }
    
    public void changeSceneButton(ActionEvent event) throws IOException {
        Parent pageOne = FXMLLoader.load(getClass().getResource("../newscene/pageone.fxml"));
        Scene pageOneScene = new Scene(pageOne);
        
        //This line picks up Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(pageOneScene);
        window.show();
    }

}

