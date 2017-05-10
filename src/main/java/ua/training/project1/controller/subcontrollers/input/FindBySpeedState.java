package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;
import static ua.training.project1.view.GlobalConstants.*;
import static ua.training.project1.view.Symbols.*;

class FindBySpeedState implements State {
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
		double min = getParams(parameters)[FIRST_SPEED_PARAMETER];
		double max = getParams(parameters)[SECOND_SPEED_PARAMETER];
		view.printCars(taxiStation.getCarListByParams(min, max));
	}

	private double[] getParams(String parameters) {
		double[] doubleParameters = new double[SPEED_PARAMETERS_AMOUNT];
		String[] stringParamaters = parameters.split(SPACE_SYMBOL);
		doubleParameters[FIRST_SPEED_PARAMETER] = Double.parseDouble(stringParamaters[FIRST_STRING_PARAMETER]);
		doubleParameters[SECOND_SPEED_PARAMETER] = Double.parseDouble(stringParamaters[SECOND_STRING_PARAMETER]);
		return doubleParameters;
	}

}
