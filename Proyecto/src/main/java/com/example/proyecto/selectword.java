package com.example.proyecto;

import javax.print.DocFlavor;
import java.io.*;
import java.util.Random;



public class selectword {
/*    public static void main(String[] args) throws IOException {


        Random numrand = new Random();
        String palabra, word;

        String[] palabras = new String[1000];

        FileReader leer = new FileReader("src\\words.txt");
        BufferedReader narrador = new BufferedReader(leer);

       for(int i=0;i<1000;i++) {
            palabras[i] = narrador.readLine();
            System.out.println(palabras[i]);
        }
        word = palabras[numrand.nextInt(1000)];

    }*/
String Selectword() throws IOException {
    Random numrand = new Random();
    int[] norepeat;
    String palabra, word;

    String[] palabras = new String[1000];

    FileReader leer = new FileReader("src\\words.txt");
    BufferedReader narrador = new BufferedReader(leer);

    for(int i=0;i<1000;i++) {
        palabras[i] = narrador.readLine();

    }
    word = palabras[numrand.nextInt(1000)];
    return word;
}
}