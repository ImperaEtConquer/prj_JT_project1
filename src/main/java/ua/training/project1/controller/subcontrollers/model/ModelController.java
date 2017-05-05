package ua.training.project1.controller.subcontrollers.model;

import ua.training.project1.controller.subcontrollers.input.InputController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Vehicle;
import ua.training.project1.model.entities.interfaces.PassengerCar;
import ua.training.project1.view.View;

public class ModelController {

	private View view;
	private TaxiStation model;
	private InputController inputController;
	private CarFactory carFactory;

	public ModelController(InputController inputController, TaxiStation model) {
		this.inputController = inputController;
		this.view = inputController.getView();
		this.model = model;
		this.carFactory = new CarFactory();
	}

	public void process() {
		view.printMenu();
		
		
	}

	private Vehicle createCar() throws Exception {
		return carFactory.createCar();
	}

}
