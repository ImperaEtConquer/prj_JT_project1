package ua.training.project1.controller.subcontrollers.model;

import ua.training.project1.controller.subcontrollers.input.ConsoleController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class ModelController {

	private View view;
	private TaxiStation model;
	private ConsoleController consoleController;

	public ModelController(ConsoleController consoleController, TaxiStation model) {
		this.consoleController = consoleController;
		this.view = consoleController.getView();
		this.model = model;
	}

	public void process() {
		view.printMessage(View.WELCOME);
		consoleController.getString("");	//TODO REGEX
		model.addCar(null);
	}

}
