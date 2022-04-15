import com.example.sdr.HelloApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController2 {
        private Stage stage;
        private Scene scene;
        private Parent root;

        public void switchToScene1(ActionEvent event)throws IOException{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
                stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }

        public void switchToScene2(ActionEvent event)throws IOException{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view2.fxml"));
                stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }
}
