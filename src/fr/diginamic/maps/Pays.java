package fr.diginamic.maps;

import java.util.Objects;

public class Pays {
    public Pays(String nom, int hab, String continent) {
        this.nom = nom;
        this.hab = hab;
        this.continent = continent;
    }

    private String nom;
    private int hab;
    private String continent;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pays pays)) return false;
        return hab == pays.hab && Objects.equals(nom, pays.nom) && Objects.equals(continent, pays.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, hab, continent);
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", hab=" + hab +
                ", continent='" + continent + '\'' +
                '}';
    }
}
