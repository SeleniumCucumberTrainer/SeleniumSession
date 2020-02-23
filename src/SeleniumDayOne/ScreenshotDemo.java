package SeleniumDayOne;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.paypal.com");
		
		Calendar cal = Calendar.getInstance();
		
		Long timestamp = cal.getTimeInMillis();
		
		String firstWindow = driver.getWindowHandle();
		
		System.out.println(firstWindow);
		
		/*try{
		
		driver.findElement(By.xpath("//a[text()='Sign Up for Upgrade']"));
		}
		catch(NoSuchElementException t){
			
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(screenshotFile, new File("C:\\Jar\\Screenshot\\paypal_"+timestamp+".png"));
		}
		*/
		
	}

}
