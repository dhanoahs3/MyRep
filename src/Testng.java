import org.testng.annotations.Test;

public class Testng {
	//Testng or Junit are frameworks
	//They are used to run n no of Selenium scripts and to read from xl files
	//and generate Test reports and Logs
	
	//Testng is getting more famous than Junit as it is easy to run multiple scripts in
	//in Testng and it generates very good reports
	
	//To install Testng in Eclipse go to google
	// tpye  install Testng 
	//go to the link and then copy the link that says for eclipse>3.4
	//then click the link 
	
	/*From Help menu, click “Install New Software”. 2) You will see a dialog window, 
	 * paste the link copied it will be-> “http://beust.com/eclipse/”
	 *  testng will appear in search ,select it and install it
	 *  
	 */
	
	//Now Test is a predefined class and the below methods are its annotations
	//Note because of these annotatons we dont need the main function in this class to run
	//It will run by itself
	//We can select the class and run as ->testng
	@Test
	public void printmsg(){
		System.out.println("Printing msg");
	}
	
	@Test
	public void anothermsg(){
		System.out.println("Another msg printing");
	}
}
