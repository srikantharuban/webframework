package com.api.qa.widget;

import com.api.qa.base.Element;
import com.api.qa.base.ImplementedBy;

@ImplementedBy(TextInputImplementation.class)
public interface TextInput extends Element {

	/**
	 * @param text The text to type into the field.
	 */
	void set(String text);

}
