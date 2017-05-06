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
		if (isTVOn) {
			isTVOn = false;
		}
		else {
			isTVOn = true;
		}
	}
	
	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(Symbols.SPACE_SYMBOL).append(super.toString()).toString();
	}

//	@Override
//	public ArrayList<String> getInfo() {	//TODO RELOCATE AND REDO
//		ArrayList<String> info = new ArrayList<>();
//
//		NumberFormat formatter = new DecimalFormat("#0.00");
//
//		info.add(this.getClass().getSimpleName().toString());
//		info.add(super.getModel().toString());
//		info.add(formatter.format(super.getPrice()));
//		info.add(formatter.format(super.getVelocity()));
//		info.add(formatter.format(super.getFuelConsumption()));
//
//		return info;
//	}

}
