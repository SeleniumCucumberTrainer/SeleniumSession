package SeleniumDayOne;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDatePicker {

	public static void main(String[] args) {
		
		String date ="10-06-2020";
		
		String[] allPartOfDate = date.split("-");
		
		String realDateFormat = allPartOfDate[2]+allPartOfDate[1]+allPartOfDate[0];
		
		System.out.println(Arrays.toString(allPartOfDate));
		
		System.out.println(realDateFormat);
		
		String realId = "fare_"+realDateFormat;
		
		System.out.println(realId);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("(//i[contains(@class ,'hypflt-calendar')])[1]")).click();
		while(true){
		try{
		
		driver.findElement(By.id(realId)).click();
		break;
		
		}catch(Exception t){
			driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton--next')]")).click();
		}
		
		}                        


	}

}
