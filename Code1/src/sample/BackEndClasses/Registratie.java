package sample.BackEndClasses;

import sample.Controller;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registratie {

    private String gebruikersnaam;
    private String ww;
    private String naam;
    private String email;
    private String diploma;
    private ArrayList<Registratie> lijst = new ArrayList<>();
    Connection con;
    PreparedStatement pst;


    public Registratie(String gebruikersnaam, String ww, String naam, String email, String diploma) {
        this.gebruikersnaam = gebruikersnaam;
        this.ww = ww;
        this.naam = naam;
        this.email = email;
        this.diploma = diploma;
    }

    public void voegToe(Registratie persoon){

        lijst.add(persoon);

        lijst.forEach(e->{
            System.out.println(e.getGebruikersnaam() + " " + e.getWw() + " " + e.getNaam() + " " + e.getEmail() + " " + e.getDiploma());
        });
    }

    public void stuurNaarDatabase(Registratie persoon){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/registratiepersonen","root","");

            String query = "INSERT INTO personen (gebruikersnaam, wachtwoord, naam, email, diploma) " + " VALUES (?,?,?,?,?)";

            pst = con.prepareStatement(query);

            pst.setString(1, persoon.getGebruikersnaam());
            pst.setString(2, persoon.getWw());
            pst.setString(3, persoon.getNaam());
            pst.setString(4, persoon.getEmail());
            pst.setString(5, persoon.getDiploma());

            pst.execute();

            con.close();

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

    public String getWw() {
        return ww;
    }

    public void setWw(String ww) {
        this.ww = ww;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
}
