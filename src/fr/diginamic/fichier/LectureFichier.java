package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {


        Path pathFile = Paths.get("C:/Temp/recensement.csv");
        Boolean exists = Files.exists(pathFile);
        List<String> lines;
        {
            try {
                lines = Files.readAllLines(pathFile);
                lines.forEach(l-> System.out.println(l));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
