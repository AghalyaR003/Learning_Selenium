package Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class configuration_Annotation {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Execute before suite..",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Execute after suite..",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Execute Before test..",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("Execute after Test..",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Execute Before class..",true);
	}
	
	@AfterClass
	public void Afterclass() {
		Reporter.log("Execute after class..",true);
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Execute before method..",true);
	}
	
	@AfterMethod
	public void AfterMethd() {
		Reporter.log("Execute after method.",true);
	}
	
	@Test
	public void AddToCart() {
		Reporter.log("Execute add to cart test case..",true);
	}
	@Test
	public void RemoveFromCart() {
		Reporter.log("Execute Remove From cart tes case..",true);
	}
	

}
