package SeleniumDayOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		WebElement firstLink = driver.findElement(By.tagName("a"));
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		
		/*for( WebElement x   :  allLinks  ){
			
			System.out.println(x.getAttribute("href"));
		}*/
		
		for(WebElement x   :  allLinks){
			
			System.out.println(x.getText());
			
		}
	
		//System.out.println(allLinks.size());
		
		//driver.findElement(By.id("day")).sendKeys("28");
		//driver.findElement(By.id("day")).sendKeys("30");
		
		//WebElement dropdownElement = driver.findElement(By.id("day"));
		
		/*
		 * 
		 * WebElement dropdownElement = driver.findElement(By.id("day"));
		
		dropdownElement.sendKeys("28");
		
		Thread.sleep(2000);
		
		dropdownElement.sendKeys("30");*/
		
		/*Select dropdown = new Select(dropdownElement);
		
		dropdown.selectByIndex(29);
		dropdown.selectByVisibleText("24");
		dropdown.selectByValue("");*/
		
	}

}
