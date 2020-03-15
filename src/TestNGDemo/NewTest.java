package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=1,enabled=false)
  public void testing() {
	  
	  System.out.println("TEST1");
	  
  }
  
  @Test(priority=2,groups="Regression Test")
  public void cesting2() {
	  
	  System.out.println("TEST2");
	  //throw new SkipException("Skipping coz not required");
	  
  }
  @Test(priority=3, invocationCount = 3,timeOut =1000,groups="Smoke Test")
  public void desting3() throws InterruptedException {
	  
	  System.out.println("TEST3");
	  Thread.sleep(2000);
	  Assert.assertTrue(false);
	  
  }
  @Test(priority=4, groups="Smoke Test")
  public void testing3() {
	  
	  System.out.println("TEST4");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Hi beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Hi afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Hi beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Hi afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Hi beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Hi afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Hi beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Hi afterSuite");
  }

}
