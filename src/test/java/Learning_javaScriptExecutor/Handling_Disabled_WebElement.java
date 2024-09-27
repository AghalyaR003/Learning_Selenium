package Learning_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Disabled_WebElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
		//Type cast the driver into javascriptExecutor interface
		JavascriptExecutor js=(JavascriptExecutor) driver;
		// then call the method present in javascriptEcecutor interface
		js.executeScript("arguments[0].value='aghal@gmail.com'",element);
		
		
	
		

	}

}
