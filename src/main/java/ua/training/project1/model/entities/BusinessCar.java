package ua.training.project1.model.entities;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import ua.training.project1.model.entities.interfaces.Luxury;

public class BusinessCar extends Vehicle implements Luxury {

	public BusinessCar(Model model, double fuelConsumption, double velocity, double price) {
		super(model, fuelConsumption, velocity, price);

	}

	@Override
	public void massageSeats() {
		/*
		 * massage seats
		 */
	}

	@Override
	public void turnOnTV() {
		/*
		 * turnOnTv
		 */
	}

	@Override
	public ArrayList<String> getInfo() {	//TODO RELOCATE AND REDO
		ArrayList<String> info = new ArrayList<>();

		NumberFormat formatter = new DecimalFormat("#0.00");

		info.add(this.getClass().getSimpleName().toString());
		info.add(super.getModel().toString());
		info.add(formatter.format(super.getPrice()));
		info.add(formatter.format(super.getVelocity()));
		info.add(formatter.format(super.getFuelConsumption()));

		return info;
	}

}
