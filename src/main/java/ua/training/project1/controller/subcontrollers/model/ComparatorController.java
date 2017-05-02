package ua.training.project1.controller.subcontrollers.model;

import java.util.Comparator;

import ua.training.project1.model.entities.Car;

public class ComparatorController implements Comparator<Car> {

	 public int compare(Car o1, Car o2) {
		if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
			return 1;
		} else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
			return -1;
		} else {
			return 0;
		}
	}

}
