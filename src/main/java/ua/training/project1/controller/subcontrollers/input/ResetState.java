package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class ResetState implements State {

	TaxiStation taxiStation;
	View view;

	public ResetState(TaxiStation taxiStation, View view) {
		this.taxiStation = taxiStation;
		this.view = view;
	}

	@Override
	public void execute() {
		taxiStation.removeAllCars();
		view.printMessages("Reset."); //TODO RESET
	}

}
