package WindowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle1 {

	public static void main(String[] args) {
		
		//Step1
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		//to check the session id of browser. 
		//1. we close browser and open the session id will be different
		//2. we use two broser open application on another browser the session id will be different

		String WinID =driver.getWindowHandle();
		
		//By using getWindowHandle() method we can fetch the session id.
		
		System.out.println(WinID);
		
		//1st time session id of browser= D50EC56D991D352C486F0A7F93AD99B7
		//2nd time session id of browser= 3D580B2B3BC6394CCD8EDBB80651AAF2


		
		
	}

}
