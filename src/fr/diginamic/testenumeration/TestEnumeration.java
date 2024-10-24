package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {

        for(Saison saison:Saison.values()){
            System.out.println(saison);
        }
        String nom= "ETE";

        Saison s1 = Saison.valueOf(nom);
        System.out.println(s1);

        String libelle = "Hiver";

        System.out.println(Saison.getLibelle(libelle));

    }
}
