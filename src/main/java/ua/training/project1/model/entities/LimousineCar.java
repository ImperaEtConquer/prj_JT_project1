package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Minibar;
import static ua.training.project1.view.Symbols.SPACE_SYMBOL;

public class LimousineCar extends Vehicle implements Minibar {
	private double minibarCapacity = MINIBAR_CAPACITY;

	public LimousineCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);
	}

	@Override
	public void getDrinks() {
		if (!areDrinksEmpty()) {
			minibarCapacity--;
		}
	}

	@Override
	public void refillDrinks() {
		minibarCapacity = MINIBAR_CAPACITY;
	}

	@Override
	public boolean areDrinksEmpty() {
		return minibarCapacity == 0;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(SPACE_SYMBOL).append(super.toString())
				.toString();
	}

}
