package ua.training.project1.model.entities.interfaces;

public interface Luxury extends Class{
	@Override
	default int getCapacity() {
		return LUXURY_CAPACITY;
	}
	
	void massageSeats();
	void turnOnTV();
}
