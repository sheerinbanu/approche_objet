package fr.diginamic.essais;

import fr.diginamic.instances.entitesTest.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre th1 = new Theatre("GrandRex", 100, 85, 1275);
        th1.inscrire(5,15);
        th1.inscrire(5,20);
        th1.inscrire(5, 20);
        th1.inscrire(2, 10);

    }
}
