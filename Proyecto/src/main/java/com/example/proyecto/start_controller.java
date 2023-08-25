package com.example.proyecto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.util.Objects;

public class start_controller {
    private void Cambiar(String a) throws IOException {
        Metodos Metodos =new Metodos();
        if (Objects.equals(a, start.getText())){
            Metodos.cambiar("playscene.fxml",credits);
        } else if (Objects.equals(a, credits.getText())) {
            Metodos.cambiar("Creditsview.fxml",credits);

        }
    }
    @FXML private Button credits,start;
    @FXML private void action(Event e) throws IOException {
        Button boton= (Button) e.getSource();
        String palabra=boton.getText();
        Cambiar(palabra);

    }

}
