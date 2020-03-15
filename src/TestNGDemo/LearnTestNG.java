package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void runBeforeTest(){
		

		 System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.paypal.com");
			
			driver.findElement(By.id("ul-btn")).click();
			
			driver.findElement(By.id("email")).sendKeys("akhileshg50@gmail.com");
			
			driver.findElement(By.id("btnNext")).click();
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	@Test
	public void doLoginGmailTest(){
		
			
			Assert.assertTrue(false);
			
	}
	@Test(groups="Smoke Test")
	public void doHomePageTest(){
	
			
			Assert.assertTrue(true);
			
	}
	
	@Test
	public void CheckGmailTitle(){
		
			
			
			if(driver.getTitle().equals("paypal")){
				System.out.println("Passed");
				Assert.assertTrue(true);
				//Assert.assertEquals(driver.getTitle(), "paypal");
			}
			else {
				System.out.println("Failed");
				Assert.assertTrue(false);
				//Assert.assertEquals(driver.getTitle(), "paypal");
			}
	
			
	}
	
	
	

}
