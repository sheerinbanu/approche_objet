package fr.diginamic.banque;

public class CompteTaux extends Compte{

    private double tauxDeRemuneration;

    public CompteTaux(long numeroCompte, double solde, double tauxDeRemuneration) {
        super(numeroCompte, solde);
        this.tauxDeRemuneration = tauxDeRemuneration;
    }
    public double getTauxDeRemuneration() {
        return tauxDeRemuneration;
    }
    public void setTauxDeRemuneration(double tauxDeRemuneration) {
        this.tauxDeRemuneration = tauxDeRemuneration;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "tauxDeRemuneration=" + tauxDeRemuneration +
                ", numeroCompte=" + numeroCompte +
                '}';
    }
}
