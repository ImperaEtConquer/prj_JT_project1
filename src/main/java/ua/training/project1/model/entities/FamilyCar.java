package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Minivan;

public class FamilyCar extends Car implements Minivan {

	public FamilyCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);

	}

	@Override
	public void addLuggage() {

	}

}
