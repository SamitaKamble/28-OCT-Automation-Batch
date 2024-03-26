package JavaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		//jobhi scroll down kar rahe hai voh webdriver interface se hua hai page toh voh 
		//Joh bhi scrolldown method () hai voh present hai javaScriptExecuter Interface me
		//to directly permission nahi milegi webdriver se toh typecast karna padega
		
		
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		
		Js.executeScript("window.scrollBy(0,6000)", "");//Left to right katna hai toh
		// argument will be(2000,0), scrool down karna hai toh (0,6000)
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
