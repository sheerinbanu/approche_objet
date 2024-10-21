package fr.diginamic.geometrie;

public class Carre extends Rectangle{

    int cote ;

    public Carre(int cote) {
        this.cote = cote;
    }

    @Override
    public double perimetre() {
        return 4*(cote);
    }
    @Override
    public double surface() {
        return cote*cote;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "cote=" + cote +
                '}';
    }
}
