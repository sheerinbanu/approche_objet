package fr.diginamic.geometrie;

import java.text.DecimalFormat;

public class Sphere implements Objet3D{

    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }



    @Override
    public double volume() {
        double volume = (4.0/3.0)*Math.PI*Math.pow(rayon,3);
        return Math.round(volume * 100.0) / 100.0;
    }

    @Override
    public double perimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        return 4*Math.PI*Math.pow(rayon, 2);
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
