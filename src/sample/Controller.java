package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.Date;

public class Controller {

    @FXML
    TextArea textArea; // Value injected by FXMLLoader

    @FXML
    void hej() {
        textArea.appendText("Hej!\n");
    }

    @FXML
    void nu() {
        textArea.setText("Nu er det " + new Date().toString());
    }

    @FXML
    void terning() {
        int terningeKast = (int)(Math.random() * 6) + 1;
        textArea.setText("Terningen viser " + terningeKast + "\n");
    }

}