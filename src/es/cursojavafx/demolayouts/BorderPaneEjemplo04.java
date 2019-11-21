package es.cursojavafx.demolayouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Peque�a aplicacion de demo de un BorderPane
 * 
 * @author javafx
 *
 */
public class BorderPaneEjemplo04 extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Creaci�n de elementos para el TOP
		Button btn_top_1 = new Button("Bot�n 1");
		Button btn_top_2 = new Button("Bot�n 2");
		
		// Creaci�n de elementos para el LEFT
		Button btn_left_1 = new Button("Bot�n 3");
		Button btn_left_2 = new Button("Bot�n 4");
		
		// Creaci�n de elementos para el RIGHT
		Label lbl_right = new Label("Derecha");
		
		// Creaci�n de elementos para el BOTTOM
		Label lbl_bottom = new Label("Bottom de mi aplicaci�n usando un border Pane");
		
		// Creaci�n de elementos para el RIGHT
		Label lbl_center = new Label("Centro");
		
		//Creaci�n de layouts
		HBox hbox_top = new HBox();
		hbox_top.setAlignment(Pos.CENTER);
		
		VBox vbox_left = new VBox();
		vbox_left.setAlignment(Pos.CENTER);
		BorderPane bp = new BorderPane();
		
		hbox_top.getChildren().addAll(btn_top_1, btn_top_2);
		vbox_left.getChildren().addAll(btn_left_1, btn_left_2);
		
		// A�adimos nodos al border pane
		bp.setTop(hbox_top);
		bp.setRight(lbl_right);
		bp.setBottom(lbl_bottom);
		bp.setLeft(vbox_left);
		bp.setCenter(lbl_center);
		
		Scene scene = new Scene(bp, 600, 450);
		primaryStage.setTitle("Border Pane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
