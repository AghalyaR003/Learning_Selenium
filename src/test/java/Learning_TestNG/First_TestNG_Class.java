package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	@Test           // it will act like a main ()
	public void loginTest() { // it acts like a test case
		
		// it is used to print message in report as well as console
		Reporter.log("User Logged in Successfully...",true);
	}

}
