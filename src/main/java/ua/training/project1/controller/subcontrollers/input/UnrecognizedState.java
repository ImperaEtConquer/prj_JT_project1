package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.view.View;

class UnrecognizedState implements State {

	private View view;

	public UnrecognizedState(View view) {
		this.view = view;
	}

	@Override
	public void execute() {
		view.printErrorMessage(View.SYSTEM_WRONGINPUT);
	}

}
