package com.genericUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_Utility {
	public static void takeScreenshotOfWebpage(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+Java_Utility.getCurrentTime()+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void takeScreenshotOfWebElement() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+Java_Utility.getCurrentTime()+".png");
		FileHandler.copy(src, dest);
		
	}
	
	

}
