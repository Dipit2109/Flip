package flipPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlipLogin {

	@FindBy (xpath ="(//input[@type='text'])[2]")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement pwd;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;
	
	public FlipLogin(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFlip() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.out.println("dip21s09@gmail.com");
		pwd.sendKeys("shubhu2109");
		submit.click();
		
	}

	private CharSequence getExcelData(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
