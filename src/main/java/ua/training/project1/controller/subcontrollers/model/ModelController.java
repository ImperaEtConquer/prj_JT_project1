package ua.training.project1.controller.subcontrollers.model;

import ua.training.project1.controller.subcontrollers.input.ConsoleController;
import ua.training.project1.model.TaxiStation;
import ua.training.project1.model.entities.Vehicle;
import ua.training.project1.model.entities.interfaces.PassengerCar;
import ua.training.project1.view.View;

public class ModelController {

	private View view;
	private TaxiStation model;
	private ConsoleController consoleController;
	private CarFactory carFactory;

	public ModelController(ConsoleController consoleController, TaxiStation model) {
		this.consoleController = consoleController;
		this.view = consoleController.getView();
		this.model = model;
		this.carFactory = new CarFactory();
	}

	public void process() {
		view.printMessage(""); // TODO
		consoleController.getString("test"); // TODO REGEX
		Vehicle c = createCar();

		model.addCar(c);

		c = model.getCars().get(0);

		System.out.println(c.getFuelConsumption());
		System.out.println(c.getPrice());
		System.out.println(c.getModel());
		System.out.println(c.getVelocity());
		System.out.println(c.getClass());
		System.out.println();

		PassengerCar cer = (PassengerCar) c;
		System.out.println(cer.getCapacity());

		System.out.println(model.getCars().size());
	}

	private Vehicle createCar() {
		return carFactory.createCar();
	}

}
