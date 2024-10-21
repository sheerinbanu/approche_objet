package fr.diginamic.geometrie;

public class Rectangle implements ObjetGeometrique{
    protected int longueur;
    protected int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Rectangle(){

    }

    @Override
    public double perimetre() {
        return 2*(longueur+largeur);
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
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
