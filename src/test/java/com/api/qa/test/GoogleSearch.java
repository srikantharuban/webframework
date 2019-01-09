package com.api.qa.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.qa.annotation.ATT;
import com.api.qa.apienum.BROWSERS;
import com.api.qa.factory.api.PageInitiate;
import com.api.qa.pages.GoogleSearchPage;

@ATT(URL = "https://www.google.com/", browser = BROWSERS.FIREFOX)
@Listeners(com.api.qa.runtime.TestngListener.class)
public class GoogleSearch {

	@Test
	public void test1() {
		GoogleSearchPage google = PageInitiate.InitPage(new GoogleSearchPage());
		google.txtgooglesearch.sendKeys("hello world");
	}

}
