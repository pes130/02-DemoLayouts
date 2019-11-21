package es.cursojavafx.demolayouts;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Ejemplo de uso de un HBox, pero definido en un fichero
 * FXML
 * 
 * @author javafx
 *
 */
public class HBoxFXML02 extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader fxml = new FXMLLoader(getClass().getResource("HBox02.fxml"));
		/* Parent es una clase abstracta, base para todos
		 * los nodos que tienen hijos. En nuestro caso, almacenaremos el layout HBox que 
		 * hemos definido en el FXML
		 */
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
