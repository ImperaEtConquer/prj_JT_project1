package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.controller.subcontrollers.model.CarFactory;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class AddRandomCarState implements State {

	TaxiStation taxiStation;
	CarFactory carFactory;
	View view;

	public AddRandomCarState(TaxiStation taxiStation, CarFactory carFactory, View view) {
		this.taxiStation = taxiStation;
		this.carFactory = carFactory;
		this.view = view;
	}

	@Override
	public void execute() {
		taxiStation.addCar(carFactory.createCar());
		view.printMessage("Added."); //TODO bundle
	}

}
