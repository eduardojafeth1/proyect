package com.example.proyecto;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;


import java.io.IOException;


public class play_controller {


    public void initialize() throws IOException {
       tryword="";

       word=metodo0.Selectword();

      labels=new Label[][]{{a0,a1,a2,a3,a4},
                        {b0,b1,b2,b3,b4},
                        {c0,c1,c2,c3,c4},
                        {d0,d1,d2,d3,d4},
                        {e0,e1,e2,e3,e4},
                        {f0,f1,f2,f3,f4}};
        letras=new int[5];
        botones=new Button[]{abutton,bbutton,cbutton,dbutton,ebutton,fbutton,gbutton,hbutton,ibutton,jbutton,kbutton,lbutton,mbutton,nbutton,obutton,pbutton,qbutton,rbutton,sbutton,tbutton,ubutton,vbutton,wbutton,xbutton,ybutton,zbutton};
   }

   @FXML private Label etiqueta,a0,a1,a2,a3,a4,b0,b1,b2,b3,b4,c0,c1,c2,c3,c4,d0,d1,d2,d3,d4,e0,e1,e2,e3,e4,f0,f1,f2,f3,f4;
    @FXML private Button abutton,bbutton,cbutton,dbutton,ebutton,fbutton,gbutton,hbutton,ibutton,jbutton,kbutton,lbutton,mbutton,nbutton,obutton,pbutton,qbutton,rbutton,sbutton,tbutton,ubutton,vbutton,wbutton,xbutton,ybutton,zbutton;
    @FXML
    VBox root;

   private int labelspace=0,intento=0;
   private Label[][] labels;
   private int[] letras;
   private Button[] botones;
   public String word,tryword;
    Metodos metodo0=new Metodos();



  /// @FXML private void presiondeboton(ActionEvent e){
     /// a0.setText(e.toString());
   ///}
  @FXML private void qaction(){
      action("Q",16);
  }
    @FXML public void waction(){
      action("W",22);
   }
    @FXML public void eaction(){
      action("E",4);
   }
    @FXML public void raction(){
      action("R",17);
   }
    @FXML public void taction(){
      action("T",19);
   }
    @FXML public void yaction(){
      action("Y",24);
   }
    @FXML public void uaction(){
      action("U",20);
   }
    @FXML public void iaction(){
      action("I",8);
   }
    @FXML public void oaction(){
      action("O",14);
   }
    @FXML public void paction(){
      action("P",15);
   }
    @FXML public void aaction(){
      action("A",0);
   }
    @FXML public void saction(){
      action("S",18);
   }
    @FXML public void daction(){
      action("D",3);
   }
    @FXML public void faction(){
      action("F",5);
   }
    @FXML public void gaction(){
      action("G",6);
   }
    @FXML public void haction(){
      action("H",7);
   }
   @FXML public void jaction(){
      action("J",9);
   }
    @FXML public void kaction(){
      action("K",10);
   }
    @FXML public void laction(){
      action("L",11);
   }
    @FXML public void zaction(){
      action("Z",25);
   }
    @FXML public void xaction(){
      action("X",23);
   }
    @FXML public void caction(){
      action("C",2);
   }
    @FXML public void vaction(){
      action("V",21);
   }
    @FXML public void baction()  {
      action("B",1);
   }
    @FXML public void naction()  {
      action("N",13);
   }
    @FXML public void maction(){
      action("M",12);
   }

    @FXML private void clraction(){
     if (labelspace>0){labels[intento][labelspace-1].setText("");
         tryword=tryword.substring(0,tryword.length()-1);
     labelspace--;}

   }
   @FXML private void entaction() throws IOException {
      if(metodo0.wordExist(tryword)){if(labelspace==5){
    verificacion(word,tryword);
         tryword="";
         labelspace=0;
     intento++;
     if(intento==6){
         for (Button botone : botones) {
             botone.setDisable(true);
         }
         metodo0.cambiar("resultadoview.fxml",root);
       /// etiqueta.setStyle("-fx-background-color: #f00000");
     }
etiqueta.setText("");
     }}
      else {
          etiqueta.setText("invalid");
      }
   }
    private void verificacion(String word,String wordin) throws IOException {
        int win0=0;
        for (int i=0;i<5;i++){
            if (word.charAt(i) == wordin.charAt(i)) {
          labels[intento][i].setStyle("-fx-background-color: #6AAA64");
          botones[letras[i]].setStyle("-fx-background-color: #6AAA64");
          win0++;
          if (win0==5){
             metodo0.win=true;
              for (Button botone : botones) {
                  botone.setDisable(true);
              }
              metodo0.cambiar("WINview.fxml",root);
          }

            } else if (word.contains(String.valueOf(wordin.charAt(i)))) {
                labels[intento][i].setStyle("-fx-background-color: #c9b458");
                botones[letras[i]].setStyle("-fx-background-color: #C9B458");
            }

            else {
                labels[intento][i].setStyle("-fx-background-color: #787c7e");
                botones[letras[i]].setDisable(true);
                botones[letras[i]].setStyle("-fx-background-color: #787C7E");
            }}


    }


    private void action(String l,int p){
        if (labelspace<5){
            labels[intento][labelspace].setText(l);
            tryword+=l;
            letras[labelspace]=p;
            labelspace++;}
    }
    @FXML private void typear(KeyEvent event) throws IOException {
        String tipeo=event.getCode().toString();
        switch (tipeo) {
            case "A" -> action(tipeo, 0);
            case "B" -> action(tipeo, 1);
            case "C" -> action(tipeo, 2);
            case "D" -> action(tipeo, 3);
            case "E" -> action(tipeo, 4);
            case "F" -> action(tipeo, 5);
            case "G" -> action(tipeo, 6);
            case "H" -> action(tipeo, 7);
            case "I" -> action(tipeo, 8);
            case "J" -> action(tipeo, 9);
            case "K" -> action(tipeo, 10);
            case "L" -> action(tipeo, 11);
            case "M" -> action(tipeo, 12);
            case "N" -> action(tipeo, 13);
            case "O" -> action(tipeo, 14);
            case "P" -> action(tipeo, 15);
            case "Q" -> action(tipeo,16);
            case "R" -> action(tipeo, 17);
            case "S" -> action(tipeo, 18);
            case "T" -> action(tipeo, 19);
            case "U" -> action(tipeo, 20);
            case "V" -> action(tipeo, 21);
            case "W" -> action(tipeo, 22);
            case "X" -> action(tipeo, 23);
            case "Y" -> action(tipeo, 24);
            case "Z" -> action(tipeo, 25);
            case "BACK_SPACE"->{
                if (labelspace > 0) {
                    labels[intento][labelspace - 1].setText("");
                    tryword = tryword.substring(0, tryword.length() - 1);
                    labelspace--;
                }

            }
            case "ENTER"-> {
                if(metodo0.wordExist(tryword)){if(labelspace==5){
                verificacion(word,tryword);
                tryword="";
                labelspace=0;
                intento++;
                if(intento==6){
                    for (Button botone : botones) {
                        botone.setDisable(true);
                    }
                    metodo0.cambiar("resultadoview.fxml",root);
                    /// etiqueta.setStyle("-fx-background-color: #f00000");
                }
                etiqueta.setText("");
            }}
            else {
                etiqueta.setText("invalid");
            }
        }
            default -> /*throw new IllegalStateException("Unexpected value: " + tipeo)*/{
            }
        }


        }


    }

