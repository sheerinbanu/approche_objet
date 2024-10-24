package fr.diginamic.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CreationEtManipulation {
    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        //////Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux////
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        ///////Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map////
        Set<Integer> cles =  mapVilles.keySet();
        for(Integer c:cles){
            System.out.println(c);
        }
        //////Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
        Collection<String> collVilles =  mapVilles.values();
        for(String v:collVilles){
            System.out.println(v);
        }

        ////Afficher la taille de la map/////
        System.out.println("La taille de la map est " + mapVilles.size());

    }
}
