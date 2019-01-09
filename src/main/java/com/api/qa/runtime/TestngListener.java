package com.api.qa.runtime;

import java.lang.annotation.Annotation;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.api.qa.annotation.ATT;
import com.api.qa.base.BaseClass;

public class TestngListener extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult result) {
		this.getValue(result);
	}

	public void getValue(ITestResult results) {
		Annotation annotation = results.getInstance().getClass().getAnnotation(ATT.class);
		ATT ann = (ATT) annotation;
		BaseClass.setDriver(ann.browser());
		BaseClass.webdriver.get(ann.URL());
	}

	@Override
	public void onFinish(ITestContext testContext) {
		BaseClass.webdriver.quit();
	}
}
