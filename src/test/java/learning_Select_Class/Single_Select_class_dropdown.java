package learning_Select_Class;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_class_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		
		//find the dropdown as a webelement
		WebElement element = driver.findElement(By.name("Select Country"));
		//create the object of select class, by passing the dropdown in the constructor
		Select sel=new Select(element);
		//call the method
		sel.selectByIndex(10);
		Thread.sleep(5000);
		sel.selectByValue("BRA");
		Thread.sleep(5000);
		sel.selectByVisibleText("India");
		//sel.deselectByVisibleText("India");
		//fetch all the options present in the dropdown
		List<WebElement> options = sel.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		driver.quit();
	

	}

}
