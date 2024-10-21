package fr.diginamic.Operations;

public class Operations {

    public static double calcul(double a, double b, char operateur) {
        if (operateur == '+') {
            return a + b;
        } else if (operateur == '-') {
            return a - b;
        } else if (operateur == '*') {
            return a * b;
        } else if (operateur == '/') {
            if (b == 0) {
                throw new ArithmeticException("Pas de division par zéro");
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("Opérateur non supporté : " + operateur);
        }
    }
}
