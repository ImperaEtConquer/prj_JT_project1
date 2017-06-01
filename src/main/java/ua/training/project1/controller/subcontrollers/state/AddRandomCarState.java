package ua.training.project1.controller.subcontrollers.state;

import ua.training.project1.controller.subcontrollers.model.CarFactory;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;
import static ua.training.project1.view.View.MESSAGE_ADD;

class AddRandomCarState implements State {
	private TaxiStation taxiStation;
	private View view;

	public AddRandomCarState(TaxiStation taxiStation, View view) {
		this.taxiStation = taxiStation;
		this.view = view;
	}

	@Override
	public void execute() {
		taxiStation.addCar(CarFactory.getInstance().createRandomCar());
		view.printKey(MESSAGE_ADD);
	}

}
