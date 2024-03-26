package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		
		//driver.switchTo().alert().accept();//Accept() Method means OK
		//Alert is interface in that Methods like dimiss,accept,getText,stringtosend are present

		String Expected_Result = "You clicked: Cance";
		//Incorrect text karna hai toh galat text dalo toh voh incorrect ayega
		
		Thread.sleep(5000);
		Alert Pop =driver.switchTo().alert();
		//Alert ka returntype Alert hai toh voh interfacre
		//hai
		
		Pop.dismiss();
		//dismiss or cancel karna hai toh dismiss method use karni padegi
		
		String Test =driver.findElement(By.id("result")).getText();
		//getText ka return type hai String so String Test = driver.findElement(By.id("result")).getText();
		// Aise likha hai
		
		if(Test.equals(Expected_Result)) {
		
			System.out.println("Correct text");
		}
		else {
			System.out.println("InCorrect text");
		}
		//driver.quit();

	}

	
		
	}

	
		
	


