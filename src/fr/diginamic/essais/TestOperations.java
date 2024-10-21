package fr.diginamic.essais;

import fr.diginamic.Operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println(Operations.calcul(50, 60, '+'));
        System.out.println(Operations.calcul(150, 60, '-'));
        System.out.println(Operations.calcul(50, 60, '*'));
        System.out.println(Operations.calcul(750, 60, '/'));

    }
}
