package sample.GUIClasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.BackEndClasses.Login;
import sample.BackEndClasses.Registratie;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {

    @FXML
    private TextField txtGebruikersnaam;

    @FXML
    private TextField txtWachtwoord;

    @FXML
    private Button CloseButton;

    @FXML
    private Button btnInloggen;



    public void Inloggen(ActionEvent actionEvent) {

        String tG = txtGebruikersnaam.getText();
        String tW = txtWachtwoord.getText();




        if(tG.equals("") || tW.equals("")){
            JOptionPane.showMessageDialog(null, "Niet alle invoervelden zijn ingevuld!");
        }
        else{

            Login voorbeeld = new Login(tG,tW);
            voorbeeld.checkLoginGegevens(voorbeeld);

            txtGebruikersnaam.clear();
            txtWachtwoord.clear();

            Stage stage = (Stage) btnInloggen.getScene().getWindow();
            stage.close();

            GUIProfessional scherm = new GUIProfessional();



        }

    }

    public void Registreren(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) CloseButton.getScene().getWindow();
        stage.close();

        Stage test = new Stage();
        GUIRegistratie voorbeeld = new GUIRegistratie(test);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
