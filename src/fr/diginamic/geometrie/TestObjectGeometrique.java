package fr.diginamic.geometrie;

public class TestObjectGeometrique {
    public static void main(String[] args) {

        Cercle c = new Cercle(3.0);
        Rectangle r = new Rectangle(4, 7);
        Carre car = new Carre(5);
        Sphere s = new Sphere(4.0);

        ObjetGeometrique[] obj = {c, r, car, s};
        for(ObjetGeometrique o: obj){
            System.out.println(o);
        }

        Objet3D objet3D [] = new Sphere[4];

    }
}
