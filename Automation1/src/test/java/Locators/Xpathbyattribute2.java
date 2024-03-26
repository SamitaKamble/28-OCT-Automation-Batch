package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathbyattribute2 {

	public static void main(String[] args) throws InterruptedException {
		
		//tagname[@attributename=attributevalue]
		
      WebDriverManager.chromedriver().setup();
      //to open browser
		
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//to open the application
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile");
		Thread.sleep(5000);
		driver.quit();
		//to quit all browser
        
	}

}
