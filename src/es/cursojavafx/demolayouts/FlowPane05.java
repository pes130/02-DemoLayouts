package es.cursojavafx.demolayouts;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Demo de layout FlowPane
 * 
 * @author javafx
 *
 */
public class FlowPane05 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Botón 1");
		Button btn2 = new Button("Botón 2");
		Button btn3 = new Button("Botón 3");
		Button btn4 = new Button("Botón 4");
		Button btn5 = new Button("Botón 5");
		Button btn6 = new Button("Botón 6");

		FlowPane fp = new FlowPane(Orientation.VERTICAL);

		fp.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);

		Scene scene = new Scene(fp, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("FlowPane demo");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
