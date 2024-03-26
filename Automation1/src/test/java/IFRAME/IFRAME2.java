package IFRAME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFRAME2 {

	public static void main(String[] args) throws InterruptedException {
		//Step1
		WebDriverManager.chromedriver().setup(); // To open the browser
		//Step2
		WebDriver driver = new ChromeDriver(); // To open the browser
		//Step3
		driver.get("https://demo.automationtesting.in/Frames.html");// to open application using URL
		//Step 4
		//Main page
		Thread.sleep(5000);
		driver.manage().window().maximize();//to maximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		

		//To switch focus from mainpage to iframepage
		driver.switchTo().frame("singleframe") ;
		// id="singleframe" , id value sirf pass kiya hai isme
		//If you will give WRONG ID VALUE ERROR WILL BE "NoSuchFrameException"
		
		WebElement Demo =driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		Demo.sendKeys("Automation Testing");
		
		//Default Content
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		
		driver.switchTo().parentFrame();
		
		
		
		
		//driver.close();
		
		
		
		
	}

}
