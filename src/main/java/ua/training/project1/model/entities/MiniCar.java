package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Compact;

public class MiniCar extends Vehicle implements Compact {

	public MiniCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);
	}

}
