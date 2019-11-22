package es.cursojavafx.demolayouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridLayoutEjemplo06 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("Bot�n 1");
		Button btn2 = new Button("Bot�n 2");
		Button btn3 = new Button("Bot�n 3");
		Button btn4 = new Button("Bot�n 4");
		Button btn5 = new Button("Bot�n 5");
		Button btn6 = new Button("Bot�n 6");
		Button btn7 = new Button("Bot�n 7");
		Button btn8 = new Button("Bot�n 8");
		Button btn9 = new Button("Bot�n 9");
		
		ColorPicker cp = new ColorPicker();
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(20));
		gridPane.setGridLinesVisible(true);
				
		// A�adimos la primera fila
		gridPane.add(btn1, 0, 0);
		gridPane.add(btn2, 1, 0);
		gridPane.add(btn3, 2, 0);
		
		// A�adimos la segunda fila
		gridPane.add(btn4, 0, 1);
		gridPane.add(btn5, 1, 1);
		gridPane.add(btn6, 2, 1);
		
		// A�adimos la tercera fila
		gridPane.add(btn7, 0, 2);
		gridPane.add(btn8, 1, 2);
		gridPane.add(btn9, 2, 2);
		
		// A�adimos un color picker
		gridPane.add(cp,  5, 5);

		
		Scene scene = new Scene(gridPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("GridLayout Demo");
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);
	}

}
