package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathbycontains2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[contains(text(),\"Forgotten \")]")).click();
		
		String text1 = "Facebook helps you connect and share with the people in your life.";
		
String text = driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps \")]")).getText();
		
		System.out.println(text);
		
		if (text.equals(text1)) {
			System.out.println("Correct text");
			
		}
		else {
			System.out.println("InCorrect text");
		}
		
driver.close();
	}

}
