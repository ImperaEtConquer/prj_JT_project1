package ua.training.project1.model.entities.interfaces;

public interface Luxury extends PassengerCar {
	@Override
	default int getCapacity() {
		return LUXURY_CAPACITY;
	}

	void turnOnTV();
	void turnOffTV();
}
