package freshpay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get(("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.id("justAnotherInputBox")).click();
		
		
	List<WebElement> li=	driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer'])[1]//li/span"));
		  
	   
	          for(WebElement su :li) {
	        	  String s = su.getText();
	        	  System.out.println(s);
	        	  if(s.equalsIgnoreCase("choice 2"))
	        	  {
	        		  su.click();
	        		  break;
	        	  }
	          
	          }
		
	}

}
