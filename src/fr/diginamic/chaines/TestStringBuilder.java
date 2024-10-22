package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        long debut = System.currentTimeMillis();
        for (int i = 0; i <=100000; i++) {
            s.append(i);
        }
        System.out.println(s.toString());
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes : " + (fin-debut));
    }
}
