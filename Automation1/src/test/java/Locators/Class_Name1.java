package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Name1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//Syntax : Name
		//driver.findElement(By.name("namevalue ")).sendKeys("input valur");
		
		//Name is a Static method present in By class
		
	  driver.findElement(By.name("username")).sendKeys("student");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.id("submit")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
	  

	}

}
