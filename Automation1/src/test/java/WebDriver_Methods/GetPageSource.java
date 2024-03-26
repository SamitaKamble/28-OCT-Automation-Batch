package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSource {
	
	//Pura code developers ne joh likha hai login page of facebook k liye voh console me print hoga

	//to fetch the source code of page
	
	public static void main(String[] args) {
		
		//Step1
		WebDriverManager.chromedriver().setup();
		
		//Step2
		WebDriver driver = new ChromeDriver();
		
		//Step3
		
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	String text = driver.getPageSource();
			System.out.println(text);
			driver.quit();
		
	}

}
