package es.cursojavafx.demolayouts.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class HBoxFXML02Controller implements Initializable {
	@FXML
	private Button btn1;

	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@FXML
	private Button btn4;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Inicio desde HBoxFXML02Controller!!");
		
	}
	
	
}
