package sample.GUIClasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.BackEndClasses.Registratie;

import javax.swing.*;
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




    public void Bevestigen(ActionEvent actionEvent) {

        String tG = txtGebruikersnaam.getText();
        String tW = txtWachtwoord.getText();
        String tN = txtNaam.getText();
        String tE = txtEmail.getText();
        String tD = txtDiploma.getText();

        System.out.println(tG + " " + tW + " " + tN + " " + tE + " " + tD + " ");

        Registratie voorbeeld = new Registratie(tG, tW, tN, tE, tD);

        txtGebruikersnaam.clear();
        txtWachtwoord.clear();
        txtNaam.clear();
        txtEmail.clear();
        txtDiploma.clear();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
