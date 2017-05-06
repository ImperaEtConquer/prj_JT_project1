package ua.training.project1.controller.subcontrollers.input;

public class ExitState implements State {

	@Override
	public void execute() {
		System.exit(0);
	}

}
