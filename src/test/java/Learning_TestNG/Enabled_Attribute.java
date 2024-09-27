package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Attribute {
	@Test
	public void loginTest() {
		
		Reporter.log("User logged in successfully",true);
		
	}
	
	
	@Test(enabled = false)
	public void registerTest() {
		Reporter.log("User Registered in Successfully",true);
	}
	
	
	
	
	@Test(dependsOnMethods="loginTest")
	public void cartTest() {
		Reporter.log("product added to cart Successfully",true);
		
	}
	


}
