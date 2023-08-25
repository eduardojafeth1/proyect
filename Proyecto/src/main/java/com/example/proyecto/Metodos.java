package com.example.proyecto;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;



public class Metodos {
 public    boolean win;
    ArrayList<Integer> numeros=new ArrayList<>();
    

String Selectword() throws IOException {
    Random numrand = new Random();
    int num;
    String  word;

    String[] palabras = new String[1000];

    FileReader leer = new FileReader("src\\words.txt");
    BufferedReader narrador = new BufferedReader(leer);

    for(int i=0;i<1000;i++) {
        palabras[i] = narrador.readLine();
    }
    while (true){
        num=numrand.nextInt(1000);
    if (!numeros.contains(num)){
    numeros.add(num);
    break;
    }
    }
    word = palabras[num];
    return word;
}
    void cambiar(String archivo, Node b) throws IOException {

            FXMLLoader cargar=new FXMLLoader(getClass().getResource(archivo));
            Scene scene=new Scene(cargar.load());
            Stage stage=(Stage) b.getScene().getWindow();
            stage.setScene(scene);

    }

    boolean wordExist(String t) throws IOException {
    boolean v=false;
    BufferedReader b=new BufferedReader(new FileReader("src\\words.txt"));
    String line;
    while ((line=b.readLine())!=null) {
        if (line.contains(t)) {
            v=true;
            break;
        }
        }
    return v;

}}