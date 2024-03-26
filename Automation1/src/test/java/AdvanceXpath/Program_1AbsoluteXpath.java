package AdvanceXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program_1AbsoluteXpath {
	
public static void main(String[] args) {
		
		//How to handle Dynamic Xpath?
		//Contains by text Start suite send suite
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
				
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("https://demo.automationtesting.in/Register.html");
 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/div/input")).sendKeys("test");
    driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("test");
    
    
    
    //AbsoluteXpath
    
    //AbsoluteXpath - starts from root node,root node means it will start with single / forward slash
    
    //----find search /html/body/section/div/div/div
    
    //Firstname xpath - /html/body/section/div/div/div[2]/form/div/div/input
    
    
	}

}
