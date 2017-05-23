package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;
import static ua.training.project1.view.View.MESSAGE_RESET;

class ResetState implements State {
	private TaxiStation taxiStation;
	private View view;

	public ResetState(TaxiStation taxiStation, View view) {
		this.taxiStation = taxiStation;
		this.view = view;
	}

	@Override
	public void execute() {
		taxiStation.removeAllCars();
		view.printKey(MESSAGE_RESET);
	}

}
