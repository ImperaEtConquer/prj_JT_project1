package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class FindBySpeedState implements State {

	private TaxiStation taxiStation;
	private View view;
	private String parameters;

	public FindBySpeedState(TaxiStation taxiStation, View view, String parameters) {
		this.taxiStation = taxiStation;
		this.view = view;
		this.parameters = parameters;
	}

	@Override
	public void execute() {
		taxiStation.getCarListByParams(0,0); //TODO redo
		view.printMessage("");//TODO bundle
	}

}
