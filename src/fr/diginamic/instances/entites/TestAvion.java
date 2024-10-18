package fr.diginamic.instances.entites;

public class TestAvion {
    public static void main(String[] args) {
        Passager passager1 = new Passager("Lo", "TOU", 15);
        Passager passager2 = new Passager("Lea", "Saumon", 45);


        Pilote pilote1 = new Pilote("Jean", "Richard", "11/09/24");
        Pilote pilote2 = new Pilote("Sheerin", "Banu", "10/10/24");

        Avion avion1 = new Avion("Airbus", "767", pilote1, passager1);
        Avion avion2 = new Avion("Airbus", "357", pilote2, passager2);
        Avion avion3 = new Avion("Armee", "444", pilote2);
        avion3.addPassager(passager1);
        avion3.addPassager(passager2);
        avion3.attributAvion();
    }
}
