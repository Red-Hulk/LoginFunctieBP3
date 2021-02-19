package sample.BackEndClasses;

import java.util.ArrayList;

public class Registratie {

    private String gebruikersnaam;
    private String ww;
    private String naam;
    private String email;
    private String diploma;
    private ArrayList<Registratie> lijst = new ArrayList<>();

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
