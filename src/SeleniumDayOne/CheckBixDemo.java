package SeleniumDayOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBixDemo {
	
	public static void main(String[] args) {
		

	
	System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.spicejet.com/");
	
	WebElement checkBox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
	
	boolean isChecked = checkBox.isSelected();
	
	System.out.println(isChecked);
	
	checkBox.click();
	
	 isChecked = checkBox.isSelected();
	
	System.out.println(isChecked);
	
	
	}
}
