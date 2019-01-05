package com.api.qa.base;

import java.lang.annotation.Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.api.qa.annotation.ATT;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoteDriverManager {
	WebDriver webdriver;
	Class<ATT> obj = ATT.class;

	public void setWebDriver(String BrowserType) {

		Annotation annotation = obj.getAnnotation(ATT.class);
		ATT custom = (ATT) annotation;
		if (BrowserType.equals(custom.browser())) {
			WebDriverManager.chromedriver().setup();
			webdriver = new ChromeDriver();
		} else if (BrowserType.equals("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			webdriver = new FirefoxDriver();
		}
		webdriver.get("https://www.google.com");
	}

}
