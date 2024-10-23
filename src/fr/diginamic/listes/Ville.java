package fr.diginamic.listes;

public class Ville {

    private String nom;
    private long nbHab;

    public Ville(String nom, long nbHab) {
        this.nom = nom;
        this.nbHab = nbHab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getNbHab() {
        return nbHab;
    }

    public void setNbHab(long nbHab) {
        this.nbHab = nbHab;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHab=" + nbHab +
                '}';
    }


}
