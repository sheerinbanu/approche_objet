package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class TestListInt {
    public static void main(String[] args) {

        ArrayList<Integer> entiers = new ArrayList<>();
        entiers.add(-1);
        entiers.add(5);
        entiers.add(7);
        entiers.add(3);
        entiers.add(-2);
        entiers.add(4);
        entiers.add(8);
        entiers.add(5);
        System.out.println(entiers);
        System.out.println("La taille de la liste " + entiers.size());
        Optional<Integer> resultatMax = entiers.stream().max((element1, element2) -> element1.compareTo(element2));
        System.out.println("Entier max " + resultatMax.get());
        Optional<Integer> resultatMin = entiers.stream().min((element1, element2) -> element1.compareTo(element2));
        System.out.println("Entier min " + resultatMin.get());
        entiers.remove(resultatMin.get());
        System.out.println(entiers);


        Predicate<Integer> p1 = num -> num < 0;

        for (int i = 0; i < entiers.size(); i++) {
            boolean result = p1.test(entiers.get(i));
            if (result)
                System.out.println(entiers.get(i));

        }
        ArrayList<Integer> entiersPositifs = new ArrayList<>();
        for (int i = 0; i < entiers.size(); i++) {
            boolean result = p1.test(entiers.get(i));
            if (result)
                System.out.println(Math.abs(entiers.get(i)));
            int entierPo = Math.abs(entiers.get(i));
            entiersPositifs.add(entierPo);
            System.out.println(entierPo);

        }
        System.out.println(entiersPositifs);
    }

}
