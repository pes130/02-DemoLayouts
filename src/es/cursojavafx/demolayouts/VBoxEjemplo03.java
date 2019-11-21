package es.cursojavafx.demolayouts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Pequeña demo del layout VBox.
 * 
 * @author javafx
 *
 */
public class VBoxEjemplo03 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label lbl_username = new Label("Username:");
		TextField field_username = new TextField();
		Label lbl_password = new Label("Password:");
		PasswordField field_password = new PasswordField();
		Button btn_send = new Button("Enviar");

		ObservableList<Control> listaControles = FXCollections.observableArrayList(lbl_username, field_username,
				lbl_password, field_password, btn_send);

		VBox vbox = new VBox();

		// Añadimos nuestra lista de controles al layout
		vbox.getChildren().addAll(listaControles);

		vbox.setPadding(new Insets(20));
		vbox.setSpacing(10);

		// Establecemos alignment (Alineación)
		vbox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vbox, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo de VBox");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
