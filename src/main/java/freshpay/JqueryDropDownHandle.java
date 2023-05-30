package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(1500);

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(1000);

		By choices = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span");

		// 1. TC_1: single selection:
		// selectChoice(choices, "choice 6 2 3");

		// 2. TC_2: Multiple Selection:
		selectChoice(choices, "choice 1", "choice 2", "choice 6 2 1", "choice 7" );

		// 3. TC_3: Select All:
		// selectChoice(choices, "all");

		// . TC_4: unavailable Selection:
		// selectChoice(choices, "choice 1", "choice 2", "choice 6 2 1", "choice
		// 7","choice 10");

	}

	public static void selectChoice(By locator, String... value) {
		boolean flag;
		List<WebElement> li = driver.findElements(locator);
		int total = li.size();
		System.out.println(total);

		// boolean status = false;
		if (!value[0].equalsIgnoreCase("all")) { // 3. TC_2: All Selection:
			for (WebElement we : li) {
				String s = we.getText();
				System.out.println(s);

				// 1. TC_1: single selection:
//			if (s.equalsIgnoreCase(value)) {
//				we.click();
				// flag = true;
//			   break;

				// 1. TC_2: Multiple selection:
				for (int i = 0; i < value.length; i++) {
					if (s.contains(value[i])) {
						we.click();
						break;
					}

				}
			}

		} else {
			for (WebElement wi : li) {
				String so = wi.getText();
				System.out.println(so);
				if (!so.equals("−"))
					wi.click();

			}
		}

	}

}
