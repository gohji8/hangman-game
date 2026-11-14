package com.gohji;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChoiceOfWords {
    private static final List<String> words = new ArrayList<>();

    private static void readFile() { //todo для пути глянуть ClassLoader
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\main\\resources\\words.txt"))) {
            String word;
            while ((word = reader.readLine()) != null) {
                words.add(word);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static String returnRandomWord(){
        readFile();
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }

}
