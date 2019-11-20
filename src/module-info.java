module DemoLayouts {
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.web;
	requires javafx.base;
	
	
	exports es.cursojavafx.demolayouts;
	opens es.cursojavafx.demolayouts.controller;
}