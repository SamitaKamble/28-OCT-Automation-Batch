package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test3 {

	public static void main(String[] args) {
		
		//.To open Chrome browser
		
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("117");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//.To open FireFox browser
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBrowserVersion("117");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
		
		//3.14 version old version // To open old version below given way
		
		System.setProperty("WebDriver.chrome.driver","Path of driver");
		//Two input parameters should be there
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.facebook.com/");
		
		//no need to tell in interview this is 1 way or 2 way, just tell u have used chrome or firefox
		// the most 
		
		
	}

}
