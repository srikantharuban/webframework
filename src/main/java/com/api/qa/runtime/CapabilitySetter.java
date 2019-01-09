package com.api.qa.runtime;

import com.api.qa.annotation.ATT;

public class CapabilitySetter {

	public String getBrowser() {
		ATT annotation = this.getClass().getAnnotation(ATT.class);
		return annotation.browser();
	}

	public String getDriver() {
		ATT annotation = this.getClass().getAnnotation(ATT.class);
		return annotation.driver();
	}

	public void setCapabilities() {
		System.out.println(getBrowser());
		System.out.println(getBrowser());
		System.out.println(getDriver());
	}

}
