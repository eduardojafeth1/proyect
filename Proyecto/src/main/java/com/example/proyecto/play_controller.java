package com.example.proyecto;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

import static java.awt.Color.gray;
import static java.awt.Color.green;


public class play_controller {
   public void initialize(){
       tryword="";
      labels=new Label[][]{{a0,a1,a2,a3,a4},
                        {b0,b1,b2,b3,b4},
                        {c0,c1,c2,c3,c4},
                        {d0,d1,d2,d3,d4},
                        {e0,e1,e2,e3,e4},
                        {f0,f1,f2,f3,f4}};
   }

   @FXML public Label a0,a1,a2,a3,a4,b0,b1,b2,b3,b4,c0,c1,c2,c3,c4,d0,d1,d2,d3,d4,e0,e1,e2,e3,e4,f0,f1,f2,f3,f4;
   private int labelspace=0,intento=0;
   private Label[][] labels;
   private String word ="MARTA",tryword;
  @FXML private Button ent;


  /// @FXML private void presiondeboton(ActionEvent e){
     /// a0.setText(e.toString());
   ///}
  @FXML public void qaction(){
     if (labelspace<5){
     labels[intento][labelspace].setText("Q");
     tryword+="Q";
     labelspace++;}
  }
    @FXML public void waction(){
      if (labelspace<5){
         labels[intento][labelspace].setText("W");
          tryword+="W";
         labelspace++;}
   }
    @FXML public void eaction(){
      if (labelspace<5){
         labels[intento][labelspace].setText("E");
          tryword+="E";
         labelspace++;}
   }
    @FXML public void raction(){
      if (labelspace<5){
         labels[intento][labelspace].setText("R");
          tryword+="R";
         labelspace++;}
   }
    @FXML public void taction(){
      if (labelspace<5){
         labels[intento][labelspace].setText("T");
          tryword+="T";
         labelspace++;}
   }
    @FXML public void yaction(){
      if (labelspace<5){
         labels[intento][labelspace].setText("Y");
          tryword+="T";
         labelspace++;}
   }
    @FXML public void uaction(){
      if (labelspace<5){
         labels[intento][labelspace].setText("U");
          tryword+="U";
         labelspace++;}
   }
    @FXML public void iaction(){
      if (labelspace<5){
          tryword+="I";
         labels[intento][labelspace].setText("I");
         labelspace++;}
   }
    @FXML public void oaction(){
      if (labelspace<5){
          tryword+="O";
         labels[intento][labelspace].setText("O");
         labelspace++;}
   }
    @FXML public void paction(){
      if (labelspace<5){
          tryword+="P";
         labels[intento][labelspace].setText("P");
         labelspace++;}
   }
    @FXML public void aaction(){
      if (labelspace<5){
          tryword+="A";
         labels[intento][labelspace].setText("A");
         labelspace++;}
   }
    @FXML public void saction(){
      if (labelspace<5){
          tryword+="S";
         labels[intento][labelspace].setText("S");
         labelspace++;}
   }
    @FXML public void daction(){
      if (labelspace<5){
          tryword+="D";
         labels[intento][labelspace].setText("D");
         labelspace++;}
   }
    @FXML public void faction(){
      if (labelspace<5){
          tryword+="F";
         labels[intento][labelspace].setText("F");
         labelspace++;}
   }
    @FXML public void gaction(){
      if (labelspace<5){
          tryword+="G";
         labels[intento][labelspace].setText("G");
         labelspace++;}
   }
    @FXML public void haction(){
      if (labelspace<5){
          tryword+="H";
         labels[intento][labelspace].setText("H");
         labelspace++;}
   }
   @FXML public void jaction(){
      if (labelspace<5){
          tryword+="J";
         labels[intento][labelspace].setText("J");
         labelspace++;}
   }
    @FXML public void kaction(){
      if (labelspace<5){
          tryword+="K";
         labels[intento][labelspace].setText("K");
         labelspace++;}
   }
    @FXML public void laction(){
      if (labelspace<5){
          tryword+="L";
         labels[intento][labelspace].setText("L");
         labelspace++;}
   }
    @FXML public void zaction(){
      if (labelspace<5){
          tryword+="Z";
         labels[intento][labelspace].setText("Z");
         labelspace++;}
   }
    @FXML public void xaction(){
      if (labelspace<5){
          tryword+="X";
         labels[intento][labelspace].setText("X");
         labelspace++;}
   }
    @FXML public void caction(){
      if (labelspace<5){
          tryword+="C";
         labels[intento][labelspace].setText("C");
         labelspace++;}
   }
    @FXML public void vaction(){
      if (labelspace<5){
          tryword+="V";
         labels[intento][labelspace].setText("V");
         labelspace++;}
   }
    @FXML public void baction(){
      if (labelspace<5){
          tryword+="B";
         labels[intento][labelspace].setText("B");
         labelspace++;}
   }
    @FXML public void naction(){
      if (labelspace<5){
          tryword+="N";
          labels[intento][labelspace].setText("N");
         labelspace++;}
   }
    @FXML public void maction(){
      if (labelspace<5){
          tryword+="M";
         labels[intento][labelspace].setText("M");
         labelspace++;}
   }


   @FXML private void clraction(){
     if (labelspace>0){labels[intento][labelspace-1].setText("");
         tryword=tryword.substring(0,tryword.length()-1);
     labelspace--;}

   }
   @FXML private void entaction(){
     if(labelspace==5){
        ent.setText(tryword);
    verificacion(word,tryword);
         tryword="";
         labelspace=0;
     intento++;
     }
   }
    private void verificacion(String word,String wordin){

        for (int i=0;i<5;i++){
            if (word.charAt(i) == wordin.charAt(i)) {
          labels[intento][i].setStyle("-fx-background-color: green");

            } else if (word.contains(String.valueOf(wordin.charAt(i)))) {
                labels[intento][i].setStyle("-fx-background-color: yellow");

            }

            else {
                labels[intento][i].setStyle("-fx-background-color: gray");
            }}


    }
   }

