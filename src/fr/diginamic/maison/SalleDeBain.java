package fr.diginamic.maison;

public class SalleDeBain extends Piece{
    public SalleDeBain(double superficie, int etage, String type) {
        super(superficie, etage, type);
        if (superficie < 0) {
            throw new IllegalArgumentException("La superficie ne peut pas être négative.");
        }
    }

    @Override
    public String toString() {
        return "SalleDeBain: "+ super.toString();
    }
}
