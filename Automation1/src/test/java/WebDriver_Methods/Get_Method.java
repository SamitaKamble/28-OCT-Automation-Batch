package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Method {

	public static void main(String[] args) {
		
		//1. GetMethod :
		//This is method used to open Application or URL on WeBBrowser like Chrome or FireFox
		
		//Step1
		
		WebDriverManager.chromedriver().setup();
		
		//Step2
		
		WebDriver driver = new ChromeDriver();
		
		//Step3
		
		//driver.get("https://www.amazon.in/");
		
		driver.get("https://www.facebook.com/");
		
		
	}

}
