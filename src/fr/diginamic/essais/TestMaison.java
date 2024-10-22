package fr.diginamic.essais;

import fr.diginamic.maison.*;
import java.util.ArrayList;


public class TestMaison {
    public static void main(String[] args) {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        pieces.add(new Chambre(45.88, 1, "chambre"));
        pieces.add(new WC(23.66, 0, "WC"));
        pieces.add(new SalleDeBain(34.66, 1, "salleDeBain"));
        pieces.add(new Cuisine(58.99, 0, "cuisine"));
        pieces.add(new Salon(98.77, 0, "salon"));
        pieces.add(new Chambre(45.11, 2, "chambre"));

        Maison m1 = new Maison(pieces);
        System.out.println(m1);
        Piece chambre2 = new Chambre(23.77, 2, "chambre");
        m1.ajouterPiece(chambre2);
        m1.getSuperficieTotale(pieces);
        m1.getSuperficieParEtage( pieces,1);
        m1.ajouterPiece(null); // null est compté comme une piece dans le total des pieces. En java une liste peut contenenir un élément null, et chaque ajout, même s'il s'agit de null, augmente la taille de la liste
//       Piece chambre3 = new Chambre(-43.77, 2, "chambre");
//       m1.ajouterPiece(chambre3);
//       m1.getSuperficieTotale(pieces);
        System.out.println( m1.getSuperficieParType( pieces,"chambre"));
        m1.getNbPieceMaison(pieces);

    }

}
