package com.genericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	
	 @Parameters("browser")
	 @BeforeClass(alwaysRun=true)
	 public void launchBrowser(@Optional("chrome") String browser) {
		 if (browser.equals("chrome")) {
			 driver=new ChromeDriver();
			} else if (browser.equals("edge")) {
				driver=new EdgeDriver();	
			} else if (browser.equals("firefox")) {
				driver=new FirefoxDriver();
				
			}
		 
		 
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demowebshop.tricentis.com/");
		
	 }
	 @BeforeMethod(alwaysRun=true)
	 public void loginToDWS() {
		 driver.findElement(By.partialLinkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys("nikhil26@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("nikhil123");
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	 }
	 
	 @AfterMethod(alwaysRun=true)
	 public void LogoutFromDWS() {
		 driver.findElement(By.linkText("Log out")).click();
		 
	 }
	 
	 @AfterClass(alwaysRun=true)
	 public void closeBrowser() {
		 driver.quit();
	 }

}
