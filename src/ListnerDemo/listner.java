package ListnerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class listner extends AbstractWebDriverEventListener{
	
	public void beforeClickOn(WebElement element, WebDriver driver){
		
		System.out.println("Take Screenshot");
		
	}

}
