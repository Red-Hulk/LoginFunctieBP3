package sample.GUIClasses;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUILogin {

    public GUILogin(Stage primaryStage) throws IOException {

        primaryStage.setMinWidth(700);
        primaryStage.setMinHeight(500);


        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Login Scherm");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

}
