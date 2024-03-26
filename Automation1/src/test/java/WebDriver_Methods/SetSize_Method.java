package WebDriver_Methods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetSize_Method {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//1.Dimension is class in selenium, by using Dimension we have to pass arguments in pages
		//2.have to create object of different class Methods if we want to use, its two input paraeters
		//3. Dimension 2nd type we have to use, not java.awt type we will get error at SetSize
		
		Dimension D1 = new Dimension(800, 300); //width,height
		driver.manage().window().setSize(D1);
		Thread.sleep(5000);
		
		Dimension D2 = new Dimension(400, 700); //width,height
		driver.manage().window().setSize(D2);
				
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
	}
	

}
