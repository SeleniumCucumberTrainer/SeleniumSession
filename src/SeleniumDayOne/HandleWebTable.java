package SeleniumDayOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22661/rsa-vs-aus-1st-odi-australia-tour-of-south-africa-2020");

		int totalRows = driver.findElements(By.xpath("(//div[text()='Batsman'])[1]/../following-sibling::div")).size();

		int totalColumn = driver.findElements(By.xpath("(//div[text()='Batsman'])[1]/../div")).size();
		System.out.println("Total Players  " + (totalRows - 1));

		// (//div[text()='Batsman'])[1]/../following-sibling::div[2]/div[1]

		for (int row = 1; row < totalRows-2; row++) {
			for (int column = 1; column <= totalColumn; column++) {
				
				String textValue= driver.findElement(By.xpath("(//div[text()='Batsman'])[1]/../following-sibling::div[" + row + "]/div["+column+"]")).getText();
			
				System.out.print(textValue+" ");
			}
			
			System.out.println();
		}
	}

}
