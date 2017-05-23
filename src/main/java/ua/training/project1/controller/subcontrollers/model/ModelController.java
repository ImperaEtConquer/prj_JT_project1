package ua.training.project1.controller.subcontrollers.model;

import ua.training.project1.controller.subcontrollers.input.StateController;
import ua.training.project1.controller.subcontrollers.input.InputController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class ModelController {
	private View view;
	private TaxiStation taxiStation;
	private InputController inputController;

	public ModelController(InputController inputController, TaxiStation taxiStation, View view) {
		this.inputController = inputController;
		this.view = view;
		this.taxiStation = taxiStation;
	}

	public void process() {
		StateController stateController = new StateController(inputController, taxiStation, view);
		view.printMenu();
		while (true) {
			stateController.setState();
			stateController.execute();
			view.printMenu();
		}
	}

}
