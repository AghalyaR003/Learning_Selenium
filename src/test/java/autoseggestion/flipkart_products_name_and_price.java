package autoseggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_products_name_and_price {

	private static WebElement element;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	   List<WebElement> mobile = driver.findElements(By.xpath("//*[@class='KzDlHZ']"));
		for (int i = 0; i <mobile.size(); i++) {
			String name=mobile.get(i).getText();
			System.out.println(name);
			WebElement price_name = driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
			WebElement price  = driver.findElement(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
			System.out.println(price_name.getText());
			System.out.println(price.getText());
			System.out.println("****************************************");
	
		}
		
		
		
		

	}

}
