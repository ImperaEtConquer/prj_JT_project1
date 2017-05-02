package ua.training.project1.model;

import java.util.ArrayList;

import ua.training.project1.model.entities.Car;

public class TaxiStation {

	ArrayList<Car> cars;

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
			// TODO
		}

		return totalprice;
	}

	public void sortByFuelConsumption() {
	}

	public ArrayList<Car> getCarListByParams(double minVelocity, double maxVelocity) {

		ArrayList<Car> foundCars = new ArrayList<Car>();

		for (Car car : cars) {
			// TODO
		}
		return foundCars;
	}
}
