package freshpay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMethod {

	public static void main(String[] args) {
		BrowserUtil b = new BrowserUtil();
		WebDriver driver = b.launchBrowser("chrome");

		b.giveUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String s = b.giveCurrentUrl();
		System.out.println("Url is: " + s);

		String t = b.giveTitle();
		System.out.println("Title is: " + t);

		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By pass = By.id("input-password");
		By cpass = By.id("input-confirm");
		 By confirm = By.name("agree");

		By submit = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

		ElementsUtil eu = new ElementsUtil(driver);
		eu.doSendKeys(fname, "Ashish");
		eu.doSendKeys(lname, "J");
		eu.doSendKeys(email, "assignemt@gmail.com");
	    eu.doSendKeys(phone, "8080032382");
		eu.doSendKeys(pass, "passed@123");
		eu.doSendKeys(cpass, "passed@123");
		// eu.doClick(confirm);

		
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		eu.doSendKeys(fname, "Ashish");
//		eu.doSendKeys(lname, "J");
//		eu.doSendKeys(email, "tiesstavj@gmail.com");
//		eu.doSendKeys(phone, "80XXXXXXXX");
//		eu.doSendKeys(pass, "pass@123");
//		eu.doSendKeys(cpass, "pass@123");

		By valid = (By.xpath("//*[@id=\"content\"]/h1"));
		String vi = eu.doGetText(valid);
		if (vi.equalsIgnoreCase("Your Account Has Been Created!")) {
			System.out.println("account creation success");
		} else {
			System.out.println("account creation failed");
		}

		By search = By.xpath("//*[@id=\"search\"]/input");
		boolean flag = eu.displayed(search);
		System.out.println(flag);

		By holder = By.id("input-firstname");
		String sh = eu.doGetAttribute(holder, "placeholder");
		System.out.println(sh);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.quitBrowserNsid(); // session id is null
		// b.closeBrowserInsid(); // session id is invalid

		// b.refresh();
		// b.giveUrl("https://www.flipkart.com/");

	}

}
