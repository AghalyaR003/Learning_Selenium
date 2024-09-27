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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_class1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/signup");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		if (driver.getTitle().contains("ShoppersStack")) {
			
			Thread.sleep(2000);
			driver.findElement(By.id("First Name")).sendKeys("Aghalya");
			
			driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Ram");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("Female")));
		
			driver.findElement(By.id("Female")).click();
		
			driver.findElement(By.id("Phone Number")).sendKeys("9042774624");
		
			driver.findElement(By.id("Email Address")).sendKeys("aghalyaram02@gmail.com");
			
			driver.findElement(By.id("Password")).sendKeys("@ghalyaRam02");
			
			driver.findElement(By.id("Confirm Password")).sendKeys("@ghalyaRam02");
		
			wait.until(ExpectedConditions.elementToBeClickable(By.id("Terms and Conditions")));
			driver.findElement(By.id("Terms and Conditions")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Register']")).click();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./screenshots/Register.png");
			FileHandler.copy(source, destination);
			
			
		}

	}

}
