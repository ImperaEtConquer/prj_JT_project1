package ua.training.project1.view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Vehicle;

public class View {
	private static final String CONFIG_BUNDLE_NAME = "resources/config";
	private static final ResourceBundle configBundle = ResourceBundle.getBundle(CONFIG_BUNDLE_NAME, new Locale("en"));

	private NumberFormat formatter = new DecimalFormat("#0.00");

	public static final String DATA_MIN_PRICE = configBundle.getString("data.cars.price.minimum");
	public static final String DATA_MAX_PRICE = configBundle.getString("data.cars.price.maximum");
	public static final String DATA_MIN_FUEL = configBundle.getString("data.cars.fuel.minimum");
	public static final String DATA_MAX_FUEL = configBundle.getString("data.cars.fuel.maximum");
	public static final String DATA_MIN_VELOCITY = configBundle.getString("data.cars.velocity.minimum");
	public static final String DATA_MAX_VELOCITY = configBundle.getString("data.cars.velocity.maximum");

	public static final String CARS_TYPE_BUSINESS = configBundle.getString("cars.type.business");
	public static final String CARS_TYPE_FAMILY = configBundle.getString("cars.type.family");
	public static final String CARS_TYPE_MINI = configBundle.getString("cars.type.mini");

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

		System.out.println("TYPE\t\t\tMODEL\t\tPRICE\t\tVELOCITY\t\tFUEL");

		for (Vehicle car : taxiStation.getCars()) {
			String[] carInfo = car.toString().split(" ");
			StringBuilder sb = new StringBuilder();
			for (int index = 0; index < carInfo.length; index++) {
				if (index < GlobalConstants.NUMERICAL_START_INDEX) { 
					sb.append(carInfo[index]);
					sb.append("\t\t\t");
				} else {
					Double value = Double.valueOf(carInfo[index]);
					sb.append(formatter.format(value));
					sb.append("\t\t");
				}

			}
			printMessage(sb.toString());
		}

		// info.add(formatter.format(super.getPrice()));
	}

	public void printMenu() {
		printMessages(SYSTEM_STARS, SYSTEM_TITLE, SYSTEM_CONTROLS, SYSTEM_ADDCAR, SYSTEM_SORT, SYSTEM_PRINT,
				SYSTEM_RESET, SYSTEM_FIND, SYSTEM_TOTAL, SYSTEM_EXIT, SYSTEM_STARS);
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
		System.err.println("ERROR"); // TODO REMOVE LATER
	}

}
