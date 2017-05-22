package ua.training.project1;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;
import ua.training.project1.controller.subcontrollers.model.CarFactory;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.BusinessCar;
import ua.training.project1.model.entities.LimousineCar;
import ua.training.project1.model.entities.SportCar;
import ua.training.project1.model.entities.Vehicle;

public class ProjectTest {

	public final double price_min = 15000;
	public final double price_max = 30000;

	public final double fuel_min = 7;
	public final double fuel_max = 15;

	public final double velocity_min = 80;
	public final double velocity_max = 120;

	@Test
	public void factoryTest() {

		ArrayList<Vehicle> cars = new ArrayList<>();

		int cars_amount = 1000;

		CarFactory carFactory = new CarFactory();
		for (int i = 0; i < cars_amount; i++) {
			cars.add(carFactory.createRandomCar());
		}

		boolean isVelocityInRange = true;
		boolean isPriceInRange = true;
		boolean isFuelInRange = true;
		boolean isInstanceOfAnyType = true;

		for (Vehicle vehicle : cars) {
			double velocity = vehicle.getVelocity();
			double price = vehicle.getPrice();
			double fuel = vehicle.getFuelConsumption();

			if (!isDoubleInRange(velocity, velocity_min, velocity_max)) {
				isVelocityInRange = false;
			}

			if (!isDoubleInRange(price, price_min, price_max)) {
				isPriceInRange = false;
			}

			if (!isDoubleInRange(fuel, fuel_min, fuel_max)) {
				isFuelInRange = false;
			}

			if (!isInstanceOf(vehicle)) {
				isInstanceOfAnyType = false;
			}

		}

		Assert.assertTrue(isFuelInRange);
		Assert.assertTrue(isPriceInRange);
		Assert.assertTrue(isVelocityInRange);
		Assert.assertTrue(isInstanceOfAnyType);

	}

	@Test
	public void taxiStationTest() {

		TaxiStation taxiStation = new TaxiStation();
		int cars_amount = 1000;

		CarFactory carFactory = new CarFactory();
		for (int i = 0; i < cars_amount; i++) {
			taxiStation.addCar(carFactory.createRandomCar());
		}

		taxiStation.sortByFuelConsumption();
		boolean isListSorted = isListSorted(taxiStation.getCars());

		double totalPrice = 0;
		for (Vehicle vehicle : taxiStation.getCars()) {
			totalPrice += vehicle.getPrice();
		}

		double expectedResult = totalPrice;
		double actualResult = taxiStation.getTotalPrice();

		double min = 80;
		double max = 100;
		boolean areAllFoundCarsVelocitiesInRange = true;
		for (Vehicle vehicle : taxiStation.getCarListByParams(min, max)) {
			if (!taxiStation.getCarListByParams(min, max).isEmpty()
					&& !isDoubleInRange(vehicle.getVelocity(), min, max)) {
				areAllFoundCarsVelocitiesInRange = false;
			}
		}

		taxiStation.removeAllCars();
		boolean isEmpty = taxiStation.getCars().isEmpty();

		Assert.assertEquals(expectedResult, actualResult, 0);
		Assert.assertTrue(isListSorted);
		Assert.assertTrue(isEmpty);
		Assert.assertTrue(areAllFoundCarsVelocitiesInRange);
	}

	private boolean isListSorted(ArrayList<Vehicle> cars) {

		boolean isListSorted = true;

		for (int i = 0; i < cars.size() - 1; i++) {
			if ((cars.get(i).getFuelConsumption() >= cars.get(i + 1).getFuelConsumption())) {
				isListSorted = false;
			}
		}

		return isListSorted;
	}

	private boolean isInstanceOf(Vehicle vehicle) {
		return ((vehicle instanceof BusinessCar) || (vehicle instanceof LimousineCar) || (vehicle instanceof SportCar));
	}

	private boolean isDoubleInRange(double value, double min, double max) {
		return ((value >= min) && (value <= max));
	}
}