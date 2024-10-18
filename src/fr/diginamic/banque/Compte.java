package fr.diginamic.banque;

public class Compte {
    public long numeroCompte;

    private double solde;

    public Compte(long numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        solde = 0;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte=" + numeroCompte +
                '}';
    }
}
