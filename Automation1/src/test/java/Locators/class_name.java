package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class_name {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Syntax : Name
		//driver.findElement(By.className("classnamevalue ")).sendKeys("input valur");
		
		
		
	  driver.findElement(By.className("inputtext")).sendKeys("student");
	  //Dont use class="inputtext _55r1 _6luy" full name, use only "inputtext" before space
	  
	  
	  Thread.sleep(5000);
	  
	  driver.quit();

	}

}
