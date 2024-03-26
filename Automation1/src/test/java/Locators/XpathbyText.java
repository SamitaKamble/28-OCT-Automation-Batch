package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathbyText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		//driver.findElement(By.id("//a[text()=\"Forgotten password?\"]")).click(); // it will show error
		//"NoSuchElementException"
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//div[text()=\"It's quick and easy.\"]")).getText();
		
		System.out.println(text);
		
		driver.close();
		
		

	}

}
