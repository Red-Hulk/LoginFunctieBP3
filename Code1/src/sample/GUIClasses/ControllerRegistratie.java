package sample.GUIClasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.BackEndClasses.Registratie;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControllerRegistratie implements Initializable {


    @FXML
    private TextField txtGebruikersnaam;

    @FXML
    private TextField txtWachtwoord;

    @FXML
    private TextField txtNaam;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtDiploma;

    @FXML
    private Button closeButton;




    public void Bevestigen(ActionEvent actionEvent) {

        String tG = txtGebruikersnaam.getText();
        String tW = txtWachtwoord.getText();
        String tN = txtNaam.getText();
        String tE = txtEmail.getText();
        String tD = txtDiploma.getText();

        //System.out.println(tG + " " + tW + " " + tN + " " + tE + " " + tD + " ");



        if(tG.equals("") || tW.equals("") || tN.equals("") || tE.equals("") || tD.equals("")){
            JOptionPane.showMessageDialog(null, "Niet alle invoervelden zijn ingevuld!");
        }
        else{
            Registratie voorbeeld = new Registratie(tG, tW, tN, tE, tD);
            voorbeeld.voegToe(voorbeeld);
            voorbeeld.stuurNaarDatabase(voorbeeld);

            txtGebruikersnaam.clear();
            txtWachtwoord.clear();
            txtNaam.clear();
            txtEmail.clear();
            txtDiploma.clear();


        }

    }

    public void terugInloggen(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

        Stage voorbeeld = new Stage();
        GUILogin scherm = new GUILogin(voorbeeld);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
