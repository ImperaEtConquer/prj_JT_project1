package ua.training.project1.controller;

import java.util.Scanner;

import ua.training.project1.controller.subcontrollers.input.InputController;
import ua.training.project1.controller.subcontrollers.model.ModelController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class Controller {
	private TaxiStation taxiStation;
	private View view;

	public Controller(TaxiStation taxiStation, View view) {
		this.taxiStation = taxiStation;
		this.view = view;
	}

	public void processUser() {
		Scanner sc = new Scanner(System.in);
		InputController inputController = new InputController(sc, view);
		ModelController modelController = new ModelController(inputController, taxiStation, view);
		modelController.process();
	}

}
