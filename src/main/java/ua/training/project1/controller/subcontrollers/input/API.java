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
		String value = inputController.getString("[0-9]");
		if (value.equals("1")) {
			this.state = new AddRandomCarState(taxiStation, carFactory, view);
		}
		else if (value.equals("2")) {
			this.state = new SortByFuelState(taxiStation, view);
		}
		else if (value.equals("3")) {
			this.state = new PrintAllCarsState(taxiStation, view);
		}
		else if (value.equals("4")) {
			this.state = new ResetState(taxiStation, view);
		}
		else if (value.equals("5")) {
			this.state = new SortByFuelState(taxiStation, view);
		}
		else if (value.equals("6")) {
			this.state = new SortByFuelState(taxiStation, view);
		}
		else if (value.equals("0")) {
			this.state = new ExitState();
		} else {
			view.printErrorMessage(); // TODO bundle
		}
	}

	public void execute() {
		this.state.execute();
	}
}
