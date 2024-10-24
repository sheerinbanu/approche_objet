package fr.diginamic.testenumeration;

public enum Continent {
    AFRIQUE("Afrique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    AMERIQUE("Amérique"),
    OCEANIE("Océanie");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
