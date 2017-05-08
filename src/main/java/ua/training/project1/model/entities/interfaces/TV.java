package ua.training.project1.model.entities.interfaces;

public interface TV {

	int TV_CHANNEL_AMOUNT = 20;

	void turnOnTV();
	void turnOffTV();
	boolean isTVOn();
	void switchChannel();
	int getCurrentChannel();

}
