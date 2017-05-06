package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Cabriolet;
import ua.training.project1.view.Symbols;

public class SportCar extends Vehicle implements Cabriolet {

	private boolean isRoofOpen;

	public SportCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);

	}

	@Override
	public void openRoof() {
		isRoofOpen = true;
	}

	@Override
	public void closeRoof() {
		isRoofOpen = false;
	}
	
	public boolean isRoofOpen() {
		return isRoofOpen;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(Symbols.SPACE_SYMBOL).append(super.toString())
				.toString();
	}

}
