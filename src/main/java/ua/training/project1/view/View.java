package ua.training.project1.view;

import java.util.Locale;
import java.util.ResourceBundle;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Car;

public class View {
	private static final String MESSAGES_BUNDLE_NAME = "resources/messages";
	private static final ResourceBundle messageBundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
			new Locale("en"));

	private static final String DATA_BUNDLE_NAME = "resources/data";
	private static final ResourceBundle dataBundle = ResourceBundle.getBundle(DATA_BUNDLE_NAME);
	
//	cars.price.minimum = 15000.0
//			cars.price.maximum = 30000.0
//			cars.fuel.minimum = 7.0
//			cars.fuel.maximum = 15.0
//			cars.velocity.minimum = 80.0
//			cars.velocity.maximum = 120.0
	
	public static final String DATA_MIN_PRICE = dataBundle.getString("cars.price.minimum");
	public static final String DATA_MAX_PRICE = dataBundle.getString("cars.price.maximum");
	public static final String DATA_MIN_FUEL = dataBundle.getString("cars.fuel.minimum");
	public static final String DATA_MAX_FUEL = dataBundle.getString("cars.fuel.maximum");
	public static final String DATA_MIN_VELOCITY = dataBundle.getString("cars.velocity.minimum");
	public static final String DATA_MAX_VELOCITY = dataBundle.getString("cars.velocity.maximum");
	

	private static final String REGEX_BUNDLE_NAME = "resources/regex";
	private static final ResourceBundle regExBundle = ResourceBundle.getBundle(REGEX_BUNDLE_NAME, new Locale("en"));

	public static final String REGEX_TYPE_BUSINESS = regExBundle.getString("cars.type.business");
	public static final String REGEX_TYPE_FAMILY = regExBundle.getString("cars.type.family");
	public static final String REGEX_TYPE_MINI = regExBundle.getString("cars.type.mini");

	public void printAllCars(TaxiStation taxiStation) {
		for (Car car : taxiStation.getCars()) {
			printMessage(car.toString());
		}
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printErrorMessage() {
		System.err.println(messageBundle.getString("error"));
	}

}
