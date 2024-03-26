package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//There are predefined Methods like  Close Methods which are present in WebDriver Interface.
		
		//2.CloseMethod:
		//This is to close Current Browser, Current Browser only
		
		//Step1
		WebDriverManager.chromedriver().setup();
		
		//Step2
	 WebDriver driver = new ChromeDriver();
	 
	 //Step3
	 driver.get("https://www.flipkart.com/");
	 
	 Thread.sleep(5000);
	 //Thread.sleep Method is to stop the program, it will stop for 5 seconds after 27 line and then
	 //execute line 32
	 
	 //Step4
	 driver.close();
	 
	}

}
