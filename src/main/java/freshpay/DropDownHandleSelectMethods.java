package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleSelectMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

		By state = By.id("multi-select");
		WebElement ss = driver.findElement(state);
		Select sel = new Select(ss);
		Boolean flag = sel.isMultiple();
		System.out.println(flag);

		By day = By.id("select-demo");
		WebElement ssd = driver.findElement(day);
		Select sel1 = new Select(ssd);
//		Boolean flag1 = sel1.isMultiple(); 
//		System.out.println(flag1);
		System.out.println(sel1.isMultiple()); // Printing directly

		sel.selectByVisibleText("Florida");
		sel.selectByVisibleText("Texas");

		List<WebElement> Lj = sel.getAllSelectedOptions();
		for (WebElement wb : Lj) {
			String s1 = wb.getText();
			System.out.println(s1);
		}
		
		
		String s2= sel.getFirstSelectedOption().getText();
		System.out.println(s2);
		
//		By pa = By.id("printAll");
//		driver.findElement(pa).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//sel.deselectByVisibleText("Florida");
		 sel.deselectAll();
		

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		driver.quit();

	}

}
