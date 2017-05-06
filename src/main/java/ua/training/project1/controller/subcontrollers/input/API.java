package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.controller.subcontrollers.model.CarFactory;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class API {
	private State state;
	private InputController inputController;
	private TaxiStation taxiStation;
	private CarFactory carFactory;
	private View view;

	public API(InputController inputController, TaxiStation taxiStation, CarFactory carFactory, View view) {
		this.inputController = inputController;
		this.taxiStation = taxiStation;
		this.carFactory = carFactory;
		this.view = view;
	}

	public void setState() {
		if (inputController.getString("1").equals("1")) {
			this.state = new AddRandomCarState(taxiStation, carFactory, view);
			System.out.println("add");	//TODO remove
		}
		if (inputController.getString("2").equals("2")) {
			this.state = new SortByFuelState(taxiStation, view);
		}
		if (inputController.getString("0").equals("0")) {
			this.state = new ExitState();
			System.out.println("exit");	//TODO remove
		}
		else {
			view.printErrorMessage(); //TODO bundle
		}
	}

	public void execute() {
		this.state.execute();
		System.out.println("done");	//TODO remove
	}
}
