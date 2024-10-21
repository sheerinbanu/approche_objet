package fr.diginamic.utils;


import fr.diginamic.instances.entitesTest.Avion;
import fr.diginamic.instances.entitesTest.Passager;
import fr.diginamic.instances.entitesTest.Pilote;

public class AvionFactory {

    public static Avion getInstance(long immatriculation,String marque, String modele, Pilote pilote, Passager[] passager, int avionCapacite) {
        return new Avion(immatriculation,marque, modele,  pilote, passager, avionCapacite);
    }

    public static Avion transfert(Avion avion1, Avion avion2) {

        int lenAvion1 = avion1.getPassagers().length;
        int lenAvion2 = avion2.getPassagers().length;


        if (lenAvion1 > lenAvion2) {
            avion1.setPassagers(fusionPassagers(avion1.getPassagers(), avion2.getPassagers()));
            System.out.println("Le nb total des passagers est maintenant " + avion1.getPassagers().length);
            return avion1;
        } else {
            avion2.setPassagers(fusionPassagers(avion2.getPassagers(), avion1.getPassagers()));
            System.out.println("Le nb total des passagers est maintenant " + avion2.getPassagers().length);
            return avion2;
        }
    }


    private static Passager[] fusionPassagers(Passager[] passagersPlus, Passager[] passagersMoins) {

        Passager[] tousLesPassagers = new Passager[passagersPlus.length + passagersMoins.length];
        System.arraycopy(passagersPlus, 0, tousLesPassagers, 0, passagersPlus.length);
        System.arraycopy(passagersMoins, 0, tousLesPassagers, passagersPlus.length, passagersMoins.length);
        return tousLesPassagers;
    }


}