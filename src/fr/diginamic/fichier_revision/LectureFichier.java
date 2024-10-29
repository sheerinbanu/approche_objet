package fr.diginamic.fichier_revision;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {

        Path pathOrigin = Paths.get("C:\\Temp\\recensement.csv");
        Path pathFiltered = Paths.get("C:\\Temp\\villes_plus_25000_habitants.csv");

        ArrayList<Ville> villes = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(pathOrigin, StandardCharsets.UTF_8);
            String tokens [];
            for (int i = 1; i <lines.size() ; i++) {
                String line =  lines.get(i);
                tokens = line.split(";");
    //            System.out.println(Arrays.toString(tokens));

                if(tokens.length>9){
                    Ville v = new Ville();
                    v.setNom(tokens[1]);
                    v.setDept(tokens[2]);
                    v.setRegion(tokens[6]);
                    v.setPopulation(tokens[9]);

                    villes.add(v);
                }
            }
            System.out.println("Villes :");
                villes.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String> filteredLines= new ArrayList<>();
        filteredLines.add("Nom;Code département; Nom de la région; Population totale");

            for(Ville v:villes){
                if(Integer.parseInt(v.getPopulation())>25000){
                    String line = String.format("%s;%s;%s;%s",
                       v.getNom(),
                       v.getDept(),
                       v.getRegion(),
                       v.getPopulation());
                    filteredLines.add(line);
                }
            }

        try {
            Files.write(pathFiltered,filteredLines,StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ///////////Lire Fichier/////////////////////////////////
        boolean FileExists = Files.exists(pathOrigin);
        if (FileExists) {
            try {
                List<String> lines = Files.readAllLines(pathOrigin, StandardCharsets.UTF_8);
                for (String line : lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
