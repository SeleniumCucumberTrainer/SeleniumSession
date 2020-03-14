package SeleniumDayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
		   driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		   driver.switchTo().frame("packageListFrame");
		   
		   driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
		   
		   driver.switchTo().defaultContent();
		   driver.switchTo().parentFrame();
		   

	}

}
