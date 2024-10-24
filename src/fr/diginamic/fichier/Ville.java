package fr.diginamic.fichier;

public class Ville {
    private String nom;
    private String codeDep;
    private String region;
    private long pop;

    public Ville(String nom, String codeDep, String region, long pop) {
        this.nom = nom;
        this.codeDep = codeDep;
        this.region = region;
        this.pop = pop;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public void setCodeDep(String codeDep) {
        this.codeDep = codeDep;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDep='" + codeDep + '\'' +
                ", region='" + region + '\'' +
                ", pop=" + pop +
                '}';
    }
}
