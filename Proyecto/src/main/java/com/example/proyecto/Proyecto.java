package com.example.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Proyecto extends Application{
    @Override
    public void start( Stage stage) throws Exception {
        FXMLLoader fxmlLoader= new FXMLLoader(Proyecto.class.getResource("startscreen.fxml"));
        Scene raiz= new Scene(fxmlLoader.load());
        stage.setTitle("Proyecto");
        stage.setScene(raiz);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
        /*String palabra="MARTA";
        String palabrahide=".....";
        System.out.println(palabrahide);
        int i=0;
        Scanner teclado = new Scanner(System.in);
        while(!palabra.equals(palabrahide) && i<2){

            String input= teclado.next();
            palabrahide=proyecto(palabra,input);
            System.out.println(palabrahide);
            i++;


        }
      if (palabrahide.equals(palabra)){
          System.out.println("felicidades");
      }else {
          System.out.println("perdiste");
          System.out.println("la palabra correcta era "+palabra);
     */ }



    }
   /*static String proyecto(String word,String wordin){
        String retorno="";
        String valores="";
        for (int i=0;i<5;i++){
       if (word.charAt(i) == wordin.charAt(i)) {
           retorno = retorno + wordin.charAt(i);
           valores += "V";

       } else if (word.contains(String.valueOf(wordin.charAt(i)))) {
           valores+="Y";
           retorno = retorno + '.';

       }

       else {
           retorno = retorno + '.';
           valores += "G";
       }}
       System.out.println(valores);
       return retorno;

}*/

