package es.cursojavafx.demolayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CssEjemplo08 extends Application {

	@Override
	public void start(Stage primaryStage) {
		VBox vbox = new VBox();
		Label lblTitulo = new Label("Título");
		Button btn1 = new Button("Botón 1");
		Label lblTextoNormal = new Label("Texto normal");		
		Label lblTexto2 = new Label("Otro texto de prueba");
		
		ListView<String> lv = new ListView<String>();
		
		lv.getItems().add("Elemento 1");
		lv.getItems().add("Elemento 2");		
		vbox.getChildren().addAll(lblTitulo, btn1, lblTextoNormal, lv);	
		Scene scene = new Scene(vbox, 500, 500);
		
		
		// Estilos en línea
		lblTitulo.setStyle("-fx-text-fill: red;-fx-font: 40 Impact");
		
		
		// Estilos desde CSS	
		scene.getStylesheets().add(getClass().getResource("DarkTheme.css").toExternalForm());
		
		// Añadimos clase a un Node para ponerle estilo a .negrita a la css
		lblTextoNormal.getStyleClass().add("negrita");
		
		// Le añadimos id al Node, para ponerle estilo desde css a #btn1
		btn1.setId("btn1");
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
