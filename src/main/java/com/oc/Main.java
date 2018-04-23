package com.oc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/gui.fxml"));
		primaryStage.setTitle("Notes App");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
        primaryStage.show();
    }
}