package fr.diginamic.fichier_revision;

public class Ville {
    private String nom;
    private String dept;
    private String region;
    private String population;

    public Ville(String nom, String dept, String region, String population) {
        this.nom = nom;
        this.dept = dept;
        this.region = region;
        this.population = population;
    }

    public Ville(){

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", dept='" + dept + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                '}';
    }
}
