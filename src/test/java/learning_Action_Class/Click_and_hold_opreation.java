package learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_hold_opreation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.id("box1"));
		WebElement drop = driver.findElement(By.id("box101"));
		Actions Action = new Actions(driver);
		Action.clickAndHold(drop).perform();
		Action.release(drop).perform();
       
	}

}
