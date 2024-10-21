package fr.diginamic.geometrie;

public class Carre extends Rectangle{

    public Carre(double cote) {
        super(cote,cote);
    }

    @Override
    public String toString() {
        return "Carre{" +
                "cote=" + getLargeur() +
                '}';
    }
}
