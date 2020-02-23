package SeleniumDayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocator {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com");
		
		driver.findElement(By.partialLinkText("Sign Up")).click();
		
		/*driver.findElement(By.id("ul-btn")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login_email")).sendKeys("akhileshg50@gmail.com");
		
		driver.findElement(By.id("btnNext")).click();*/
		
		
		                          
		

	}

}
