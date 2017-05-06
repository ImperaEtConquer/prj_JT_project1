package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.controller.subcontrollers.model.CarFactory;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;
import static ua.training.project1.view.GlobalConstants.*;
import static ua.training.project1.view.View.*;
import static ua.training.project1.view.Symbols.*;

public class UserAPI {
	private State state;
	private InputController inputController;
	private TaxiStation taxiStation;
	private CarFactory carFactory;
	private View view;

	public UserAPI(InputController inputController, TaxiStation taxiStation, CarFactory carFactory, View view) {
		this.inputController = inputController;
		this.taxiStation = taxiStation;
		this.carFactory = carFactory;
		this.view = view;
	}

	public void setState() {
		String userInput = inputController.getString(REGEX_MENU);
		if (userInput.equals(MENU_ADD)) {
			this.state = new AddRandomCarState(taxiStation, carFactory, view);
		} else if (userInput.equals(MENU_SORT)) {
			this.state = new SortByFuelState(taxiStation, view);
		} else if (userInput.equals(MENU_PRINT)) {
			this.state = new PrintAllCarsState(taxiStation, view);
		} else if (userInput.equals(MENU_RESET)) {
			this.state = new ResetState(taxiStation, view);
		} else if (userInput.split(SPACE_SYMBOL).length == PARAMETERS_LENGTH) {
			this.state = new FindBySpeedState(taxiStation, view, userInput);
		} else if (userInput.equals(MENU_PRICE)) {
			this.state = new GetTotalPriceState(taxiStation, view);
		} else if (userInput.equals(MENU_EXIT)) {
			this.state = new ExitState();
		} else if (userInput.equals(MENU_LANG)) {
			this.state = new LanguageState(view);
		} else {
			view.printErrorMessage(SYSTEM_WRONGINPUT);
		}
	}

	public void execute() {
		this.state.execute();
	}
}
