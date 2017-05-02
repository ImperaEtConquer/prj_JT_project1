package ua.training.project1.controller.subcontrollers.model;

import java.util.Random;
import ua.training.project1.model.entities.Car;
import ua.training.project1.model.entities.Model;
import ua.training.project1.view.View;

class CarFactory {

	Car createCar() {
		return null;
	}

	Car createCar(String type) throws Exception {
		Car car = null;
		if (type.equals(View.REGEX_TYPE_BUSINESS)) {

		}
		if (type.equals(View.REGEX_TYPE_FAMILY)) {

		}
		if (type.equals(View.REGEX_TYPE_MINI)) {

		}
		return car;
	}

	private double getRandomDoubleValue(double min, double max) {
		return min + (max - min) * new Random().nextDouble();
	}

	private Model getRandomModelValue() {
		return Model.values()[new Random().nextInt(Model.values().length)];
	}
}
