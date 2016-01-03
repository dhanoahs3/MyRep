package testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

public class SecondTest {
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Second Test");
		  
		  //to Skip an entire test when we run in batch we use the below command
	// throw new SkipException("We want to skip this method");
		  
	  }
	 
	 @Test
	  public void Test() {
		  System.out.println("Test in Second Test");
		
	  }

	 
	 @Test
	 public void checkResults(){
		 //Now we will see some some functions where we want to check some values
		 //Whether they are true or not.If these values are not true
		 //We will use some functions to throw some error
		 //In real life scenario we will use it check if some text is present on a page
		 //or not of if a particular link is present or not
		 //The below test will fail as both values are not equal
		//		 Assert.assertEquals("Good","Goodx");
		 //Then we can  use some functions to throw a error message if a
		 //boolean condtion is not true
		 //Also we know that if a statement is not true then it will throw an error and
		 //remaining statements will not execute.If we want the remaining statements to execute
		 //as well we can put it in a try catch block
		 try{
		 Assert.assertTrue(1>9 ,"Result is not good");}
		 catch(Throwable t){System.out.println("There was an error");
		//We can even use vice versa that is error message is only thrown
		 //if a condition comes out to be true
		 }
		 System.out.println("This line will print for sure even if the above assert statement fails"
		 		+" as previous assert statement is put in "
		 		+ "try catch block");
		 Assert.assertFalse(6>1,"Results are again not good");
	 }
	 
}
