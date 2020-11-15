//package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tetragrams {

    private static final Map<String, Double> tetragrams = new HashMap<>();

    static {
        try {
            File file = new File("english_quadgrams.txt");
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                String tetragram = data.substring(0,data.indexOf(" ")).toLowerCase();
                double count = Double.parseDouble(data.substring(data.indexOf(" ") + 1, data.length()));
                tetragrams.put(tetragram, count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File Not Found");
            e.printStackTrace();
        }
    }

    public Map<String, Double> getTetragrams() {
        return tetragrams;
    }
}
