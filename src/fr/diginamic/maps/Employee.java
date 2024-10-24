package fr.diginamic.maps;

public class Employee {
    private String prenom;
    private double salaire;

    public Employee(String prenom, double salaire) {
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
