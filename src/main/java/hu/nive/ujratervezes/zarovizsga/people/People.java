package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class People {
    public int getNumberOfMales(String path) {
         try {
            List<String> lines = Files.readAllLines(Path.of(path));

            return maleCounter(lines);
        }
         catch (IOException ioe) {
             throw new IllegalStateException("Can not read file!");
         }
    }

    private int maleCounter(List<String> lines) {
        int count = 0;
        for (String c : lines.<String>containsAll("Male")) ;

    count++;}
}




