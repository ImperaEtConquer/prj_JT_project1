package ua.training.project1.controller.subcontrollers.model;

import java.util.Random;

import ua.training.project1.model.entities.BusinessCar;
import ua.training.project1.model.entities.Vehicle;
import ua.training.project1.model.entities.SportCar;
import ua.training.project1.model.entities.LimousineCar;
import ua.training.project1.model.entities.Model;
import static ua.training.project1.view.View.*;
import static ua.training.project1.view.GlobalConstants.*;

public class CarFactory {
	
	private static CarFactory instance;
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	private CarFactory() {
		
	}

	public Vehicle createRandomCar() {
		return createCar(getRandomType());
	}

	private Vehicle createCar(String type) {
		Model model = getRandomModelValue();
		double fuelConsumption = getRandomDoubleValue(DATA_MIN_FUEL, DATA_MAX_FUEL);
		double velocity = getRandomDoubleValue(DATA_MIN_VELOCITY, DATA_MAX_VELOCITY);
		double price = getRandomDoubleValue(DATA_MIN_PRICE, DATA_MAX_PRICE);

		if (type.equals(CARS_TYPE_BUSINESS)) {
			return new BusinessCar(model, fuelConsumption, velocity, price);
		} else if (type.equals(CARS_TYPE_SPORT)) {
			return new SportCar(model, fuelConsumption, velocity, price);
		} else {
			return new LimousineCar(model, fuelConsumption, velocity, price);
		}

	}

	private String getRandomType() {
		int randomValue = new Random().nextInt(RANDOM_VALUES_BORDER);

		if (randomValue == BUSINESS_RANDOM_VALUE) {
			return CARS_TYPE_BUSINESS;
		} else if (randomValue == SPORT_RANDOM_VALUE) {
			return CARS_TYPE_SPORT;
		} else {
			return CARS_TYPE_LIMOUSINE;
		}

	}

	private double getRandomDoubleValue(double min, double max) {
		return min + (max - min) * new Random().nextDouble();
	}

	private Model getRandomModelValue() {
		return Model.values()[new Random().nextInt(Model.values().length)];
	}
}
