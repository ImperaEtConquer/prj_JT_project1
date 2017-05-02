package ua.training.project1.controller;

import java.util.Scanner;

import ua.training.project1.controller.subcontrollers.ConsoleController;
import ua.training.project1.controller.subcontrollers.ModelController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class Controller {

	TaxiStation model;
	View view;
	
	public Controller(TaxiStation model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void processUser() {
		Scanner sc = new Scanner(System.in);
		ConsoleController consoleController = new ConsoleController(sc, view);
		ModelController modelController = new ModelController(consoleController);
		modelController.start();
	}

}
