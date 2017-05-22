package ua.training.project1.view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Vehicle;

import static ua.training.project1.view.Symbols.DOUBLE_TABULATION;
import static ua.training.project1.view.GlobalConstants.EN;
import static ua.training.project1.view.GlobalConstants.RU;
import static ua.training.project1.view.GlobalConstants.DECIMAL_FORMAT;

public class View {

	private static Locale locale = new Locale(EN);
	private static final String CONFIG_BUNDLE_NAME = "resources/configUTF";
	private static ResourceBundle configBundle = ResourceBundle.getBundle(CONFIG_BUNDLE_NAME, locale);

	private NumberFormat formatter = new DecimalFormat(DECIMAL_FORMAT);

	public static String DATA_MIN_PRICE = configBundle.getString("data.cars.price.minimum");
	public static String DATA_MAX_PRICE = configBundle.getString("data.cars.price.maximum");
	public static String DATA_MIN_FUEL = configBundle.getString("data.cars.fuel.minimum");
	public static String DATA_MAX_FUEL = configBundle.getString("data.cars.fuel.maximum");
	public static String DATA_MIN_VELOCITY = configBundle.getString("data.cars.velocity.minimum");
	public static String DATA_MAX_VELOCITY = configBundle.getString("data.cars.velocity.maximum");

	public static String CARS_TYPE_BUSINESS = configBundle.getString("cars.type.business");
	public static String CARS_TYPE_SPORT = configBundle.getString("cars.type.sport");
	public static String CARS_TYPE_LIMOUSINE = configBundle.getString("cars.type.limo");

	public static String REGEX_MENU = configBundle.getString("regex.menu");

	private static String SYSTEM_STARS = configBundle.getString("system.stars");
	private static String SYSTEM_TITLE = configBundle.getString("system.title");
	private static String SYSTEM_CONTROLS = configBundle.getString("system.controls");
	private static String SYSTEM_ADDCAR = configBundle.getString("system.addcar");
	private static String SYSTEM_SORT = configBundle.getString("system.sort");
	private static String SYSTEM_PRINT = configBundle.getString("system.print");
	private static String SYSTEM_RESET = configBundle.getString("system.reset");
	private static String SYSTEM_FIND = configBundle.getString("system.find");
	private static String SYSTEM_TOTAL = configBundle.getString("system.total");
	private static String SYSTEM_LANG = configBundle.getString("system.lang");
	private static String SYSTEM_EXIT = configBundle.getString("system.exit");
	private static String SYSTEM_CARLISTINFO = configBundle.getString("system.carslistinfo");

	public static String MESSAGE_USD = configBundle.getString("system.message.usd");
	public static String MESSAGE_ADD = configBundle.getString("system.message.add");
	public static String MESSAGE_SORT = configBundle.getString("system.message.sort");
	public static String MESSAGE_RESET = configBundle.getString("system.message.reset");

	public static String SYSTEM_WRONGINPUT = configBundle.getString("system.error.wronginput");
	public static String SYSTEM_NOTHINGFOUND = configBundle.getString("system.error.nothingfound");

	public void printCars(ArrayList<Vehicle> cars) {
		if (!cars.isEmpty()) {
			printMessage(SYSTEM_CARLISTINFO);
			for (Vehicle car : cars) {
				String[] carInfo = car.toString().split(Symbols.SPACE_SYMBOL);
				StringBuilder sb = new StringBuilder();
				for (int index = 0; index < carInfo.length; index++) {
					if (index < GlobalConstants.NUMERICAL_DATA_START_INDEX) {
						sb.append(carInfo[index]);
					} else {
						Double value = Double.valueOf(carInfo[index]);
						sb.append(formatter.format(value));
					}
					sb.append(DOUBLE_TABULATION);
				}
				printMessage(sb.toString());
			}
		} else {
			printErrorMessage(View.SYSTEM_NOTHINGFOUND);
		}

	}

