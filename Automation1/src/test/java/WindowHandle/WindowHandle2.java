package WindowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(4000);
		
		//to check the session id of browser. 
		//1. we close browser and open the session id will be different
		//2. we use two broser open application on another browser the session id will be different

		String WinID =driver.getWindowHandle();
		
		//By using getWindowHandle() method we can fetch the session id.
		
		System.out.println(WinID);
		
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Test@gmail.com");
		
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		// Child browser id = DDC61411540FEBBCD302D0F77411D337

		
		
	}

}
