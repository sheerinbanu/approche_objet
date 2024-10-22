package fr.diginamic.Combat;

import java.util.ArrayList;

public class Personnage {
    private String nom;
    private int force;
    private int pointSante;
    private int score;
    private ArrayList<Potion> potions = new ArrayList<Potion>();

    public Personnage(int force, int pointSante, int score, ArrayList<Potion> potions) {
        this.force = force;
        this.pointSante = pointSante;
        this.score = score;
        this.potions = potions;
    }

    public void choisirCreature(Creature c){
        combattreCreature(c);
    }

    public boolean estVivant(){
        return pointSante>0;
    }

    public void subirDegats(int degat){
        pointSante-=degat;
    }

    public int attaque(){
        int attaque= (int)(Math.random() * 10);
        return force+=attaque;
    }
    public void combattreCreature(Creature c){
        System.out.println("Vous aviez choisit de combattre avec " + c.getNom());
        System.out.println( "Vous " + " attaquez le "+ c.getNom()+ " !");

        if(this.pointSante>0 && c.getPointSante()>0){
            //Tour de ce personnage//
        int degats = this.attaque();
        c.subirDegats(degats);
        if(this.force>c.getForce()){
            System.out.println("Vous aviez remporté le tour !");
            System.out.println("Votre force est maintenant " + this.getForce());
       }
        }
        if(c.getPointSante()==0){
            System.out.println(c.getNom()+ " est vaincu!");





        }
    }


    public void prendrePotion(Potion pot){
    int potionAjoute = pot.utiliser();
    pointSante+=potionAjoute;
    potions.remove(pot);
    }

    public int afficherScore(){
        return score;
    }

    public void sortir(){

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Potion> getPotions() {
        return potions;
    }

    public void setPotions(ArrayList<Potion> potions) {
        this.potions = potions;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "force=" + force +
                ", pointSante=" + pointSante +
                ", score=" + score +
                ", potions=" + potions +
                '}';
    }
}
