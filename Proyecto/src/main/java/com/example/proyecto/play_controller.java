package com.example.proyecto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class play_controller {
   @FXML
   private Button qbutton;
   @FXML
   private Button wbutton;
   @FXML public Label a0;
   @FXML public Label a1;
   @FXML public Label a2;
   @FXML public Label a3;
   @FXML public Label a4;


   public void qaction(Event e){
      qbutton.setText("W");

   }

   public void waction(Event e){
      a0.setText("W");
      a0.toString();
   } public void eaction(Event e){
      a0.setText("e");
   } public void raction(Event e){
      a0.setText("r");
   } public void taction(Event e){
      a0.setText("t");
   } public void yaction(Event e){
      a0.setText("y");
   } public void uaction(Event e){
      a0.setText("u");
   } public void iaction(Event e){
      a0.setText("i");
   } public void oaction(Event e){
      a0.setText("o");
   } public void paction(Event e){
      a0.setText("p");
   }
}
