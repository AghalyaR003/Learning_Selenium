
package Learning_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='Placements']")).click();
		String parentwindowHandle = driver.getWindowHandle();
		Set<String> allwindowHandles = driver.getWindowHandles();
		allwindowHandles.remove(parentwindowHandle);
		System.out.println(parentwindowHandle);
		System.out.println(allwindowHandles);
		for (String windowHandle : allwindowHandles) {
			driver.switchTo().window(windowHandle);
			Thread.sleep(1000);
			driver.findElement(By.linkText("CSE")).click();
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowHandle);
		System.out.println(parentwindowHandle);
		driver.findElement(By.xpath("//*[@class='navbar-item nuxt-link-exact-active nuxt-link-active']")).click();
		Thread.sleep(2000);
		
		
		
		
		
			
		}
		

	}


