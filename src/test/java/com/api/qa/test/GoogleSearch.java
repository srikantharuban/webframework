package com.api.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.qa.annotation.ATT;
import com.api.qa.pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

@ATT(browser = "https://www.google.com/", driver = "WebDriver")
@Listeners(com.api.qa.runtime.TestngListener.class)
public class GoogleSearch {
	WebDriver webdriver;

	public void setup() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
		webdriver.get("https://www.google.com");
	}

	@Test
	public void test1() {

		GoogleSearchPage google = new GoogleSearchPage(webdriver);
		google.txtgooglesearch.sendKeys("hello world");
	}

	@AfterMethod
	public void tearDown() {
		webdriver.quit();
	}
}
