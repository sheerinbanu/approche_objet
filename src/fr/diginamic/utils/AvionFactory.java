package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;
import java.util.ArrayList;

public class AvionFactory {

    public static Avion getInstance(String marque, String modele, int immatriculation, Pilote pilote, ArrayList<Passager> passager) {
        return new Avion(marque, modele, immatriculation, pilote, passager);
    }

    public static Avion transfert(Avion avion1, Avion avion2) {
        ArrayList<Passager> nbPassager1 = avion1.getPassager();
        ArrayList<Passager> nbPassager2 = avion2.getPassager();
        if (nbPassager1.size() > nbPassager2.size()) {
            nbPassager1.addAll(nbPassager2);
        }
        return avion1;
    }


}