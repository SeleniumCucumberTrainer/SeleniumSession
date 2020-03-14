package ListnerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventListnerDriver {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
			
			WebDriver Olddriver = new ChromeDriver();
			
			EventFiringWebDriver driver = new EventFiringWebDriver(Olddriver);
			
			listner webListener = new listner();
			driver.register(webListener);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.paypal.com");
			
			
			System.out.println("Hi Demo");
			driver.findElement(By.id("ul-btn")).click();
			driver.navigate().back();
			driver.findElement(By.id("ul-btn")).click();
			driver.navigate().back();
			driver.findElement(By.id("ul-btn")).click();

	}

}
