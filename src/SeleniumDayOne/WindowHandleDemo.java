package SeleniumDayOne;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com");
		
		String parentWindowId = driver.getWindowHandle();
		
		System.out.println(parentWindowId);
		
		Set<String> allWindowIds =   driver.getWindowHandles();
		
		for(String x   : allWindowIds ){
			
			driver.switchTo().window(x);
			if(driver.getTitle().contains("Tech Mahindra")){
				driver.close();
				break;
			}
			
		}
		

	}

}
