package fr.diginamic.geometrie;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere implements Objet3D{

    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double volume() {
        double volume = (4.0/3.0)*PI*pow(rayon,3.0);
        return Math.round(volume * 100.0) / 100.0;
    }

    @Override
    public double perimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        return 4*PI*pow(rayon, 2);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    @Override
    public String toString() {
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }

}
