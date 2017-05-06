package ua.training.project1.model.entities.interfaces;

public interface Cabriolet extends PassengerCar {
	@Override
	default int getCapacity() {
		return MINIVAN_CAPACITY;
	}

	void openRoof();
	void closeRoof();
}
