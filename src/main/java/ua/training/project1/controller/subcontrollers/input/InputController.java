package ua.training.project1.controller.subcontrollers.input;

import java.util.Scanner;
import ua.training.project1.view.View;
import static ua.training.project1.view.View.SYSTEM_WRONGINPUT;

public class InputController {
	private Scanner sc;
	private View view;

	public InputController(Scanner sc, View view) {
		this.sc = sc;
		this.view = view;
	}

	public String getString(String regex) {
		String result;

		while (!(sc.hasNext() && (result = sc.nextLine()).matches(regex))) {
			view.printErrorMessage(SYSTEM_WRONGINPUT);
		}
		return result;
	}

}