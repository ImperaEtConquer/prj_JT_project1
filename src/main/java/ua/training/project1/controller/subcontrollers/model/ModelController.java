package ua.training.project1.controller.subcontrollers.model;

import ua.training.project1.controller.subcontrollers.input.API;
import ua.training.project1.controller.subcontrollers.input.AddRandomCarState;
import ua.training.project1.controller.subcontrollers.input.InputController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class ModelController {

	private View view;
	private TaxiStation taxiStation;
	private InputController inputController;
	private CarFactory carFactory;

	public ModelController(InputController inputController, TaxiStation taxiStation) {
		this.inputController = inputController;
		this.view = inputController.getView();
		this.taxiStation = taxiStation;
		this.carFactory = new CarFactory();
	}

	public void process() {

		API api = new API(inputController, taxiStation, carFactory, view);
		view.printMenu();
		while (true) {
			api.setState();
			api.execute();
		}
	}

}
