package freshpay;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);

		act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.END).build().perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.HOME).build().perform();
		
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
	}

}