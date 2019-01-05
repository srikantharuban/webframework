package com.api.qa.widget;

import org.openqa.selenium.WebElement;

import com.api.qa.base.ElementImplementation;

public class TextInputImplementation extends ElementImplementation implements TextInput {

	public TextInputImplementation(WebElement element) {
		super(element);
	}

	public void set(String text) {
		sendKeys(text);
	}

}
