package ua.training.project1.controller.subcontrollers;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Car;
import ua.training.project1.view.View;

public class ModelController {

	View view;
	TaxiStation model;
	ConsoleController consoleController;

	public ModelController(ConsoleController consoleController, TaxiStation model) {
		this.consoleController = consoleController;
		this.view = consoleController.getView();
		this.model = model;
	}

	public void process() {

	}
	
	private Car buildCar() {
		return null;
	}
}
