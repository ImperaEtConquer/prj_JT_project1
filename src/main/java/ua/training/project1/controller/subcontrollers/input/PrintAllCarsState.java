package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class PrintAllCarsState implements State {

	private TaxiStation taxiStation;
	private View view;

	public PrintAllCarsState(TaxiStation taxiStation, View view) {
		this.taxiStation = taxiStation;
		this.view = view;
	}

	@Override
	public void execute() {
		view.printCars(taxiStation.getCars());
	}

}
