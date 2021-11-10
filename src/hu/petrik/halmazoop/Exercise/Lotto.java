package hu.petrik.halmazoop.Exercise;

import hu.petrik.halmazoop.Set.Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lotto {

    private static Set<Integer> szamok;

    public static void Run() {
        szamok = new Set<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("lottosz.dat"));
            String sor = br.readLine();
            while (sor != null){
                
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
