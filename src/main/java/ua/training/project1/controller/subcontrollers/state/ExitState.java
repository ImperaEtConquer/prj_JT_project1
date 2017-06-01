package ua.training.project1.controller.subcontrollers.state;

import static ua.training.project1.view.GlobalConstants.SYSTEM_STATUS_ZERO;

class ExitState implements State {

	@Override
	public void execute() {
		Runtime.getRuntime().exit(SYSTEM_STATUS_ZERO);
	}

}
