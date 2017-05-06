package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Party;
import ua.training.project1.view.Symbols;

public class LimousineCar extends Vehicle implements Party {
	
	private boolean areDrinksFull;

	public LimousineCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);
	}

	@Override
	public void refillDrinks() {
		areDrinksFull = true;
	}
	
	public boolean arreDrinksFull() {
		return areDrinksFull;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(Symbols.SPACE_SYMBOL).append(super.toString())
				.toString();
	}

}
