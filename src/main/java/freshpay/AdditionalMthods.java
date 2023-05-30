package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMthods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get(("https://www.flipkart.com/"));

		Dimension dim = new Dimension(800, 800);
		driver.manage().window().setSize(dim);

		List<WebElement> l1 = driver.findElements(By.tagName("div"));
		int totalLinks = l1.size();
		System.out.println(totalLinks);

		for (int i = 0; i < totalLinks; i++) {

			String s12 = (l1.get(i).getText());
			if (s12.length() > 0) {
				System.out.println(i + " " + s12);
			}
		}
//		int count = 0;
//		for (WebElement w : l1) {
//
//			String s21 = w.getText();
//
//			if (s21.length()>0) {
//				System.out.println(count+" "+s21);
//			}
//			count++;
//		}

		driver.manage().window().maximize();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

		// System.out.println("DONE");

//		
//		String s=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[4]/a/span")).getText();
//		System.out.println(s);

//		boolean b=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).isDisplayed();
//		System.out.println(b);

//		String sphj=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div[6]/div/div[1]/div/h2").getText();
//		System.out.println(sphj);
//		

		String sph = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"))
				.getAttribute("type");
		System.out.println(sph);

		// driver.manage().window().maximize();

//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		// driver.navigate().to("https://github.com/SeleniumHQ/selenium");

//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		driver.navigate().back();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}
