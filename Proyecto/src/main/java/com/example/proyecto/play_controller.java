package com.example.proyecto;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Scanner;

public class play_controller {
   public void initialize(){
      labels=new Label[]{a0,a1,a2,a3,a4};
   }

   @FXML public Label a0,a1,a2,a3,a4;
   private int labelspace=0;
   private Label[] labels;
   private String word="MARTA"


  /// @FXML private void presiondeboton(ActionEvent e){
     /// a0.setText(e.toString());
   ///}
  public void qaction(){
     if (labelspace<5){
     labels[labelspace].setText("Q");
     labelspace++;}
  }
   public void waction(){
      labels[labelspace].setText("W");
      labelspace++;
   }


    public void eaction(){
      labels[labelspace].setText("e");
   }
   public void raction(){
      a0.setText("r");
   }
   public void taction(){
      a0.setText("t");
   }
   public void yaction(){
      a0.setText("y");
   }
   public void uaction(){
      a0.setText("u");
   }
   public void iaction(){
      a0.setText("i");
   }
   public void oaction(){
      a0.setText("o");
   }
   public void paction(){
      a0.setText("p");
   }
   @FXML private void clraction(){
     if (labelspace>0){labels[labelspace-1].setText("");
     labelspace--;}

   }
   @FXML private void entaction(){
     if(labelspace==5){
        String attemp;
        for(int i=0;i<labels.length;i++){
           attemp=labels[i];
        }


        


     }
   }

   }

