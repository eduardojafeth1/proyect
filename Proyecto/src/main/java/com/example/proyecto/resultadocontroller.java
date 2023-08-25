package com.example.proyecto;

import javafx.event.Event;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.Objects;

public class resultadocontroller {
    @FXML
  public  Label wL,lose;
    @FXML
    Button menu,conti;


    public void initialize() {

    }

    private void Chage(String a) throws IOException {
        Metodos Metodos =new Metodos();
        if (Objects.equals(a,conti.getText())){
            Metodos.cambiar("playscene.fxml",menu);
        } else if (Objects.equals(a,menu.getText())) {
            Metodos.cambiar("startscreen.fxml",menu);

        }
    }
    @FXML private void action(Event e) throws IOException {
        Button boton= (Button) e.getSource();
        String palabra=boton.getText();
        Chage(palabra);

    }

    }
