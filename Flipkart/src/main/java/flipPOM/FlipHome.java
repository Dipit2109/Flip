package flipPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipHome {

	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy (xpath = "//div[text()='Dipit ']")
	WebElement user;
	
	@FindBy (xpath = "(//div[@class='_3vhnxf'])[4]")
	WebElement orders;
	
	@FindBy (xpath = "//div[text()='Logout']")
	private WebElement logout;
	
	@FindBy (xpath = "//div[text()='Wishlist']")
	private WebElement wish;
	
	public FlipHome(WebDriver driver)
	{
		this.driver = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	public void CheckOrders() throws InterruptedException
	{
		act.moveToElement(user).perform();
		Thread.sleep(3000);
		act.moveToElement(orders).click().build().perform();		
	}
	
	public void Wishlist() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(user));
		act.moveToElement(user).perform();
		Thread.sleep(3000);
		act.moveToElement(wish).click().build().perform();
		Thread.sleep(3000);
	}
	
	public void Logout() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(user));
		act.moveToElement(user);
		Thread.sleep(3000);
		act.moveToElement(logout).click().build().perform();
	}
}
