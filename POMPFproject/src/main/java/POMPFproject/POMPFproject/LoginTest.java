package POMPFproject.POMPFproject;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import ObjectRepository.MyAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		LoginPage log= new LoginPage(driver);
		log.emailfield().sendKeys("yrvenkatesh6179@gmail.com");
		log.passwordfield().sendKeys("Hanuman6179*");
		log.loginbutton().click();
		
		MyAccountPage myact= new MyAccountPage(driver);
		
		Assert.assertTrue(myact.accountBreadcrump().isDisplayed());
		
		}
	public void closure() {
		
		driver.close();
	}
}
