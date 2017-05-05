package ua.training.project1.controller;

import java.util.Scanner;

import ua.training.project1.controller.subcontrollers.input.InputController;
import ua.training.project1.controller.subcontrollers.model.ModelController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class Controller {

	private TaxiStation model;
	private View view;
	
	public Controller(TaxiStation model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void processUser() {
		Scanner sc = new Scanner(System.in);
		InputController inputController = new InputController(sc, view);
		ModelController modelController = new ModelController(inputController, model);
		modelController.process();
	}

}
