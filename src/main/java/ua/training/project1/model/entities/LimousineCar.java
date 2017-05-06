package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Party;
import static ua.training.project1.view.Symbols.SPACE_SYMBOL;


public class LimousineCar extends Vehicle implements Party {
	private boolean areDrinksFull;

	public LimousineCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);
	}

	@Override
	public void refillDrinks() {
		areDrinksFull = true;
	}
	
	public boolean areDrinksFull() {
		return areDrinksFull;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(SPACE_SYMBOL).append(super.toString())
				.toString();
	}

}
