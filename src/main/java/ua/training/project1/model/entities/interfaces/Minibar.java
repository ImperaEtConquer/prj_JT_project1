package ua.training.project1.model.entities.interfaces;

public interface Minibar {
	
	double MINIBAR_CAPACITY = 100.0;

	void refillDrinks();
	boolean areDrinksEmpty();
	void getDrinks();
}
