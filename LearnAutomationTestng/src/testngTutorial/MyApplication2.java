package testngTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApplication2 {
	WebDriver driver;
	@Test
	public void startApp() {
    	driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("auth/login"));
		
		
		
	}
	
	@Test(dependsOnMethods = "startApp")
	public void loginApp() {
		
		driver.findElement(By.name("username")).sendKeys("Bharti");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		
		
	}
	@Test(dependsOnMethods = "loginApp")
	public void logOutApp() {
		
		
	}



}
