package fr.diginamic.instances.entitesTest;

public class TestAvion {
    public static void main(String[] args) {
        Pilote pilote1 = new Pilote("Lou", "Romain", "23/09/09");
        Pilote pilote2 = new Pilote("Jean", "Marie", "03/09/20");

        Passager[] passagers1 = new Passager[2];
        passagers1[0] = new Passager("Dupont", "Jean", 12);
        passagers1[1] = new Passager("Martin", "Sophie", 21);

        Passager[] passager2 = new Passager[2];
        passager2[0] = new Passager("Helen", "Roz", 12);
        passager2[1] = new Passager("Meena", "Kumari", 10);


        Avion avion1 = new Avion(23456, "Airbus", "Boeing767", pilote1, passagers1);
        Avion avion2 = new Avion(9460, "Airbus", "New", pilote2, passager2);

        System.out.println("Avion1 " + avion1);
        System.out.println("Avion2 "+ avion2);
    }

}
