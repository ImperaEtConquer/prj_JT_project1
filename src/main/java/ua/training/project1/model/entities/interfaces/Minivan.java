package ua.training.project1.model.entities.interfaces;

public interface Minivan extends PassengerCar {
	@Override
	default int getCapacity() {
		return MINIVAN_CAPACITY;
	}
	
	void addLuggage();
}
