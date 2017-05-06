package ua.training.project1.controller.subcontrollers.input;

import ua.training.project1.view.View;

public class LanguageState implements State {

	View view;

	public LanguageState(View view) {
		this.view = view;
	}

	@Override
	public void execute() {
		view.changeLanguage();
	}

}
