package DataProviderLoginDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataReading.Xls_Reader;

public class TestLogin {
	
	
	
	@Test(dataProvider="getData")
	public void doLoginTest(String userId, String Password){
		
		System.out.print(userId+" ");
		System.out.print(Password);
		System.out.println();
		
		 /* System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.paypal.com");
			
			driver.findElement(By.id("ul-btn")).click();
			
			driver.findElement(By.id("email")).sendKeys(userId);
			//driver.findElement(By.id("password")).sendKeys(Password);
*/			
	
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		//driver.close();
	}
	
	@DataProvider
    public Object[][] getData(){
    	
		    Xls_Reader excel = new Xls_Reader("C:\\Jar\\testData.xlsx");
		
            int colCount = excel.getColumnCount("GmailData");
            int rowNum = excel.getRowCount("GmailData");
           
            Object[][] data = new Object[rowNum-1][colCount];
            // Object[][] data = new Object[2][2]
            
            
            for(int i=2; i<=rowNum; i++){
            	
                for(int j= 0; j<colCount; j++){
                	
                    data[i-2][j]=excel.getCellData("GmailData", j, i);
                    
                }
            }
           
            return data;
        }
    

}
