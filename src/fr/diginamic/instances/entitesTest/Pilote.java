package fr.diginamic.instances.entitesTest;

import java.time.LocalDate;
import java.util.Date;

public class Pilote {
    private String nom;
    private String prénom;
    private String dateLicence;

    public Pilote(String nom, String prénom, String dateLicence) {
        this.nom = nom;
        this.prénom = prénom;
        this.dateLicence = dateLicence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getDateLicence() {
        return dateLicence;
    }

    public void setDateLicence(String dateLicence) {
        this.dateLicence = dateLicence;
    }

    @Override
    public String toString() {
        return "Pilote{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", dateLicence=" + dateLicence +
                '}';
    }
}
