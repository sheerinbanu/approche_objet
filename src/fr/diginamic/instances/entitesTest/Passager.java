package fr.diginamic.instances.entitesTest;

public class Passager {
    private String nom;
    private String prénom;
    private int numSiege;

    public Passager(String nom, String prénom, int numSiege) {
        this.nom = nom;
        this.prénom = prénom;
        this.numSiege = numSiege;
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

    public int getNumSiege() {
        return numSiege;
    }

    public void setNumSiege(int numSiege) {
        this.numSiege = numSiege;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", numSiege=" + numSiege +
                '}';
    }
}
