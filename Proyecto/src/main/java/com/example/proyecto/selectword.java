package com.example.proyecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class selectword {
    public static int leer() throws IOException {
        int texto;
        try (BufferedReader lector = new BufferedReader(new FileReader("words.txt"))) {


            texto = 0;
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                texto++;


            }


        }
        return texto;
    }

    public static void main(String[] args) {
        int a=1;
        System.out.println(String.valueOf(a));
    }
}
