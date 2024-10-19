package fr.diginamic.instances.entitesTest;

import java.util.Arrays;

public class Avion {
    private long immatriculation;
    private String marque;
    private String modele;
    private Pilote pilote;
    private Passager [] passagers;
    private int AvionCapacite;

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
        return AvionCapacite;
    }

    public void setAvionCapacite(int avionCapacite) {
        AvionCapacite = avionCapacite;
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
}
