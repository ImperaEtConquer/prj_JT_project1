package ua.training.project1.controller.subcontrollers.state;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;
import static ua.training.project1.view.GlobalConstants.*;

class FindBySpeedState implements State {
	private TaxiStation taxiStation;
	private View view;
	private double[] parameters;

	public FindBySpeedState(TaxiStation taxiStation, View view, double[] parameters) {
		this.taxiStation = taxiStation;
		this.view = view;
		this.parameters = parameters;
	}

	@Override
	public void execute() {
		double min = parameters[FIRST_SPEED_PARAMETER];
		double max = parameters[SECOND_SPEED_PARAMETER];
		view.printCars(taxiStation.getCarListByParams(min, max));
	}

}
