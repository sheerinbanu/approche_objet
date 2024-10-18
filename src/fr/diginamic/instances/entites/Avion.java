package fr.diginamic.instances.entites;

import java.util.ArrayList;

public class Avion {
    long immatriculation;
    private String marque;
    private String modele;
    private Pilote pilote;
    private ArrayList<Passager> passager;

    Avion(String marque, String modele, Pilote pilote, ArrayList<Passager> passager ){
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passager = new ArrayList<>();
    }
    Avion(String marque, String modele, Pilote pilote ){
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
    }

    public long getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(long immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }
    public ArrayList<Passager> getPassager() {
        return passager;
    }

    public void setPassager(ArrayList<Passager> passager) {
        this.passager = passager;
    }



    public void attributAvion(){
        System.out.println("Immatriculation de l'avion" + immatriculation);
        System.out.println("La marque de l'avion est " + marque);
        System.out.println("Le modèle de l'avion est " + modele);
        System.out.println("Le pilote de l'avion est " + pilote);
        }

    public void addPassager(Passager passager){
        passager.add(passager);
        System.out.println("Passager ajouté " + passager.getNom());
    }


}
