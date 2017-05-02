package ua.training.project1.model.entities;

public abstract class Car {
	private Model model;
	private double fuelConsumption;
	private double velocity;
	private double price;

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
		return model.toString();
	}
}
