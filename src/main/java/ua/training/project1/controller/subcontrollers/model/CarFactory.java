package ua.training.project1.controller.subcontrollers.model;

import java.util.Random;

import ua.training.project1.model.entities.BusinessCar;
import ua.training.project1.model.entities.Vehicle;
import ua.training.project1.model.entities.SportCar;
import ua.training.project1.model.entities.LimousineCar;
import ua.training.project1.model.entities.Model;
import ua.training.project1.view.View;

public class CarFactory {

	public Vehicle createCar() {
		return createCar(getRandomType());
	}

	private Vehicle createCar(String type) {

		Model model = getRandomModelValue();
		double fuelConsumption = getRandomDoubleValue(View.DATA_MIN_FUEL, View.DATA_MAX_FUEL);
		double velocity = getRandomDoubleValue(View.DATA_MIN_VELOCITY, View.DATA_MAX_VELOCITY);
		double price = getRandomDoubleValue(View.DATA_MIN_PRICE, View.DATA_MAX_PRICE);

		if (type.equals(View.CARS_TYPE_BUSINESS)) {
			return new BusinessCar(model, fuelConsumption, velocity, price);
		} else if (type.equals(View.CARS_TYPE_FAMILY)) {
			return new SportCar(model, fuelConsumption, velocity, price);
		} else {
			return new LimousineCar(model, fuelConsumption, velocity, price);
		}

	}

	private String getRandomType() {
		int randomValue = new Random().nextInt(3);

		if (randomValue == 0) {
			return View.CARS_TYPE_BUSINESS;
		} else if (randomValue == 1) {
			return View.CARS_TYPE_FAMILY;
		} else {
			return View.CARS_TYPE_MINI;
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
