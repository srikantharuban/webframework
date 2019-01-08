package com.api.qa.runtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.api.qa.annotation.ATT;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngListener extends TestListenerAdapter {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getStatus());
		this.getValue(result);

	}

	public void getValue(ITestResult results) {
		ATT annotation = this.getClass().getAnnotation(ATT.class);
		System.out.println(annotation);

		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(annotation.browser());

	}
}
