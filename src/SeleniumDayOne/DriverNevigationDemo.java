package SeleniumDayOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverNevigationDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		//driver.get("https://www.goibibo.com/");
		
		driver.navigate().to("https://www.gmail.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("ADadad@gmail.com");
		
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		
		//action.sendKeys(Keys.TAB).perform();
		
		//action.sendKeys(Keys.F5).perform();
		
		Thread.sleep(2000);
		
		//driver.navigate().back();
		
		//Thread.sleep(2000);
		
		//driver.navigate().forward();
		
		//driver.get(driver.getCurrentUrl());
		
		//driver.navigate().refresh();
		
		
		
	}

}
