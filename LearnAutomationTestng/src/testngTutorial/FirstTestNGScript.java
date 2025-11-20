package testngTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGScript {
	@Test(priority=1, description = "This test case will verify login functionality")
	public void loginApplication1() {
		System.out.println("Login to application");
		Assert.assertEquals(12, 13);
		
	}
	
	@Test(priority=2,description = "This test case will add certain items in basket ")
	public void selectItems() {
		System.out.println("Items selected");
		
	}
	
	@Test(priority=3, description = "This tet case will perform checkout operation ")
	public void checkOut() {
		System.out.println("Checkout completed");
		
	}
	

}
