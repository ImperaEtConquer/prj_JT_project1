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
		double min = getParams(parameters)[0];
		double max = getParams(parameters)[1];
		view.printCars(taxiStation.getCarListByParams(min, max));
	}
	
	private double[] getParams(String parameters) {
		double[] doubleParameters = new double[2];
		String[] stringParamaters = parameters.split(" ");
		doubleParameters[0] = Double.parseDouble(stringParamaters[1]);
		doubleParameters[1] = Double.parseDouble(stringParamaters[2]);
		return doubleParameters;
	}

}
