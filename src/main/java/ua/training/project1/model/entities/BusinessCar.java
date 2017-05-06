package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.Luxury;
import ua.training.project1.view.Symbols;

public class BusinessCar extends Vehicle implements Luxury {

	private boolean isTVOn;

	public BusinessCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);
	}

	@Override
	public void turnOnTV() {
		isTVOn = true;
	}

	@Override
	public void turnOffTV() {
		isTVOn = false;
	}

	public boolean isTVOn() {
		return isTVOn;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(Symbols.SPACE_SYMBOL).append(super.toString())
				.toString();
	}

}
