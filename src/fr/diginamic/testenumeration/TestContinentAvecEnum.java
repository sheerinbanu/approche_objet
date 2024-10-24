package fr.diginamic.testenumeration;

import fr.diginamic.listes.Ville;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", 67, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 50, Continent.EUROPE));
        villes.add(new Ville("Pékin", 90, Continent.ASIE));
        villes.add(new Ville("Moscou", 85, Continent.ASIE));
        villes.add(new Ville("Berlin", 34, Continent.EUROPE));
        villes.add(new Ville("Sydney", 27, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 45, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 67, Continent.AFRIQUE));

        for(Ville v: villes){
            System.out.println(v);
        }


    }
}
