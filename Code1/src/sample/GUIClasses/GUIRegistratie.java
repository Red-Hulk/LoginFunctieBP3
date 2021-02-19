package sample.GUIClasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIRegistratie {

    public GUIRegistratie(Stage primaryStage) throws IOException {
        primaryStage.setMinWidth(700);
        primaryStage.setMinHeight(500);


        Parent root = FXMLLoader.load(getClass().getResource("registratie.fxml"));
        primaryStage.setTitle("Registratie Scherm");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

}
