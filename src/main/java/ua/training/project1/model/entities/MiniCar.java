package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Compact;
import ua.training.project1.view.Symbols;

public class MiniCar extends Vehicle implements Compact {

	public MiniCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(Symbols.SPACE_SYMBOL).append(super.toString()).toString();
	}

}
