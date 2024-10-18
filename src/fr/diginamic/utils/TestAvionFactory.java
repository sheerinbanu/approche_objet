package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

public class TestAvionFactory {
    public static void main(String[] args) {
        Passager passager1 = new Passager("Lo", "TOU", 15);
        Passager passager2 = new Passager("Lea", "Saumon", 45);


        Pilote pilote1 = new Pilote("Jean", "Richard", "11/09/24");
        Pilote pilote2 = new Pilote("Sheerin", "Banu", "10/10/24");

        Avion avion1 = AvionFactory.getInstance("Boeing", "737", 345, pilote1, passager1);
        Avion avion2 = AvionFactory.getInstance("Boeing", "737", 345, pilote2, passager2);

        avion1.attributAvion();
        avion2.attributAvion();
        Avion avion3 = AvionFactory.transfert(avion1, avion2);

    }
}
