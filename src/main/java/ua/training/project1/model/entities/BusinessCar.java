package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Luxury;

public class BusinessCar extends Car implements Luxury {

	public BusinessCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);

	}

	@Override
	public void massageSeats() {

	}

	@Override
	public void turnOnTV() {

	}

}
