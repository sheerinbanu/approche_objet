package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) {

        Path pathOrigin = Paths.get("C:/Temp/recensement.csv");
        Path pathDestination = Paths.get("C:/Temp/recensement_copie.csv");
        List<String> lines;
        List<String> copiedLines;

        try {
            lines = Files.readAllLines(pathOrigin);
            System.out.println("original" + lines.size());
            copiedLines= lines.subList(0,Math.min(100, lines.size()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.write(pathDestination,copiedLines);
            copiedLines.forEach(l-> System.out.println(l));
            System.out.println(copiedLines.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
