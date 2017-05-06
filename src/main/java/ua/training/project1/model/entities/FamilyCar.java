package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Minivan;
import ua.training.project1.view.Symbols;

public class FamilyCar extends Vehicle implements Minivan {

	public FamilyCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);

	}

	@Override
	public void addLuggage() {
		/*
		 * addLuggage
		 */
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(Symbols.SPACE_SYMBOL).append(super.toString())
				.toString();
	}

}
