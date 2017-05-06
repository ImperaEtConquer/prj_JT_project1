package ua.training.project1.view;

import java.util.Locale;
import java.util.ResourceBundle;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Vehicle;
import ua.training.project1.model.entities.interfaces.PassengerCar;

public class View {
	private static final String CONFIG_BUNDLE_NAME = "resources/config";
	private static final ResourceBundle configBundle = ResourceBundle.getBundle(CONFIG_BUNDLE_NAME,
			new Locale("en"));
	
	public static final String DATA_MIN_PRICE = configBundle.getString("data.cars.price.minimum");
	public static final String DATA_MAX_PRICE = configBundle.getString("data.cars.price.maximum");
	public static final String DATA_MIN_FUEL = configBundle.getString("data.cars.fuel.minimum");
	public static final String DATA_MAX_FUEL = configBundle.getString("data.cars.fuel.maximum");
	public static final String DATA_MIN_VELOCITY = configBundle.getString("data.cars.velocity.minimum");
	public static final String DATA_MAX_VELOCITY = configBundle.getString("data.cars.velocity.maximum");

	public static final String REGEX_TYPE_BUSINESS = configBundle.getString("regex.cars.type.business");
	public static final String REGEX_TYPE_FAMILY = configBundle.getString("regex.cars.type.family");
	public static final String REGEX_TYPE_MINI = configBundle.getString("regex.cars.type.mini");
	
	public static final String SYSTEM_STARS = configBundle.getString("system.stars");
	public static final String SYSTEM_TITLE = configBundle.getString("system.title");
	public static final String SYSTEM_CONTROLS = configBundle.getString("system.controls");
	public static final String SYSTEM_ADDCAR = configBundle.getString("system.addcar");
	public static final String SYSTEM_SORT = configBundle.getString("system.sort");
	public static final String SYSTEM_PRINT = configBundle.getString("system.print");
	public static final String SYSTEM_RESET = configBundle.getString("system.reset");
	public static final String SYSTEM_FIND = configBundle.getString("system.find");
	public static final String SYSTEM_TOTAL = configBundle.getString("system.total");
	public static final String SYSTEM_EXIT = configBundle.getString("system.exit");
	
	public void printAllCars(TaxiStation taxiStation) {
		for (Vehicle car : taxiStation.getCars()) { //TODO Implement tabulation later
			printMessage(car.toString());
		}
	}
	
	public void printMenu() {
		printMessages(SYSTEM_STARS, SYSTEM_TITLE, SYSTEM_CONTROLS, SYSTEM_ADDCAR, SYSTEM_SORT, SYSTEM_PRINT, SYSTEM_RESET, SYSTEM_FIND, SYSTEM_TOTAL, SYSTEM_EXIT, SYSTEM_STARS);
	}
	
	public void printMessages(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			printMessage(messages[i]);
		}
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printErrorMessage() {
		System.err.println("ERROR"); //TODO REMOVE LATER
	}
	
	public void printCarInfo(PassengerCar passengerCar) {
		for (String string : passengerCar.getInfo()) {
			printMessage(string);
		}
	}

}
