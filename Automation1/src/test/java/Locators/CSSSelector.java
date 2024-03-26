package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		
		  WebDriverManager.chromedriver().setup(); WebDriver driver = new
		  ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  
		  //1.Syntax = #IDvalue
		  
			
			  driver.findElement(By.cssSelector("#email")).sendKeys("ABC@gmail");
			  driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
			  driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			  
			  //2.Syntax = Tagname#ID
			  
			  driver.findElement(By.cssSelector("input#email")).sendKeys("ABC@gmail");
			  driver.findElement(By.cssSelector("input#pass")).sendKeys("12345");
			  driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			 
		 
		//can't find id for login as its dynamic
		
		
		  //3.Syntax = [attributename=attributvalue] //Only CSSSelector it will be used
		  
		  driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("ABC@gmail");
		  driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys("12345");
		  driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		 
		
		
		  //4.Syntax = tagname[attributename=attributvalue]
		  driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys(
		  "ABC@gmail");
		  driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("12345");
		  driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		 
		
		//5.Syntax = tagname.classvalues
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("ABC@gmail");
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("12345");
		//while doing inspect for class name value remove space and add dot.
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click(); 
		
		Thread.sleep(5000);
		//driver.quit();
		
		
		
		
	}

}
