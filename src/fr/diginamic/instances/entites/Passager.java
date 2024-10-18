package fr.diginamic.instances.entites;

import java.util.ArrayList;

public class Passager extends ArrayList<Passager> {
    private String nom;
    private String prenom;
    private int numeroSiège;

    Passager(String nom, String prenom, int numero){
        this.nom =  nom;
        this.prenom = prenom;
        this.numeroSiège = numero;
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

    public int getNumeroSiège() {
        return numeroSiège;
    }

    public void setNumeroSiège(int numeroSiège) {
        this.numeroSiège = numeroSiège;
    }
}
