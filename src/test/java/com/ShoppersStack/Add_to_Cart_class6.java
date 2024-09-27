package com.ShoppersStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_Cart_class6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersStack.com/");
		
		if (driver.getTitle().equals("ShoppersStack")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
			
			if (driver.getTitle().contains("Login")) {
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("aghalyaram02@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("@ghalyaRam02");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				
				if (text.contains("Aghalya")) {
					
					driver.findElement(By.xpath("//a[@id='women']")).click();
					driver.findElement(By.xpath("//*[text()='zara']")).click();
					driver.findElement(By.xpath("//button[@id='Add To Cart']")).click();
				}
				
			}}

	}

}
