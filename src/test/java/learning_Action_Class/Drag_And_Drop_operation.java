package learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_operation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.id("box1"));
		WebElement drop = driver.findElement(By.id("box101"));
		

	
		
		// create the object of action class,by passing driver in constructor
		Actions action= new Actions(driver);
		
		//call the method ,then call the perform() method
		action.dragAndDrop(drag, drop).perform();
		
		}

}
