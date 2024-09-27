package Learning_javaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrolling_Scroll_Bar {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='tUxRFH']"));
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		driver.quit();
		
		//WebElement element = driver.findElement(By.xpath("//div[@class='tUxRFH']"));
		//File scr = element.getScreenshotAs(OutputType.FILE);
		//File dest=new File("./screenshots/mobile.png");
		//FileHandler.copy(scr, dest);		

	}

}
