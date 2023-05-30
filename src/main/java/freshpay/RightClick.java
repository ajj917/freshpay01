package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions ac = new Actions(driver);
		ac.contextClick(rightclick).build().perform();

		List<WebElement> l1 = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[span]"));
		int e1 = l1.size();
		System.out.println(e1);

		for (WebElement l2 : l1) {
			String s1 = l2.getText();
			System.out.println(s1);
			
			if(s1.equals("Delete")) {
				l2.click();
				break;
			}
		}

	}
}
