package ua.training.project1.model.entities.interfaces;

import java.util.ArrayList;

public interface PassengerCar {
	int COMPACT_CAPACITY = 2;
	int MINIVAN_CAPACITY = 7;
	int LUXURY_CAPACITY = 5;

	int getCapacity();
	ArrayList<String> getInfo();
	
	
}
