package ua.training.project1.view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Vehicle;

import static ua.training.project1.view.Symbols.*;
import static ua.training.project1.view.GlobalConstants.*;

public class View {

	private static Locale locale = new Locale(EN);
	private static final String CONFIG_BUNDLE_NAME = "resources/configUTF";
	private static ResourceBundle configBundle = ResourceBundle.getBundle(CONFIG_BUNDLE_NAME, locale);

	private NumberFormat formatter = new DecimalFormat(DECIMAL_FORMAT);

	public static String CARS_TYPE_BUSINESS = "cars.type.business";
	public static String CARS_TYPE_SPORT = "cars.type.sport";
	public static String CARS_TYPE_LIMOUSINE = "cars.type.limo";

	public static String REGEX_MENU = "regex.menu";

	public static String SYSTEM_STARS = "system.stars";
	public static String SYSTEM_TITLE = "system.title";
	public static String SYSTEM_CONTROLS = "system.controls";
	public static String SYSTEM_ADDCAR = "system.addcar";
	public static String SYSTEM_SORT = "system.sort";
	public static String SYSTEM_PRINT = "system.print";
	public static String SYSTEM_RESET = "system.reset";
	public static String SYSTEM_FIND = "system.find";
	public static String SYSTEM_TOTAL = "system.total";
	public static String SYSTEM_LANG = "system.lang";
	public static String SYSTEM_EXIT = "system.exit";
	public static String SYSTEM_CARLISTINFO = "system.carslistinfo";

	public static String SYSTEM_WRONGINPUT = "system.error.wronginput";
	public static String SYSTEM_NOTHINGFOUND = "system.error.nothingfound";

	public static String MESSAGE_USD = "system.message.usd";
	public static String MESSAGE_ADD = "system.message.add";
	public static String MESSAGE_SORT = "system.message.sort";
	public static String MESSAGE_RESET = "system.message.reset";

	public void printCars(ArrayList<Vehicle> cars) {
		if (!cars.isEmpty()) {
			printKey(SYSTEM_CARLISTINFO);
			for (Vehicle car : cars) {
				String[] carInfo = car.toString().split(SPACE_SYMBOL);
				StringBuilder sb = new StringBuilder();
				for (int index = 0; index < carInfo.length; index++) {
					if (index < NUMERICAL_DATA_START_INDEX) {
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
			printErrorMessage(SYSTEM_NOTHINGFOUND);
		}

	}

	public void printAllCars(TaxiStation taxiStation) {
		printKey(SYSTEM_CARLISTINFO);
		for (Vehicle car : taxiStation.getCars()) {
			String[] carInfo = car.toString().split(SPACE_SYMBOL);
			StringBuilder sb = new StringBuilder();
			for (int index = 0; index < carInfo.length; index++) {
				if (index < NUMERICAL_DATA_START_INDEX) {
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
		printMessagesKey(SYSTEM_STARS, SYSTEM_TITLE, SYSTEM_CONTROLS, SYSTEM_ADDCAR, SYSTEM_SORT, SYSTEM_PRINT,
				SYSTEM_RESET, SYSTEM_FIND, SYSTEM_TOTAL, SYSTEM_LANG, SYSTEM_EXIT, SYSTEM_STARS);
	}

	public void printPrice(double price) {
		printMessage(new StringBuilder().append(formatter.format(price)).append(SPACE_SYMBOL)
				.append(getString(MESSAGE_USD)).toString());
	}

	private void printMessagesKey(String... messages) {
		for (int i = 0; i < messages.length; i++) {
			printKey(messages[i]);
		}
	}

	public void printKey(String key) {
		printMessage(getString(key));
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printErrorMessage(String key) {
		System.err.println(getString(key));
	}

	public String getString(String key) {
		return configBundle.getString(key);
	}

	public void changeLanguage() {
		if (locale.equals(Locale.ENGLISH)) {
			locale = new Locale(RU);
		} else {
			locale = new Locale(EN);
		}
		configBundle = ResourceBundle.getBundle(CONFIG_BUNDLE_NAME, locale);
	}

}
