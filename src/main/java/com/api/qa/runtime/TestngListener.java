package com.api.qa.runtime;

import java.lang.annotation.Annotation;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.api.qa.annotation.ATT;
import com.api.qa.base.BaseClass;

public class TestngListener extends TestListenerAdapter {

	public void onTestStart(ITestResult result) {
		BaseClass.setDriver();
		this.getValue(result);

	}

	public void getValue(ITestResult results) {

		Annotation annotation = results.getInstance().getClass().getAnnotation(ATT.class);
		ATT ann = (ATT) annotation;
		BaseClass.webdriver.get(ann.browser());

	}
}
