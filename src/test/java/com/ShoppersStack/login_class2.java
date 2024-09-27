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

public class login_class2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		if (driver.getTitle().equals("Shoppersstack")) {
			driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
			
			if (driver.getTitle().contains("Login")) {
				driver.findElement(By.id("Email")).sendKeys("aghalyaram02@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("@ghalyaRam02");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				
				
				if (text.contains("Aghalya")) {
					System.out.println("User Has Logged in Successfully");
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File destination = new File("./screenshots/flipkart3.png");
					FileHandler.copy(source, destination);
					
					driver.findElement(By.xpath("//div[text()='A']")).click();
					driver.findElement(By.xpath("//li[text()='Logout']")).click();	
					driver.quit();
					
					
					
				}
				
				
			}
			
		}

	}

}
