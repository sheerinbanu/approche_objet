package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {

        ArrayList<Integer> entiers = new ArrayList<>();
        for (int i = 0; i <=100; i++) {
            entiers.add(i);
        }
        System.out.println(entiers);
        System.out.println(entiers.size());
    }
}
