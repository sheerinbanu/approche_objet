package fr.diginamic.Combat;

import java.util.ArrayList;

public class TestCombat {
    public static void main(String[] args) {
    Potion p1 = new Potion("PotionDeSoin",1, 50);
    Potion p2 = new Potion("PotionAttaqueMineure",1, 50);
    Potion p3 = new Potion("Potion de robustesse", 1, 50);
    ArrayList<Potion> potions=new ArrayList<>();
    potions.add(p1);
    potions.add(p2);
    potions.add(p3);
        System.out.println(potions);
    Personnage Jean = new Personnage(20, 20,50,potions);
        System.out.println(Jean.attaque());
        Creature loup = new Creature("loup", 5, 8);
        Creature gobelin = new Creature("gobelin", 6, 16);
        Creature troll = new Creature("troll", 14, 29);
        System.out.println(loup);
        Jean.combattreCreature(loup);
        Jean.combattreCreature(loup);
        Jean.combattreCreature(loup);

    }
}
