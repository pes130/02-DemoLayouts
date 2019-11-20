package es.cursojavafx.demolayouts;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HBoxFXML02 extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("HBox02.fxml"));
		Parent hbox = fxml.load();
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("HBox con FXML");
		primaryStage.show();
			
	}

	public static void main(String[] args) {
		launch(args);
	}
}
