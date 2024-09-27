package learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.name("login"));
		System.out.println(element.getTagName());
		System.out.println("*********************************");
		System.out.println(element.getAttribute("class"));
		System.out.println("*********************************");
		System.out.println(element.getCssValue("background-color"));
		System.out.println("***********************************");
		System.out.println(element.getRect());//toString() method is not overridden in rectangle class.
		System.out.println(element.getRect().getHeight());
		System.out.println(element.getRect().getWidth());
		System.out.println(element.getRect().getY());
		System.out.println(element.getRect().getX());
		System.out.println("*************************");
		System.out.println(element.getLocation());
		System.out.println("************************");
		System.out.println(element.getSize());
		System.out.println("*************************");
		driver.quit();
		
		

	}

}
