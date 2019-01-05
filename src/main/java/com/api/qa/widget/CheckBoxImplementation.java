package com.api.qa.widget;

import org.openqa.selenium.WebElement;

import com.api.qa.base.ElementImplementation;

public class CheckBoxImplementation extends ElementImplementation implements CheckBox {
	/**
	 * Wraps a WebElement with checkbox functionality.
	 *
	 * @param element to wrap up
	 */
	public CheckBoxImplementation(WebElement element) {
		super(element);
	}

	public void toggle() {
		getWrappedElement().click();
	}

	public void check() {
		if (!isChecked()) {
			toggle();
		}
	}

	public void uncheck() {
		if (isChecked()) {
			toggle();
		}
	}

	public boolean isChecked() {
		return getWrappedElement().isSelected();
	}
}
