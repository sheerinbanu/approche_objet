package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {

        ArrayList<Pays> pays = new ArrayList<>();
        pays.add(new Pays("France", 65, "Europe"));
        pays.add(new Pays("Allemagne", 80, "Europe"));
        pays.add(new Pays("Belgique", 10, "Europe"));
        pays.add(new Pays("Russie", 150, "Asie"));
        pays.add(new Pays("Chine", 1400, "Asie"));
        pays.add(new Pays("Indonésie", 220, "Océanie"));
        pays.add(new Pays("Australie", 20, "Europe"));


        HashMap<String, Integer> mapCompteurs = new HashMap<>();
        for(Pays p: pays){
            Integer compteur = mapCompteurs.getOrDefault(p.getContinent(), 0);
            compteur++;
            mapCompteurs.put(p.getContinent(), compteur);
        }
    }




}
