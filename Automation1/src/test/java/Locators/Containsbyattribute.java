package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Containsbyattribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("samita@gmail");
		
		driver.findElement(By.xpath("//input[contains(@id,\"pass\")]")).sendKeys("jamaljamal");
		
		driver.findElement(By.xpath("//button[contains(@id,\"u_0_5\")]")).click(); // you can't use text for buttons
		// id = u_0_5 is dynamic its changes every time we hit url again n again
		// Contains we can you valuse or text partial no need of full id or test
		Thread.sleep(5000);
		
		//driver.close();
		
	}

}
