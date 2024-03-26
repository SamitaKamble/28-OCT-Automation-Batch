package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_ID {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("Test@123");
		//driver.findElement(By.id("pass")).sendKeys("12345678");
		//driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		driver.findElement(By.id("reg_pages_msg")).click();
		
		}

}
