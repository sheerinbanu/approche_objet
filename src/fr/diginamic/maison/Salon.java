package fr.diginamic.maison;

public class Salon extends Piece{
    public Salon(double superficie, int etage, String type) {
        super(superficie, etage, type);
        if (superficie < 0) {
            throw new IllegalArgumentException("La superficie ne peut pas être négative.");        }
    }

    @Override
    public String toString() {
        return "Salon: " + super.toString();
    }
}
