package fr.diginamic.instances.entitesTest;

import java.util.Arrays;

public class Avion {
    private long immatriculation;
    private String marque;
    private String modele;
    private Pilote pilote;
    private Passager[] passagers;
    private int avionCapacite;

    public Avion(long immatriculation, String marque, String modele, Pilote pilote, Passager[] passagers) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passagers = passagers;
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

    public Passager[] getPassagers() {
        return passagers;
    }

    public void setPassagers(Passager[] passagers) {
        this.passagers = passagers;
    }

    public int getAvionCapacite() {
        return avionCapacite;
    }

    public void setAvionCapacite(int avionCapacite) {
        avionCapacite = avionCapacite;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "immatriculation=" + immatriculation +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", pilote=" + pilote +
                ", passagers=" + Arrays.toString(passagers) +
                '}';
    }

    public void attributAvion() {
        System.out.println("Immatriculation de l'avion est " + immatriculation);
        System.out.println("Marque de l'avion  " + marque);
        System.out.println("Modèle de l'avion  " + modele);
        System.out.println("Le pilote de l'avion  " + pilote);
        System.out.println("Passagers de l'avion  " + Arrays.toString(passagers));
        System.out.println("Capacité de l'avion " + 20);
    }

    public Passager[] ajouterPassager(Passager[] passagers, Passager nouveauPassager) {
        Passager[] nouveauTabPassager = Arrays.copyOf(passagers, passagers.length + 1);
        avionCapacite = 20;
        if (passagers.length < avionCapacite) {
            nouveauTabPassager[nouveauTabPassager.length - 1] = nouveauPassager;
        } else {
            System.out.println("Désolé, l'avion est plein!");
        }
        System.out.println("Passager ajouté! Voici la nouvelle liste de passagers!");
        for (Passager p:nouveauTabPassager){
            System.out.println(p);
        }

        return nouveauTabPassager;

    }
}
