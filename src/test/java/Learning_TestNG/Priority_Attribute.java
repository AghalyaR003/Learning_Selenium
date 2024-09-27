package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {

	
		@Test(priority = 2)
		public void loginTest() {
			
			Reporter.log("User logged in successfully",true);
			
		}
		@Test(priority=1)
		public void register() {
			Reporter.log("User Registered in Successfully",true);
		}
		
		@Test(priority=3)
		public void cartTest() {
			Reporter.log("product added to cart Successfully",true);
			
		}
		

	}


