package com.example.proyecto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class start_controller {
    private void cambiar(String a) throws IOException {
        if (a==start.getText()){
            FXMLLoader cargar=new FXMLLoader(getClass().getResource("playscene.fxml"));
            Scene scene=new Scene(cargar.load());
            Stage stage=(Stage) start.getScene().getWindow();
            stage.setScene(scene);
        }
    }
    @FXML private Button credits,start;
    @FXML private void action(Event e) throws IOException {
        Button boton= (Button) e.getSource();
        String palabra=boton.getText();
        cambiar(palabra);

    }

}
