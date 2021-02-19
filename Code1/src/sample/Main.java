package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.GUIClasses.GUILogin;
import sample.GUIClasses.GUIRegistratie;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        GUIRegistratie voorbeeld1 = new GUIRegistratie(primaryStage);
        GUILogin voorbeeld = new GUILogin(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
