package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeMethod {
	
	//this is to maximize window

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);// to stop programm

		driver.manage().window().maximize(); //maximize window
		
		Thread.sleep(10000); // excepts in milliseconds, 10000 millisec = 10 sec;
		
		driver.close();
		
		
		
		
		
	}

}
