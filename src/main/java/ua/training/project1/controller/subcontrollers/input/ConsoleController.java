package ua.training.project1.controller.subcontrollers.input;

import java.util.Scanner;

import ua.training.project1.view.View;

public class ConsoleController {

	Scanner sc;
	View view;

	public ConsoleController(Scanner sc, View view) {
		this.sc = sc;
		this.view = view;
	}

	public String getString(String regex) {
		String result;
		
		while (!(sc.hasNext() && (result = sc.next()).matches(regex))) {
			view.printErrorMessage();
		}
		return result;
	}
	
	public View getView() {
		return view;
	}

}