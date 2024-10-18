package fr.diginamic.instances.entites;

import java.util.Date;

public class Pilote {
    private String nom;
    private String prenom;
    private String dateDeLicence;

    Pilote(String nom, String prenom, String date){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeLicence = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeLicence() {
        return dateDeLicence;
    }

    public void setDateDeLicence(String dateDeLicence) {
        this.dateDeLicence = dateDeLicence;
    }


}
