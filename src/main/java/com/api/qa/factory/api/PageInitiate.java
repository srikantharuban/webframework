package com.api.qa.factory.api;

import com.api.qa.base.BaseClass;

public class PageInitiate {

	public static <T> T InitPage(T googleSearchPage) {
		ElementFactory.initElements(BaseClass.webdriver, googleSearchPage);
		return (T) googleSearchPage;
	}
}
