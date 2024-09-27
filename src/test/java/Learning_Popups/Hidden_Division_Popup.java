package Learning_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Mobile",Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='itel Aura 05i|Leather Finish|4000 Mah Battery|Type C Charging Support (Crystal Blue, 32 GB)']")).click();
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		driver.findElement(By.xpath("//*[text()='Remove']")).click();

	}

}
