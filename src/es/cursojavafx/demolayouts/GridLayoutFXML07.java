package es.cursojavafx.demolayouts;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GridLayoutFXML07 extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GridLayoutFXML07.fxml"));
		Parent gp = fxmlLoader.load();
		
		Scene scene = new Scene(gp);
		primaryStage.setTitle("Gridlayout con FXML");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
