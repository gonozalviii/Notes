package com.oc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.TilePane;

import java.util.Optional;

public class Controller {

    @FXML
    private TilePane dashboard;

    @FXML
    private void addNote(ActionEvent actionEvent) {
        TextInputDialog dialog = new TextInputDialog("Titel please");
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(text -> dashboard.getChildren().add(new Note(text)));
    }
}
