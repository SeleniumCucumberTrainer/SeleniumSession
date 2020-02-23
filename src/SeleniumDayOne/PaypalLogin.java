package SeleniumDayOne;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaypalLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.paypal.com");
			
			driver.findElement(By.id("ul-btn")).click();
			
			driver.findElement(By.id("email")).sendKeys("akhileshg50@gmail.com");
			
			driver.findElement(By.id("btnNext")).click();
			
			/*WebDriverWait wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));*/
			
			//Wait wait = new FluentWait(driver);
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));
			
			Wait wait = new FluentWait(driver).
					pollingEvery(10, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			
			
			
			driver.findElement(By.id("password")).sendKeys("asdsadsadsad");
			
			driver.findElement(By.id("btnLogin")).click();
			
			Thread.sleep(3000);
			driver.quit();
			
		
		
		
	}

}
