package fr.diginamic.instances.entites;

public class Avion {
    long immatriculation;
    private String marque;
    private String modele;
    private Pilote pilote;
    private Passager  passager;

    Avion(String marque, String modele, Pilote pilote, Passager passager ){
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passager = passager;
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

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }
}
