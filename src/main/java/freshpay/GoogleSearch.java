package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void search(By locator, String value) {

		// driver.findElement(By.xpath("//div[@class='wM6W7d']/span")).sendKeys("Selenium");

		driver.findElement(By.name("q")).sendKeys("Mobile");
		
		List<WebElement> l1= driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		int totalsugges= l1.size();
		
		System.out.println(totalsugges);
		
		for(WebElement w:l1) {
			String s1 = w.getText();
			System.out.println(s1);
		}
		
		
       
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		
		By name= By.name("q");
		
		search(name,"selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//driver.quit();

	}
}
