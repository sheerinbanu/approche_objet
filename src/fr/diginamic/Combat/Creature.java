package fr.diginamic.Combat;

public class Creature {
    private String nom;
    private int force;
    private int pointSante;

    public Creature(String nom, int force, int pointSante) {
        this.nom = nom;
        this.force = force;
        this.pointSante = pointSante;
    }

    public void subirDegats(int degat){
        pointSante-=degat;
    }
    public boolean estVivant(){
        return pointSante>0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointSante() {
        return pointSante;
    }

    public void setPointSante(int pointSante) {
        this.pointSante = pointSante;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "nom='" + nom + '\'' +
                ", force=" + force +
                ", pointSante=" + pointSante +
                '}';
    }
}
