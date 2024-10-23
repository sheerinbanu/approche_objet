package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Optional;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> gVilles = new ArrayList<>();
        gVilles.add("Nice");
        gVilles.add("Carcassonne");
        gVilles.add("Narbonne");
        gVilles.add("Lyon");
        gVilles.add("Foix");
        gVilles.add("Pau");
        gVilles.add("Marseille");
        gVilles.add("Tarbes");

        // Je crée un nouveau ArrayList pour mettre la taille de chacune des villes
        ArrayList<Integer> gVilleTaille = new ArrayList<>();
        for (int i = 0; i <gVilles.size() ; i++) {
            gVilleTaille.add(gVilles.get(i).length());
        }
        System.out.println(gVilleTaille);

        //Je trouve le plus grand nombre correspondant à la ville au plus grand nb de lettre puis retourne son index
        Optional<Integer> grandeTaille = gVilleTaille.stream().max((e1, e2)->e1.compareTo(e2));
        System.out.println(grandeTaille.get());
        int indexTaille = grandeTaille.get();
        int indexVille = gVilleTaille.indexOf(indexTaille);

        System.out.println("L'index de la ville au plus grand nombre de lettres est " + indexVille );

        //Afficher les villes en majuscules///
        ArrayList<String> villeMaj = new ArrayList<>();
        for (int i = 0; i < gVilles.size(); i++) {
            villeMaj.add(gVilles.get(i).toUpperCase());
        }
        System.out.println(villeMaj);
    }
}
