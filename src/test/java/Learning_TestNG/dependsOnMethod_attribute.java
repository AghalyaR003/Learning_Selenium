package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod_attribute {
	
	@Test(dependsOnMethods= "registerTest")
	public void loginTest() {
		
		Reporter.log("User logged in successfully",true);
		
	}
	
	
	@Test
	public void registerTest() {
		Reporter.log("User Registered in Successfully",true);
	}
	
	
	
	
	@Test(dependsOnMethods={"registerTest","loginTest"})
	public void cartTest() {
		Reporter.log("product added to cart Successfully",true);
		
	}
	

}
