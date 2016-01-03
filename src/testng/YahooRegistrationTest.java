package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest {
	
//parameterization is used to call a fucntion in testng more than once with different sets of data
	
	//The annotation used for this is called DataProvider

	@Test(dataProvider="registerData")
	public void TestData(String name,String email,String password,String city){
	System.out.println(name+"------" +email+"-------"+password+"---"+city);	}
	



@DataProvider
//We make a function that returns a two dimensional object array
public Object[][] registerData(){
	
	//Then we make an two dimensional object array
	//rows mean  the no of times we want to run the test
	//Columns mean the actual data we will pass in the test
	
 Object[][] data = new Object[3][4];
//row 1
 data[0][0] = "user1";
	data[0][1] = "email1";
	data[0][2] = "password1";
	data[0][3] = "city1";
	
	//row 2
	data[1][0] = "user2";
	data[1][1] = "email2";
	data[1][2] = "password2";
	data[1][3] = "city2";
	
	//row3
	data[2][0] = "user3";
	data[2][1] = "email3";
	data[2][2] = "password3";
	data[2][3] = "city3";

return data;
}
}