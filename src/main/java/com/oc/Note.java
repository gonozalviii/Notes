package com.oc;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Note extends BorderPane {

    public Note(String text) {
        Label label = new Label(text);
        setTop(label);

        getStyleClass().add("note");

        ListView<NoteItem> listView = new ListView<>();
        setCenter(listView);

        Button addTodo = GlyphsDude.createIconButton(FontAwesomeIcon.PLUS_CIRCLE);
        setBottom(addTodo);
        addTodo.setOnAction(event -> listView.getItems().add(new NoteItem()));
    }
}
