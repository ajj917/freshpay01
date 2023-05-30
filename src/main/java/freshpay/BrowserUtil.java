package freshpay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	 WebDriver driver;

	// Browser METHOD
	public  WebDriver launchBrowser(String browser) {

		if (browser == null) {
			System.out.println("Please Enter Browser");
			throw new MyException("Browser value entered is null");
		}

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please Enter correct browser");

		}
		
		return driver;

	}

	// URL METHOD
	public void giveUrl(String Url) {

		if (Url == null) {
			System.out.println("Please enter Url");
			throw new MyException("URL value entered is null");
		}

		if (Url.contains("http")) {
			driver.get(Url);
		} else {
			System.out.println("Url entered is incorrect");
		}

	}
	
	
	public String giveCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	public String giveTitle() {
		return driver.getTitle();
	}
	
	public void refresh() {
	driver.navigate().refresh();
	}
	
	public void quitBrowserNsid() {
		driver.quit();
	}
	
	
	public void closeBrowserInsid() {
		driver.close();
	}

}
