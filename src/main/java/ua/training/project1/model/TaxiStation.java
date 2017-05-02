package ua.training.project1.model;

import java.util.ArrayList;
import java.util.Collections;

import ua.training.project1.controller.subcontrollers.model.ComparatorController;
import ua.training.project1.model.entities.Vehicle;

public class TaxiStation {

	private ArrayList<Vehicle> cars;
	
	public TaxiStation() {
		cars = new ArrayList<>();
	}

	public ArrayList<Vehicle> getCars() {
		return cars;
	}

	public void addCar(Vehicle car) {
		cars.add(car);
	}

	public void removeCar(Vehicle car) {
		cars.remove(car);
	}

	public double getTotalPrice() {
		double totalprice = 0;

		for (Vehicle car : cars) {
			totalprice += car.getPrice();
		}

		return totalprice;
	}

	public void sortByFuelConsumption() {
		Collections.sort(cars, new ComparatorController());
	}

	public ArrayList<Vehicle> getCarListByParams(double minVelocity, double maxVelocity) {
		ArrayList<Vehicle> foundCars = new ArrayList<Vehicle>();

		for (Vehicle car : cars) {
			if (car.getVelocity() >= minVelocity && car.getVelocity() <= maxVelocity) {
				foundCars.add(car);
			}
		}

		return foundCars;
	}
}
