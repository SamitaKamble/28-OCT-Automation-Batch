package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPosition_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Point P1 = new Point(200, 600); // selenium ka point use karna hai - or.selenium
		//point is a class
		driver.manage().window().setPosition(P1);
		Thread.sleep(5000);
		
		Point Test = driver.manage().window().getPosition();
		System.out.println(Test);
				
		

	}

}
