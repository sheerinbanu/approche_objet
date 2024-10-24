package fr.diginamic.maps;
import fr.diginamic.listes.Ville;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {

        Ville v1 = new Ville("Nice", 343000);
        Ville v2 = new Ville("Carcassonne", 47800);
        Ville v3 = new Ville("Narbonne", 484000);
        Ville v4 = new Ville("Foix", 9700);
        Ville v5 = new Ville("Pau", 77200);
        Ville v6 = new Ville("Marseille", 850700);
        Ville v7 = new Ville("Tarbes", 40600);

        ///////Dans cette classe, créez une map permettant de stocker les instances de villes (valeur)
        //en fonction de leur nom (clé).
        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", v1);
        mapVilles.put("Carcassonne", v2);
        mapVilles.put("Narbonne", v3);
        mapVilles.put("Foix", v4);
        mapVilles.put("Pau", v5);
        mapVilles.put("Marseille", v6);
        mapVilles.put("Tarbes", v7);

        //Recherchez et supprimez la ville qui a le moins d’habitants

        Collection<Ville> collVilles = mapVilles.values();
        Ville villeMinHab = null;

        for (Ville v : collVilles) {
            if (villeMinHab == null || v.getNbHab() < villeMinHab.getNbHab()) {
                villeMinHab = v;
            }
        }
        System.out.println("Ville à moins d'hab " + villeMinHab);

        String cleCorrespondante = null;


        for(Map.Entry<String, Ville> entry : mapVilles.entrySet()){
            if(entry.getValue().equals(villeMinHab)){
                cleCorrespondante = entry.getKey();
                break;
            }
        }
        System.out.println( "clé" + cleCorrespondante);
        mapVilles.remove(cleCorrespondante);

        System.out.println(mapVilles);



    }



}
