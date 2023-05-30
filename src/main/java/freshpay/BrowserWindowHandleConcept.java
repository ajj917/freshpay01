package freshpay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlelist = new ArrayList(handles);
		
		String parentWindowid= handlelist.get(0);
		String childWindowid= handlelist.get(1);
//		String childWindowid1= handlelist.get(2);
//		String childWindowid2= handlelist.get(3);
//		String childWindowid3= handlelist.get(4);
		
		
//		Iterator<String>it =handles.iterator();
//		String parentWindowid= it.next();
//		String childWindowid= it.next();
		
		
		
		driver.switchTo().window(childWindowid);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
		
		
		driver.switchTo().window(parentWindowid);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
