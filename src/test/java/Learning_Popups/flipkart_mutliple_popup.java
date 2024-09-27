package Learning_Popups;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkart_mutliple_popup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		for (int i = 1; i <=5; i++) {
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])["+i+"]")).click();
			List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
			
		}
		Thread.sleep(1000);
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(allWindowHandles);
		for (String WindowHandle : allWindowHandles) {
			driver.switchTo().window(WindowHandle);
			String title = driver.getTitle();
			if (title.contains("vivo")) {
				int num=new Random().nextInt(100);
				TakesScreenshot ts =(TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File destination= new File("./screenshots/vivoSS"+num+".png");
				FileHandler.copy(source, destination);
				System.out.println(title);
				
				
				
				
			}
			
			else {
				driver.close();
			}
			
		}
		
		

	}

}
