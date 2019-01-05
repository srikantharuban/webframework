package com.api.qa.factory.internal;

import com.api.qa.base.Element;
import com.api.qa.base.ImplementedBy;

public class ImplementedByProcessor {

	private ImplementedByProcessor() {
	}

	/**
	 * Gets the wrapper class (descended from ElementImpl) for the
	 * annotation @ImplementedBy.
	 *
	 * @param iface iface to process for annotations
	 * @param       <T> type of the wrapped class.
	 * @return The class name of the class in question
	 */
	public static <T> Class<?> getWrapperClass(Class<T> iface) {
		if (iface.isAnnotationPresent(ImplementedBy.class)) {
			ImplementedBy annotation = iface.getAnnotation(ImplementedBy.class);
			Class<?> clazz = annotation.value();
			if (Element.class.isAssignableFrom(clazz)) {
				return annotation.value();
			}
		}
		throw new UnsupportedOperationException("Apply @ImplementedBy interface to your Interface "
				+ iface.getCanonicalName() + " if you want to extend ");
	}

}
