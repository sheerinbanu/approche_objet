package fr.diginamic.instances.entitesTest;

import fr.diginamic.utils.AvionFactory;

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

        Passager[] passager3 = new Passager[4];
        passager3[0] = new Passager("Ria", "Mehra", 32);
        passager3[1] = new Passager("Tom", "Cruise", 10);
        passager3[2] = new Passager("Maria", "Carey", 11);
        passager3[3] = new Passager("Angelina", "Jolie", 20);

        Avion avion1 = new Avion(23456, "Airbus", "Boeing767", pilote1, passagers1, 30);
        Avion avion2 = new Avion(9460, "Airbus", "New", pilote2, passager2, 25);

        System.out.println("Avion1 " + avion1);
        System.out.println("Avion2 "+ avion2);

        Avion avion3 = new Avion(8889, "SpiceJet", "DreamLine", pilote2, passager2, 50);
        avion3.attributAvion();
        ////////////////////////test ajout passager////////////////////////////////////////////
        Passager nouveauPassager = new Passager("Micheal", "Kor", 16);
        avion3.ajouterPassager(passager2,nouveauPassager);
        avion3.afficherPassager();
        System.out.println(avion3.getPassager(1));

        ///////////////////////Test méthode créer des instances///////

        Avion avion4 = AvionFactory.getInstance(5432, "Airbus", "Boeing777", pilote2, passagers1, 50);
        Avion avion5 = AvionFactory.getInstance(7777, "Airbus", "DreamLine2", pilote1, passager3, 10);

        //////////////////////Test methode Afficher les cractéristiques de chaque avion////////////////
        avion4.attributAvion();
        avion5.attributAvion();

        //////////////////////Test methode transfert//////////////////////////////
        AvionFactory.transfert(avion4,avion5);

    }

}
