package es.cursojavafx.demolayouts;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CssEjemplo09 extends Application {

	@Override
	public void start(Stage primaryStage) {
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("CssEjemplo09.fxml"));
		Parent vbox;
		try {
			vbox = fxml.load();
			Scene scene = new Scene(vbox);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Estilos con CSS");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
