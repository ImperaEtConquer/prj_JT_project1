package ua.training.project1.model.entities;

import ua.training.project1.model.entities.interfaces.TV;
import static ua.training.project1.view.Symbols.SPACE_SYMBOL;
import static ua.training.project1.view.GlobalConstants.*;

public class BusinessCar extends Vehicle implements TV {
	private boolean isTVOn;
	private int currentChannel;

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

	@Override
	public boolean isTVOn() {
		return isTVOn;
	}

	@Override
	public void switchChannel() {
		if (isTVOn) {
			currentChannel = (currentChannel < TV_LAST_CHANNEL_INDEX) ? ++currentChannel : 0;
		}
	}

	@Override
	public int getCurrentChannel() {
		return currentChannel;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName()).append(SPACE_SYMBOL).append(super.toString())
				.toString();
	}

}
