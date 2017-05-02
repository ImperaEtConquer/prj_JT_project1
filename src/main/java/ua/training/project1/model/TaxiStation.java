package ua.training.project1.model;

import java.util.ArrayList;
import java.util.Collections;

import ua.training.project1.controller.subcontrollers.model.ComparatorController;
import ua.training.project1.model.entities.Car;

public class TaxiStation {

	private ArrayList<Car> cars;

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public void removeCar(Car car) {
		cars.remove(car);
	}

	public double getTotalPrice() {
		double totalprice = 0;

		for (Car car : cars) {
			totalprice += car.getPrice();
		}

		return totalprice;
	}

	public void sortByFuelConsumption() {
		Collections.sort(cars, new ComparatorController());
	}

	public ArrayList<Car> getCarListByParams(double minVelocity, double maxVelocity) {
		ArrayList<Car> foundCars = new ArrayList<Car>();

		for (Car car : cars) {
			if (car.getVelocity() >= minVelocity && car.getVelocity() <= maxVelocity) {
				foundCars.add(car);
			}
		}

		return foundCars;
	}
}
