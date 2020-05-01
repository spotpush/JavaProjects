package mvc_javafx;
/**
 *
 * @author Stephen Hardy @ spotpush.com
 */
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MVC_JavaFX extends Application {
    
    private Stage primaryStage;
    private BorderPane rootLayout;
    
    
    @Override
    public void start(Stage primaryStage) {
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MVC JavaFX Application");
        initRootLayout();
        showWelcomeView();
    }
    
    public void initRootLayout() {
        try {
            //This set the initial layout and adds the menu bar
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MVC_JavaFX.class.getResource("../view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showWelcomeView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MVC_JavaFX.class.getResource("../view/WelcomeView.fxml"));
            AnchorPane welcomeView = (AnchorPane) loader.load();
            rootLayout.setCenter(welcomeView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
