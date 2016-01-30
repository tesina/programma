
package spotify;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * @author Antonioni Andrea & Zanelli Gabriele
 */

public class Spotify extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/graphics/GUI.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Unknown");
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                System.exit(0);
            }
      });   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
