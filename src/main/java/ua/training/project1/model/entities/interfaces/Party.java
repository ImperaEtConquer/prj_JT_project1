package ua.training.project1.model.entities.interfaces;

public interface Party extends PassengerCar{
	@Override
	default int getCapacity() {
		return COMPACT_CAPACITY;
	}
	
	void refillDrinks();
}
