package sample.BackEndClasses;

import sample.Controller;
import sample.GUIClasses.GUIProfessional;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    private String gebruikersnaam;
    private String wachtwoord;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Login(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }

    public void checkLoginGegevens(Login log){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/registratiepersonen","root","");

            pst = con.prepareStatement("select * from personen where gebruikersnaam=? and wachtwoord=?");

            pst.setString(1, log.getGebruikersnaam());
            pst.setString(2, log.getWachtwoord());

            rs = pst.executeQuery();

            if(rs.next()){
                //JOptionPane.showMessageDialog(null, "Login successfully");
                new GUIProfessional();

            }
            else{
                JOptionPane.showMessageDialog(null, "Login failed");
            }



        } catch (ClassNotFoundException ex){
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,null,ex);
        }

    }


    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }
}
