package Learning_TestScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;
import com.genericUtilities.WebDriver_Utility;

public class CartTest extends BaseTest {

	@Test
	public void addToCartTest() throws IOException {
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Reporter.log("product is added successfully to the cart",true);
		WebDriver_Utility.takeScreenshotOfWebpage(driver);
	
	}
	
	@Test
	public void removeFromCartTest() throws IOException {
		
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/ancestor::tr/descendant::input[@name='removefromcart']")).click();
		driver.findElement(By.name("updatecart")).click();
		Reporter.log("product is removed successfully from the cart",true);
		WebDriver_Utility.takeScreenshotOfWebpage(driver);
		
	}
}
