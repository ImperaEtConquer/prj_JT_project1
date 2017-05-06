package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class SortByFuelState implements State {

	TaxiStation taxiStation;
	View view;

	public SortByFuelState(TaxiStation taxiStation, View view) {
		this.taxiStation = taxiStation;
		this.view = view;
	}

	@Override
	public void execute() {
		taxiStation.sortByFuelConsumption();
		view.printMessage("Sorted."); // TODO bundle
	}

}
