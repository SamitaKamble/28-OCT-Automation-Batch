package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle()); //1 way
		
		String Expected_Title = "Facebook – log in or sign up"; //2way
		String Actual_Title = driver.getTitle();
		
		if(Actual_Title.equals(Expected_Title)) {
			
			System.out.println("Correct Title");
		}else {
			
			System.out.println("InCorrect Title");
		}
		
       driver.close();
	}

}
