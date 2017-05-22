package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Minibar;
import static ua.training.project1.view.Symbols.SPACE_SYMBOL;
import static ua.training.project1.view.GlobalConstants.*;

public class LimousineCar extends Vehicle implements Minibar {
	private double minibarCapacity = MINIBAR_DEFAULT_CAPACITY;

	public LimousineCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);
	}

	@Override
	public void consumeDrinks() {
		if (!areDrinksEmpty()) {
			minibarCapacity--;
		}
	}

	@Override
	public void refillDrinks() {
		minibarCapacity = MINIBAR_DEFAULT_CAPACITY;
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
