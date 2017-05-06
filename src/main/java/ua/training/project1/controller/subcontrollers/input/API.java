package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.controller.subcontrollers.model.CarFactory;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.GlobalConstants;
import ua.training.project1.view.Symbols;
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
		String userInput = inputController.getString(View.REGEX_MENU);
		if (userInput.equals(GlobalConstants.MENU_ADD)) {
			this.state = new AddRandomCarState(taxiStation, carFactory, view);
		} else if (userInput.equals(GlobalConstants.MENU_SORT)) {
			this.state = new SortByFuelState(taxiStation, view);
		} else if (userInput.equals(GlobalConstants.MENU_PRINT)) {
			this.state = new PrintAllCarsState(taxiStation, view);
		} else if (userInput.equals(GlobalConstants.MENU_RESET)) {
			this.state = new ResetState(taxiStation, view);
		} else if (userInput.split(Symbols.SPACE_SYMBOL).length == GlobalConstants.PARAMETERS_LENGTH) {
			this.state = new FindBySpeedState(taxiStation, view, userInput);
		} else if (userInput.equals(GlobalConstants.MENU_PRICE)) {
			this.state = new GetTotalPriceState(taxiStation, view);
		} else if (userInput.equals(GlobalConstants.MENU_EXIT)) {
			this.state = new ExitState();
		} else {
			view.printErrorMessage(View.SYSTEM_WRONGINPUT);
		}
	}

	public void execute() {
		this.state.execute();
	}
}
