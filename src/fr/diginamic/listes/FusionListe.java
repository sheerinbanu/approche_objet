package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        System.out.println(liste1.get(0));


        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<>(liste1.size() + liste2.size());
        ////Je fusionne liste par liste par iteration
        for (int i = 0; i < liste1.size(); i++) {

            liste3.add(liste1.get(i));
        }
        System.out.println(liste3);

        for (int i = 0; i < liste2.size(); i++) {
            liste3.add(liste2.get(i));
        }
        System.out.println(liste3);

        ////J'utilise la méthode add()//////
        liste1.addAll(liste2);
        System.out.println(liste1);
    }



}
