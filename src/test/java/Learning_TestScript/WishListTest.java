package Learning_TestScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;
import com.genericUtilities.WebDriver_Utility;

public class WishListTest extends BaseTest {
	@Test
	public void addToWishListTest() throws IOException {
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.linkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
		driver.findElement(By.id("add-to-cart-button-5")).click();
		driver.findElement(By.partialLinkText("Wishlist")).click();
		Reporter.log("product is added successfully",true);
		WebDriver_Utility.takeScreenshotOfWebpage(driver);
		
		
	}
	
	@Test
	public void removeFromWishListTest() throws IOException, InterruptedException {
		
		driver.findElement(By.partialLinkText("Wishlist")).click();
		driver.findElement(By.xpath("//a[text()=\"50's Rockabilly Polka Dot Top JR Plus Size\"]/ancestor::tr/descendant::input[@name='removefromcart']")).click();
		driver.findElement(By.name("updatecart")).click();
		Reporter.log("product is removed successfully",true);
		WebDriver_Utility.takeScreenshotOfWebpage(driver);
		Thread.sleep(2000);
		
		
		

		
	}

}
