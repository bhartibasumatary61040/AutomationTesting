package testngTutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangrHRMTest {
	
	  WebDriver driver;
	
  @Test (priority =1)
   void Oprnapp() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  @Test (priority =2)
  void testLogo() throws InterruptedException {
	  Thread.sleep(3000);
	 boolean status =  driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 System.out.println("logo displayed..."+status);
  }

  @Test (priority =3)
  void testLogin() {
	  driver.findElement(By.name("username")).sendKeys("Bharti");
	  driver.findElement(By.name("password")).sendKeys("123");
	  driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
	  
	  
  }
  @Test (priority =4)
  void closeApp() {
	  
	  driver.quit();
	  
	  
  }
  }
