package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {

        Ville v1 = new Ville("Nice", 343000 );
        Ville v2 = new Ville("Carcassonne", 47800 );
        Ville v3 = new Ville("Narbonne", 484000 );
        Ville v4 = new Ville("Foix", 9700 );
        Ville v5 = new Ville("Pau", 77200 );
        Ville v6 = new Ville("Marseille", 850700 );
        Ville v7 = new Ville("Tarbes", 40600 );

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(v1);
        villes.add(v2);
        villes.add(v3);
        villes.add(v4);
        villes.add(v5);
        villes.add(v6);
        villes.add(v7);

       long max = villes.get(0).getNbHab();
        for (int i = 0; i < villes.size(); i++) {
            if(villes.get(i).getNbHab()>max){
                max=villes.get(i).getNbHab();
            }
        }

        String villePeuplee = null;
        for(Ville v:villes){
            if(v.getNbHab()==max){
                villePeuplee=v.getNom();
            }
        }
        System.out.println("La ville la plus peuplée est = " + villePeuplee);

        long min = villes.get(0).getNbHab();
        for (int i = 0; i < villes.size(); i++) {
            if(villes.get(i).getNbHab()<min){
                min=villes.get(i).getNbHab();
            }
        }
        System.out.println(min);

        Iterator<Ville> iterator = villes.iterator();
        while (iterator.hasNext()){
            Ville ville = iterator.next();
            if(ville.getNbHab()==min){
                iterator.remove();
            }
        }
        System.out.println("Villes restantes après suppression " + villes);
        System.out.println("Nb total de villes après suppression" + villes.size());



        for (int i = 0; i < villes.size() ; i++) {
            if(villes.get(i).getNbHab()>100000){

                    villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
            }
        }
         System.out.println(villes);

    }
}