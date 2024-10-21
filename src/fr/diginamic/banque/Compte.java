package fr.diginamic.banque;

public class Compte {
    public long numero; //mauvaise pratique de repeter le nom de la classe
    private double solde=0;

    public Compte(long numero, double solde) {
        this.numero = numero;
        this.solde=solde;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte=" + numero +
                '}';
    }
}
