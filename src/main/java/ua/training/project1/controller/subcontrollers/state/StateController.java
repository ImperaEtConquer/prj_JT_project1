package ua.training.project1.controller.subcontrollers.state;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;
import static ua.training.project1.view.GlobalConstants.*;
import static ua.training.project1.view.View.*;

import ua.training.project1.controller.subcontrollers.input.InputController;

import static ua.training.project1.view.Symbols.*;

public class StateController {
	private State state;
	private InputController inputController;
	private TaxiStation taxiStation;
	private View view;

	public StateController(InputController inputController, TaxiStation taxiStation, View view) {
		this.inputController = inputController;
		this.taxiStation = taxiStation;
		this.view = view;
	}

	public void setState() {
		String userInput = inputController.getString(view.getString(REGEX_MENU));
		if (isEqual(userInput, MENU_ADD)) {
			state = new AddRandomCarState(taxiStation, view);
		} else if (isEqual(userInput, MENU_SORT)) {
			state = new SortByFuelState(taxiStation, view);
		} else if (isEqual(userInput, MENU_PRINT)) {
			state = new PrintAllCarsState(taxiStation, view);
		} else if (isEqual(userInput, MENU_RESET)) {
			state = new ResetState(taxiStation, view);
		} else if (isEqualWithParameters(userInput, MENU_FIND)) {
			state = new FindBySpeedState(taxiStation, view, getParameters(userInput));
		} else if (isEqual(userInput, MENU_PRICE)) {
			state = new GetTotalPriceState(taxiStation, view);
		} else if (isEqual(userInput, MENU_EXIT)) {
			state = new ExitState();
		} else if (isEqual(userInput, MENU_LANG)) {
			state = new LanguageState(view);
		} else {
			state = new UnrecognizedState(view);
		}
	}

	public void execute() {
		state.execute();
	}

	private boolean isEqual(String userInput, String command) {
		return userInput.equals(command);
	}

	private boolean isEqualWithParameters(String userInput, String command) {
		if (isInputWithParameters(userInput)) {
			return getFirstCharacter(userInput).equals(command);
		} else {
			return false;
		}
	}

	private double[] getParameters(String userInput) {
		String[] splittedUserInput = userInput.split(SPACE_SYMBOL);
		double min = Double.parseDouble(splittedUserInput[FIRST_STRING_PARAMETER]);
		double max = Double.parseDouble(splittedUserInput[SECOND_STRING_PARAMETER]);
		return new double[] { min, max };
	}

	private boolean isInputWithParameters(String userInput) {
		return userInput.split(SPACE_SYMBOL).length == PARAMETERS_LENGTH;
	}

	private String getFirstCharacter(String userInput) {
		return Character.toString(userInput.charAt(0));
	}
}
