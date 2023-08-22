package com.example.proyecto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWordFromFile {

    public static void main(String[] args) {
        String randomWord = getRandomWordFromFile("src\\words.txt");
        char[] wordArray = randomWord.toCharArray();

        System.out.println("Palabra seleccionada: " + randomWord);
        System.out.print("Palabra en forma de array: ");
        for (char c : wordArray) {
            System.out.print(c + " ");
        }
    }

    public static String getRandomWordFromFile(String fileName) {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                words.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (words.isEmpty()) {
            throw new RuntimeException("El archivo está vacío o no se pudo leer.");
        }

        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
}
