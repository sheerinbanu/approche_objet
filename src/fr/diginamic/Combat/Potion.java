package fr.diginamic.Combat;

public class Potion {
    private String nom;
    private int pointSanteMin;
    private int pointSanteMax;

    public Potion(String nom, int pointSanteMin, int pointSanteMax) {
        this.nom = nom;
        this.pointSanteMin = pointSanteMin;
        this.pointSanteMax = pointSanteMax;
    }
    public int utiliser() {
        // Générer un nombre aléatoire entre pointSanteMin et pointSanteMax
        return pointSanteMin + (int)(Math.random() * ((pointSanteMax - pointSanteMin) + 1));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointSanteMin() {
        return pointSanteMin;
    }

    public void setPointSanteMin(int pointSanteMin) {
        this.pointSanteMin = pointSanteMin;
    }

    public int getPointSanteMax() {
        return pointSanteMax;
    }

    public void setPointSanteMax(int pointSanteMax) {
        this.pointSanteMax = pointSanteMax;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "nom='" + nom + '\'' +
                ", pointSanteMin=" + pointSanteMin +
                ", pointSanteMax=" + pointSanteMax +
                '}';
    }
}
