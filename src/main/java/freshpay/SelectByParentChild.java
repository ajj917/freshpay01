package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByParentChild {

	static WebDriver driver;

	public static void selectitem() {

		WebDriver driver = new EdgeDriver();
		driver.get(("https://www.orangehrm.com/orangehrm-30-day-trial/"));

		WebElement e = driver.findElement(By.id("Form_getForm_Country"));
		// Select sel = new Select(e);

		List<WebElement> le = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
		for (WebElement we : le) {

			String s = we.getText();
			if (s.equalsIgnoreCase("aruba")) {

				we.click();
				System.out.println(s + " " + "selected");
				break;

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Select sel = new Select(e);

		selectitem();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// driver.quit();
		driver.close();

	}

}
