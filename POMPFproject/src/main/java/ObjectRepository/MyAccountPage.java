package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[normalize-space()='Account']")
	WebElement accountBreadcrump;
	//private By accountBreadcrump=By.xpath("//a[normalize-space()='Account']");
	
	
	public WebElement accountBreadcrump() {
		
		return accountBreadcrump;
	}
}
