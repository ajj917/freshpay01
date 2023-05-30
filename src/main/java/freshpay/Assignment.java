package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.get(("https://www.orangehrm.com/orangehrm-30-day-trial/"));
		
		
		      WebElement e= driver.findElement(By.id("Form_getForm_Country"));
		      Select sel = new Select(e);
		      
		    //  sel.selectByIndex(1);
		   //   sel.selectByValue("Aruba");
		      sel.selectByVisibleText("Aruba");
		      
		      
		      try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		      driver.quit();
		
		
		
//		Assignment no 5
//		driver.get(("https://www.amazon.in/"));
//		
//		List<WebElement> l1= driver.findElements(By.tagName("img"));
//		int totalimages = l1.size();
//		
//		System.out.println(totalimages);
//		
//		driver.quit();
		
	//	Assignment no 6
//		driver.get(("https://uidai.gov.in/"));
//		
//		List<WebElement> l1= driver.findElements(By.className("btn btn1 en"));
//		for(WebElement w1:l1)
//		{
//			String s7 = w1.getText();
//			
//			System.out.println(s7);
//		}
		
		
		

	}

}
