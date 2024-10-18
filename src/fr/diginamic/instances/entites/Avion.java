package fr.diginamic.instances.entites;

public class Avion {
    long immatriculation;
    String marque;
    String modele;
    Pilote pilote;
    Passager  passager;
    Avion(String marque, String modele, Pilote pilote, Passager passager ){
        marque = marque;
        modele = modele;
        pilote = pilote;
        passager = passager;
    }
}
