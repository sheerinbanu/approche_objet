package fr.diginamic.banque;

public class Compte {
    public long numeroCompte;

    private double solde=0;

    public Compte(long numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde=solde;
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
