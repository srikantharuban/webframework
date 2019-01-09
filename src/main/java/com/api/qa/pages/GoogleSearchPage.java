package com.api.qa.pages;

import org.openqa.selenium.support.FindBy;

import com.api.qa.widget.TextInput;

public class GoogleSearchPage {

	@FindBy(name = "q")
	public TextInput txtgooglesearch;

}
