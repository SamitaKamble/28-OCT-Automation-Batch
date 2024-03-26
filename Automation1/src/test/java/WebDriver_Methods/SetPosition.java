package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetPosition {
	
	//to change the position on screen 
	//this method is used

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Point P1 = new Point(200, 600); // selenium ka point use karna hai - or.selenium
		//point is a class
		driver.manage().window().setPosition(P1);
		

	}
 
}
