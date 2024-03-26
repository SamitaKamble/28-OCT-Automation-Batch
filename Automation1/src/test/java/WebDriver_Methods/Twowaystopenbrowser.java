package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Twowaystopenbrowser {

	public static void main(String[] args) {
		//1 First way to open browser
		
				ChromeOptions Co = new ChromeOptions();
				//ChromeOptions is a class and we can create object of a class
				
				Co.setBrowserVersion("117");
				//Method of object ChromeOptions();
				
				WebDriver driver = new ChromeDriver();
				//Webdriver is an interface of Abstract Method are used as a (incomplete method= Only
				// Method Declaration done and not Method Defination) like driver.get Method
				
				driver.get("https://www.facebook.com/");
				
				//2 Second way to open browser
				
				WebDriverManager.chromedriver().setup();
				//WebDriverManager is an Abstract Class
				//Add Another dependencies of WebDriverManager in POM.xml file of Maven
				//No need to put browser version in this Way as it will automatically fetch the browser version
				
				WebDriver driver1 = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				
					

	}

}
