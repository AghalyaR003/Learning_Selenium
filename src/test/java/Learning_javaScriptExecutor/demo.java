package Learning_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//*[@class='ico-register']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(By.id("gender-female"));
		js.executeScript("arguments[0].click()",element2 );
		WebElement element3 = driver.findElement(By.id("FirstName"));
		js.executeScript("arguments[0].value='Aghal'", element3);
		WebElement element4 = driver.findElement(By.id("LastName"));
		js.executeScript("arguments[0].value='R'", element4);
		WebElement element5 = driver.findElement(By.id("Email"));
		js.executeScript("arguments[0].value='aghalyaram@gmail.com'", element5);
		WebElement element6 = driver.findElement(By.id("Password"));
		js.executeScript("arguments[0].value='@ghalRam02'", element6);
		WebElement element7 = driver.findElement(By.id("ConfirmPassword"));
		js.executeScript("arguments[0].value='@ghalRam02'", element7);
		WebElement element8 = driver.findElement(By.id("register-button"));
		js.executeScript("argumemts[0].click()",element8);
		driver.quit();
		

	}

}
