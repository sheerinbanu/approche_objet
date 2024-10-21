package fr.diginamic.instances.entitesTest;

public class Theatre {
    private String nom;
    private int capMax;
    private int totalClientInscrit;
    private double recetteTotal;

    public Theatre(String nom, int capMax, int totalClientInscrit, double recetteTotal) {
        this.nom = nom;
        this.capMax = capMax;
        this.totalClientInscrit = totalClientInscrit;
        this.recetteTotal = recetteTotal;
    }

    public void inscrire(int nbClient, double prixPlace) {

        int placeDisponible = capMax - totalClientInscrit;
        if (nbClient <= placeDisponible) {
            totalClientInscrit += nbClient;
            recetteTotal += nbClient * prixPlace;
            System.out.println(nbClient + " clients inscrits avec succès!");
            System.out.println("Nb total de clients inscrits :" + totalClientInscrit);
            System.out.println("Recette totale de l'établissement " + recetteTotal);
        } else {
            System.out.println("Erreur");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getTotalClientInscrit() {
        return totalClientInscrit;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }

}
