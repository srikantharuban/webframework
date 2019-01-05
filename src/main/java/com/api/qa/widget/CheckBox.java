package com.api.qa.widget;

import com.api.qa.base.Element;
import com.api.qa.base.ImplementedBy;

@ImplementedBy(CheckBoxImplementation.class)
public interface CheckBox extends Element {

	/**
	 * Toggle the state of the checkbox.
	 */
	void toggle();

	/**
	 * Checks checkbox if unchecked.
	 */
	void check();

	/**
	 * Un-checks checkbox if checked.
	 */
	void uncheck();

	/**
	 * Check if an element is selected, and return boolean.
	 *
	 * @return true if check is checked, return false in other case
	 */
	boolean isChecked();

}
