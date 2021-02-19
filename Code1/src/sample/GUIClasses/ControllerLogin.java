package sample.GUIClasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import sample.BackEndClasses.Login;
import sample.BackEndClasses.Registratie;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {

    @FXML
    private TextField txtGebruikersnaam;

    @FXML
    private TextField txtWachtwoord;



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

        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
