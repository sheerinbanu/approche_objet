package fr.diginamic.listes;

import java.util.Comparator;
import java.util.Objects;

public class Ville  {

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
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) return false;
        return nbHab == ville.nbHab && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHab);
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHab=" + nbHab +
                '}';
    }


//    @Override
//    public int compareTo(Ville v) {
//
//        return v.getNom().compareTo((this.nom));
//       return this.nom.compareTo(v.getNom());
//       if(this.nbHab>v.getNbHab()){
//            return -1;
//        } else if (this.nbHab<v.getNbHab()) {
//            return 1;
//        } else  {
//            return 0;
//        }
//
//    }
}
