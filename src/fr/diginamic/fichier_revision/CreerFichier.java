package fr.diginamic.fichier_revision;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) {
        ///////Creer Fichier//////////////////
        Path pathOrigin = Paths.get("C:\\Temp\\recensement.csv");
        Path pathDestination = Paths.get("C:\\Temp\\recensement_copie100Lines.csv");

        boolean FileExists = Files.exists(pathOrigin);

        if (FileExists) {
            try {
                List<String> lines = Files.readAllLines(pathOrigin, StandardCharsets.UTF_8);
                List<String> First100Lines = new ArrayList<>(lines.subList(0, Math.min(100, lines.size())));
                Files.write(pathDestination, First100Lines, StandardCharsets.UTF_8);
                System.out.println(First100Lines.size());
                First100Lines.forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
