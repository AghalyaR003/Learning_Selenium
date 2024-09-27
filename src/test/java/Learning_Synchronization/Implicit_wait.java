package Learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("achu");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("achu@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("achu@190902");
		driver.findElement(By.id("day")).sendKeys("19");
		driver.findElement(By.id("month")).sendKeys("Sep");
		driver.findElement(By.id("year")).sendKeys("2002");
		driver.findElement(By.xpath("//*[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
