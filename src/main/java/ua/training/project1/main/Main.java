package ua.training.project1.main;

import ua.training.project1.controller.Controller;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.view.View;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller(new TaxiStation(), new View());
		controller.processUser();
	}
}
