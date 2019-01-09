package com.api.qa.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.qa.annotation.ATT;
import com.api.qa.pages.GoogleSearchPage;

@ATT(browser = "https://www.google.com/", driver = "WebDriver")
@Listeners(com.api.qa.runtime.TestngListener.class)
public class GoogleSearch {

	@Test
	public void test1() {
		GoogleSearchPage google = new GoogleSearchPage();
		google.txtgooglesearch.sendKeys("hello world");
	}

}
