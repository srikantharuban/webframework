package com.api.qa.pages;

import org.openqa.selenium.support.FindBy;

import com.api.qa.base.BaseClass;
import com.api.qa.factory.api.ElementFactory;
import com.api.qa.widget.TextInput;

public class GoogleSearchPage {

	@FindBy(name = "q")
	public TextInput txtgooglesearch;

	public GoogleSearchPage() {
		ElementFactory.initElements(BaseClass.webdriver, this);
	}

}
