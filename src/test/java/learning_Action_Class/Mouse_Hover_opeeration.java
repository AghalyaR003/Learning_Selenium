package learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_opeeration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.linkText("Kids"));
		action.moveToElement(element2).perform();
		WebElement element3 = driver.findElement(By.linkText("Boys & Girls Tshirts"));
		action.moveToElement(element3).perform();
		action.click().perform();
		if (driver.getTitle().contains("Boys & Girls Tshirts")) {
			System.out.println("Boys & Girls Tshirts is displayed");
			
		}
		driver.quit();

	}

}
