package fr.diginamic.listes;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {



    @Override
    public int compare(Ville v1, Ville v2) {
        if(v1.getNbHab()>v2.getNbHab()){
            return -1;
        } else if (v1.getNbHab()<v2.getNbHab()) {
            return 1;
        } else  {
            return 0;
        }
    }
}
