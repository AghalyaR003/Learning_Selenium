package Learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;

public class Search_to_DWS extends BaseTest{

	@Test
	public void searchProduct() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		Thread.sleep(2000);
		
	}

}
