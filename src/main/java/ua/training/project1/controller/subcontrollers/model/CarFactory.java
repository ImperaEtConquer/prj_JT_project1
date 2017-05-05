package ua.training.project1.controller.subcontrollers.model;

import java.util.Random;

import ua.training.project1.model.entities.BusinessCar;
import ua.training.project1.model.entities.Vehicle;
import ua.training.project1.model.entities.FamilyCar;
import ua.training.project1.model.entities.MiniCar;
import ua.training.project1.model.entities.Model;
import ua.training.project1.view.View;

public class CarFactory {

	Vehicle createCar() throws Exception {
		return createCar(getRandomType());
	}

	private Vehicle createCar(String type) throws Exception {

		Model model = getRandomModelValue();
		double fuelConsumption = getRandomDoubleValue(View.DATA_MIN_FUEL, View.DATA_MAX_FUEL);
		double velocity = getRandomDoubleValue(View.DATA_MIN_VELOCITY, View.DATA_MAX_VELOCITY);
		double price = getRandomDoubleValue(View.DATA_MIN_PRICE, View.DATA_MAX_PRICE);

		if (type.equals(View.REGEX_TYPE_BUSINESS)) {
			return new BusinessCar(model, fuelConsumption, velocity, price);
		}
		if (type.equals(View.REGEX_TYPE_FAMILY)) {
			return new FamilyCar(model, fuelConsumption, velocity, price);
		}
		if (type.equals(View.REGEX_TYPE_MINI)) {
			return new MiniCar(model, fuelConsumption, velocity, price);
		}
		else {
			throw new Exception();
		}
		

	}

	private String getRandomType() throws Exception {
		int randomValue = new Random().nextInt(3);

		switch (randomValue) {
		case 0:
			return View.REGEX_TYPE_BUSINESS;
		case 1:
			return View.REGEX_TYPE_FAMILY;
		case 2:
			return View.REGEX_TYPE_MINI;
		default:
			throw new Exception();
		}
	}

	private double getRandomDoubleValue(String min, String max) {
		double minValue = Double.parseDouble(min);
		double maxValue = Double.parseDouble(max);
		return minValue + (maxValue - minValue) * new Random().nextDouble();
	}

	private Model getRandomModelValue() {
		return Model.values()[new Random().nextInt(Model.values().length)];
	}
}
