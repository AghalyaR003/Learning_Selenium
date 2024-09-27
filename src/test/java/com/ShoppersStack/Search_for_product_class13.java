package com.ShoppersStack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Search_for_product_class13 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		if (driver.getTitle().equals("ShoppersStack")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
			
			if (driver.getTitle().contains("Login")) {
				driver.findElement(By.id("Email")).sendKeys("aghalyaram02@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("@ghalyaRam02");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				
				
				if (text.contains("Aghalya")) {
					System.out.println("User Has Logged in Successfully");
					driver.findElement(By.xpath("//option[@id='kids'][1]")).click();
					driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Dress");
					driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
					
					
					
					// take screenshot
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File destination = new File("path of file");
					FileHandler.copy(source, destination);
					
					
					// logout 
					driver.findElement(By.xpath("//div[text()='A']")).click();
					driver.findElement(By.xpath("//li[text()='Logout']")).click();	
					driver.quit();
					
					
					
				}
				
				
			}
			
		}


	}

}
