package fr.diginamic.banque;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0]= new Compte(4567, 4567.99);
        comptes[1]= new CompteTaux(8888, 54326.88, 44.7);
        for(Compte c: comptes){
            System.out.println(c);
        }
    }

}
