package fr.diginamic.utils;


import fr.diginamic.instances.entitesTest.Passager;
import fr.diginamic.instances.entitesTest.Pilote;

public class TestAvionFactory {
    public static void main(String[] args) {
        Pilote pilote1 = new Pilote("Lou", "Romain", "23/09/09");
        Passager[] passagers1 = new Passager[2];
        passagers1[0] = new Passager("Dupont", "Jean", 12);
        passagers1[1] = new Passager("Martin", "Sophie", 21);
        AvionFactory.getInstance(7654,"Airbus", "BOEIG 555", pilote1, passagers1, 10);
    }
}
