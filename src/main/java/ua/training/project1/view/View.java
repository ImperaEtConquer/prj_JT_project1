package ua.training.project1.view;

import java.util.Locale;
import java.util.ResourceBundle;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Car;

public class View {
	static final String MESSAGES_BUNDLE_NAME = "resources/messages";
	static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

	public void printAllCars(TaxiStation taxiStation) {
		for (Car car : taxiStation.getCars()) {
			printMessage(car.toString());
		}
	}

	public void printMessage(String message) {
		System.out.println(message);
	}
	
}