	public void printAllCars(TaxiStation taxiStation) {
		printMessage(SYSTEM_CARLISTINFO);
		for (Vehicle car : taxiStation.getCars()) {
			String[] carInfo = car.toString().split(Symbols.SPACE_SYMBOL);
			StringBuilder sb = new StringBuilder();
			for (int index = 0; index < carInfo.length; index++) {
				if (index < GlobalConstants.NUMERICAL_DATA_START_INDEX) {
					sb.append(carInfo[index]);
				} else {
					Double value = Double.valueOf(carInfo[index]);
					sb.append(formatter.format(value));
				}
				sb.append(DOUBLE_TABULATION);
			}
			printMessage(sb.toString());
		}
	}

	public void printMenu() {
		printMessages(SYSTEM_STARS, SYSTEM_TITLE, SYSTEM_CONTROLS, SYSTEM_ADDCAR, SYSTEM_SORT, SYSTEM_PRINT,
				SYSTEM_RESET, SYSTEM_FIND, SYSTEM_TOTAL, SYSTEM_LANG, SYSTEM_EXIT, SYSTEM_STARS);
	}

	public void printPrice(double price) {
		printMessage(new StringBuilder().append(formatter.format(price)).append(Symbols.SPACE_SYMBOL)
				.append(MESSAGE_USD).toString());
	}

	private void printMessages(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			printMessage(messages[i]);
		}
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printErrorMessage(String errorMessage) {
		System.err.println(errorMessage);
	}

	public void changeLanguage() {
		if (locale.equals(Locale.ENGLISH)) {
			locale = new Locale(RU);
		} else {
			locale = new Locale(EN);
		}
		configBundle = ResourceBundle.getBundle(CONFIG_BUNDLE_NAME, locale);
		reloadStrings();
	}

	private void reloadStrings() {
		DATA_MIN_PRICE = configBundle.getString("data.cars.price.minimum");
		DATA_MAX_PRICE = configBundle.getString("data.cars.price.maximum");
		DATA_MIN_FUEL = configBundle.getString("data.cars.fuel.minimum");
		DATA_MAX_FUEL = configBundle.getString("data.cars.fuel.maximum");
		DATA_MIN_VELOCITY = configBundle.getString("data.cars.velocity.minimum");
		DATA_MAX_VELOCITY = configBundle.getString("data.cars.velocity.maximum");

		CARS_TYPE_BUSINESS = configBundle.getString("cars.type.business");
		CARS_TYPE_SPORT = configBundle.getString("cars.type.sport");
		CARS_TYPE_LIMOUSINE = configBundle.getString("cars.type.limo");

		REGEX_MENU = configBundle.getString("regex.menu");

		SYSTEM_STARS = configBundle.getString("system.stars");
		SYSTEM_TITLE = configBundle.getString("system.title");
		SYSTEM_CONTROLS = configBundle.getString("system.controls");
		SYSTEM_ADDCAR = configBundle.getString("system.addcar");
		SYSTEM_SORT = configBundle.getString("system.sort");
		SYSTEM_PRINT = configBundle.getString("system.print");
		SYSTEM_RESET = configBundle.getString("system.reset");
		SYSTEM_FIND = configBundle.getString("system.find");
		SYSTEM_TOTAL = configBundle.getString("system.total");
		SYSTEM_LANG = configBundle.getString("system.lang");
		SYSTEM_EXIT = configBundle.getString("system.exit");
		SYSTEM_CARLISTINFO = configBundle.getString("system.carslistinfo");

		MESSAGE_USD = configBundle.getString("system.message.usd");
		MESSAGE_ADD = configBundle.getString("system.message.add");
		MESSAGE_SORT = configBundle.getString("system.message.sort");
		MESSAGE_RESET = configBundle.getString("system.message.reset");

		SYSTEM_WRONGINPUT = configBundle.getString("system.error.wronginput");
		SYSTEM_NOTHINGFOUND = configBundle.getString("system.error.nothingfound");

	}

}
