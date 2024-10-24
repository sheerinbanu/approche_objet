package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String libelle;
    private int numeroOrdre;

    Saison(String libelle, int numeroOrdre) {
        this.libelle = libelle;
        this.numeroOrdre = numeroOrdre;
    }

    public static Saison getLibelle(String libelle){
        for(Saison s : Saison.values()) {
            if (s.getLibelle().equalsIgnoreCase(libelle)) {
                return s;
            }
        } return null;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNumeroOrdre() {
        return numeroOrdre;
    }

    public void setNumeroOrdre(int numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    @Override
    public String toString() {
        return "Saison{" +
                "libelle='" + libelle + '\'' +
                ", numeroOrdre=" + numeroOrdre +
                '}';
    }
}

