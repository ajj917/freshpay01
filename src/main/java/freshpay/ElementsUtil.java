package freshpay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsUtil {

	WebDriver driver;

	ElementsUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		if (value == null) {
			System.out.println("Null values are not allowed");
			throw new MyException("Null value Exception");
		}
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doClear(By locator) {
		getElement(locator).clear();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	
	public boolean displayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String doGetAttribute(By locator,String value) {
		return getElement(locator).getAttribute(value);
	}
	
	

}
