package ua.training.project1.model.entities;

import java.util.ArrayList;

import ua.training.project1.model.entities.interfaces.Minivan;

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
	public ArrayList<String> getInfo() {
		ArrayList<String> info = new ArrayList<>();

		info.add(super.getModel().toString());
		info.add(Double.toString(super.getPrice()));
		info.add(Double.toString(super.getVelocity()));
		info.add(Double.toString(super.getFuelConsumption()));
		info.add(this.getClass().getSimpleName().toString());

		return info;
	}

}
