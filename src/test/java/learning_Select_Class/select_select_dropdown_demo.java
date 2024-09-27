package learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_select_dropdown_demo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement element = driver.findElement(By.name("Month"));
		for (int i = 0; i < 13; i++) {
			Select sel=new Select(element);
			sel.selectByIndex(i);
			List<WebElement> options = sel.getAllSelectedOptions();
			System.out.println(options.get(i).getText());
			
		}
		
		driver.quit();

	}

}
