package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.controller.subcontrollers.model.CarFactory;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;
import static ua.training.project1.view.View.MESSAGE_ADD;

class AddRandomCarState implements State {
	private TaxiStation taxiStation;
	private CarFactory carFactory;
	private View view;

	public AddRandomCarState(TaxiStation taxiStation, CarFactory carFactory, View view) {
		this.taxiStation = taxiStation;
		this.carFactory = carFactory;
		this.view = view;
	}

	@Override
	public void execute() {
		taxiStation.addCar(carFactory.createRandomCar());
		view.printMessage(MESSAGE_ADD);
	}

}
