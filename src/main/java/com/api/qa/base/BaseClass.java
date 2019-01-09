package com.api.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.api.qa.apienum.BROWSERS;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver webdriver;

	public static void setDriver(BROWSERS browser) {
		switch (browser) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			webdriver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			webdriver = new FirefoxDriver();
			break;
		case IE:
			WebDriverManager.iedriver().setup();
			webdriver = new InternetExplorerDriver();
		}

	}

	public static WebDriver getDriver() {
		return webdriver;
	}

}
