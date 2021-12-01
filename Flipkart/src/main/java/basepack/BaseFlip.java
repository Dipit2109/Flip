package basepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFlip {
	
	public WebDriver openChromeBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "G:\\Software Testing\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
	}
	
	public WebDriver openFirefoxBrowser()
	{
	System.setProperty("webdriver.gecko.driver", "G:\\Software Testing\\Selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;
	}
}