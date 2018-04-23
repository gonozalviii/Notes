package com.oc;

import javafx.geometry.Pos;
import javafx.scene.CacheHint;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class NoteItem extends HBox {

    public NoteItem(String todo) {
        setCacheHint(CacheHint.SPEED);
        getStyleClass().add("noteitem");

        CheckBox checkBox = new CheckBox();
        TextField note = new TextField();
        note.setPrefWidth(80);
        setAlignment(Pos.CENTER);
        note.setText(todo);
        note.disableProperty().bind(checkBox.selectedProperty());
        getChildren().addAll(checkBox, note);
    }

}
