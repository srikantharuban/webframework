package com.api.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver webdriver;

	public static void setDriver() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
	}

	public static WebDriver getDriver() {
		return webdriver;
	}

}
