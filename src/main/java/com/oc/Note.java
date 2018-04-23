package com.oc;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.CacheHint;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.util.Optional;

/**
 * @author Ramon Victor, Opitz Consulting Deutschland, 12.04.2018
 */
public class Note extends BorderPane {

    public Note(String text) {
        setCacheHint(CacheHint.SPEED);
        setPadding(new Insets(10));
        setPrefSize(150, 200);
        TextField header = new TextField(text);
        setTop(header);
        setAlignment(header, Pos.CENTER);

        getStyleClass().add("note");

        ListView<NoteItem> listView = new ListView<>();
        setCenter(listView);

        Button addTodo = GlyphsDude.createIconButton(FontAwesomeIcon.PLUS_CIRCLE);
        setBottom(addTodo);
        setAlignment(addTodo, Pos.CENTER);
        TextInputDialog inputDialog = new TextInputDialog("ToDo");
        addTodo.setOnAction(event -> {
            Optional<String> result = inputDialog.showAndWait();
            result.ifPresent(todo -> listView.getItems().add(new NoteItem(todo)));
        });
    }

}
