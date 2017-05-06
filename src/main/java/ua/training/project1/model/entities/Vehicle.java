package ua.training.project1.model.entities;

import static ua.training.project1.view.Symbols.SPACE_SYMBOL;

public abstract class Vehicle {
	private Model model;
	private double fuelConsumption;
	private double velocity;
	private double price;

	public Vehicle(Model model, double fuelConsumption, double velocity, double price) {
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.velocity = velocity;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public double getVelocity() {
		return velocity;
	}

	public Model getModel() {
		return model;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(model).append(SPACE_SYMBOL).append(price).append(SPACE_SYMBOL)
				.append(velocity).append(SPACE_SYMBOL).append(fuelConsumption).toString();
	}

}
