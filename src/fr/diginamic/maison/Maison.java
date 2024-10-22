package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.Objects;


public class Maison {
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Maison(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public void ajouterPiece(Piece piece) {
        if (piece != null) {
            pieces.add(piece);
            System.out.println("Nouvelle piece ajoutée " + piece);
            System.out.println("Pieces totales de la maison " + pieces.size());
        } else {
            System.out.println("La pièce ne peut pas être null");
        }
    }

    public double getSuperficieTotale(ArrayList<Piece> pieces) {
        double superficieTotale = 0;
        for (Piece p : pieces) {
            superficieTotale += p.getSuperficie();
        }
        System.out.println("La superficie totale de la maison est " + superficieTotale);
        return superficieTotale;
    }

    public double getSuperficieParEtage( ArrayList<Piece> pieces, int etage) {
        double superficieTotParEtage = 0;
        for (Piece p : pieces) {
            if (p.getEtage() == 1) {
                superficieTotParEtage += p.getSuperficie();
            }
        }
        System.out.println("La superficie totale  pour l'étage " + etage + " est : " + Math.round(superficieTotParEtage * 100.0) / 100.0);
        return superficieTotParEtage;
    }

    public double getSuperficieParType( ArrayList<Piece> pieces, String type) {
        double supType = 0;
        for (Piece p : pieces) {
            if (Objects.equals(p.getType(), type)) {
                supType += p.getSuperficie();
            }
        }
        System.out.println("La superficie totale du type " + type + " est : ");
        return Math.round(supType * 100.0)/100.0;
    }

    public   int getNbPieceMaison(ArrayList<Piece> pieces){
        if(pieces.size()==0){
            System.out.println("Il n'ya pas de pièce!!");
            return 0;
        }
        System.out.println("Le nombre de pièces de la maison est ");

        return pieces.size();
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }


    @Override
    public String toString() {
        return "Maison{" +
                "pieces=" + pieces +
                '}';
    }
}
