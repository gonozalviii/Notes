package com.oc;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class NoteItem extends HBox {

    public NoteItem() {
        CheckBox checkBox = new CheckBox();
        TextField textField = new TextField();
        getChildren().addAll(checkBox, textField);
    }
}
