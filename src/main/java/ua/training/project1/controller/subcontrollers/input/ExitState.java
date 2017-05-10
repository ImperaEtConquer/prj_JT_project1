package ua.training.project1.controller.subcontrollers.input;

import static ua.training.project1.view.GlobalConstants.SYSTEM_STATUS_ZERO;

class ExitState implements State {

	@Override
	public void execute() {
		System.exit(SYSTEM_STATUS_ZERO);
	}

}
