package com.api.qa.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;

/**
 * An implementation of the Element interface. Delegates its work to an
 * underlying WebElement instance for custom functionality.
 */

public class ElementImplementation implements Element {

	private final WebElement element;

	/**
	 * Creates a Element for a given WebElement.
	 *
	 * @param element element to wrap up
	 */

	public ElementImplementation(final WebElement element) {
		this.element = element;
	}

	public void click() {
		element.click();

	}

	public void submit() {
		element.submit();

	}

	public void sendKeys(CharSequence... keysToSend) {
		element.sendKeys(keysToSend);

	}

	public void clear() {
		element.click();

	}

	public String getTagName() {

		return element.getTagName();
	}

	public String getAttribute(String name) {

		return element.getAttribute(name);
	}

	public boolean isSelected() {

		return element.isSelected();
	}

	public boolean isEnabled() {

		return element.isEnabled();
	}

	public String getText() {

		return element.getText();
	}

	public List<WebElement> findElements(By by) {

		return null;
	}

	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isDisplayed() {

		return element.isDisplayed();
	}

	public Point getLocation() {

		return element.getLocation();
	}

	public Dimension getSize() {

		return element.getSize();
	}

	public Rectangle getRect() {

		return element.getRect();
	}

	public String getCssValue(String propertyName) {

		return element.getCssValue(propertyName);
	}

	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		// TODO Auto-generated method stub
		return element.getScreenshotAs(target);
	}

	public WebElement getWrappedElement() {

		return element;
	}

	public Coordinates getCoordinates() {

		return ((Locatable) (element)).getCoordinates();
	}

	public boolean elementWired() {
		// TODO Auto-generated method stub
		return (element != null);
	}

}
