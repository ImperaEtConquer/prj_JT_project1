package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.view.View;

class LanguageState implements State {
	private View view;

	public LanguageState(View view) {
		this.view = view;
	}

	@Override
	public void execute() {
		view.changeLanguage();
	}

}
