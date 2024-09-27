package learning_Select_Class;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement element = driver.findElement(By.name("Month"));
		Select sel=new Select(element);
		sel.selectByIndex(8);
		Thread.sleep(1000);
		sel.selectByValue("Sept");
		Thread.sleep(1000);
		sel.selectByVisibleText("October");
		Thread.sleep(1000);
		//sel.deselectByIndex(10);
		//Thread.sleep(1000);
		//sel.deselectByValue("Aug");
		//Thread.sleep(1000);
		//sel.deselectByVisibleText("September");
		//sel.deselectAll();
		
		List<WebElement> options = sel.getAllSelectedOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
			
		}
		driver.quit();
		
	}

}
