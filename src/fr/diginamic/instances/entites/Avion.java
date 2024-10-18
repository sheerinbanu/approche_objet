package fr.diginamic.instances.entites;

public class Avion {
    long immatriculation;
    String marque;
    String modele;
    Pilote pilote;
    Passager  passager;

    Avion(String marque, String modele, Pilote pilote, Passager passager ){
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passager = passager;
    }
}
