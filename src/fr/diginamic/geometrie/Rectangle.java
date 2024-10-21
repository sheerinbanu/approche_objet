package fr.diginamic.geometrie;

public class Rectangle implements ObjetGeometrique{
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    @Override
    public double perimetre() {
        return 2.0*(longueur+largeur);
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
