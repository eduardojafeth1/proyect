package com.example.proyecto;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class creditscontroller {
    @FXML
    Button btnmenu;
    @FXML private void menu() throws IOException {
        Metodos Metodos =new Metodos();
        Metodos.cambiar("startscreen.fxml",btnmenu);
    }
}
