package sample.GUIClasses;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUIProfessional {

    public GUIProfessional(){

        GridPane root = new GridPane();

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Professional Scherm");
        primaryStage.setScene(new Scene(root,600,600));
        primaryStage.show();
    }
}
