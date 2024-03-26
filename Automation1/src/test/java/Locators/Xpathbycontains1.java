package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathbycontains1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[contains(text(),\"Forgotten \")]")).click();
		
		String text = driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps you connect and share with the people in your life.\")]")).getText();
		
		System.out.println(text);
		driver.close();
		
		
	}

}
