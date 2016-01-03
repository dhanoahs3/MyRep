package testng;

import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnotherTest {
//To skip a complete test 
	@Test
  public void receiveemail() {
	  System.out.println("Receiving email");
  }
  
  @Test
  public void sendemail() {
	  System.out.println("Sending email");

  }
//Executed before executing all tests in suite in multiple java when they are run in batch
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
}
  
//Executed after executing all tests in suite in multiple java files  when they are run in batch

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");

}
  //This method will run before every annotation method or test case in java file	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  //This method can be used to open a browser
	  }
  //This method will run before every test or all testcases in java file in general
 @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
	  //This method can be used to make connection to a database etc
  }
 
 @AfterMethod
 public void afterMethod() {
	  System.out.println("After Method");
	  //This method can be used to close a browser

 }
 
@AfterTest
 public void AfterTest() {
	  System.out.println("After Test");
	  //This method can be used to close a connection to a database etc

 }


}
