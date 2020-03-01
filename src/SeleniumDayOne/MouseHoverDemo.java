package SeleniumDayOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		//driver.get("https://www.goibibo.com/");
		
		driver.navigate().to("https://www.naukri.com/");
		
		WebElement Jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Jobs).perform();
		
		
		

	}

}
