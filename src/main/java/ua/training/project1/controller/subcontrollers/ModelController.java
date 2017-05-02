package ua.training.project1.controller.subcontrollers;

import ua.training.project1.view.View;

public class ModelController {

	View view;

	public ModelController(ConsoleController consoleController) {
		this.view = consoleController.getView();
	}

	public void start() {
		
	}

}
