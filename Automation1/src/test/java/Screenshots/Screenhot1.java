package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenhot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Step1
		WebDriverManager.chromedriver().setup();
		//Step2
		WebDriver driver = new ChromeDriver();
		//Step3
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//Same Method and different input parametes is CTP,overloading
		//implicitlyWait(10,TimeUnit. SECONDS) ; Implicit wait will accept 2 parameters, the first parameter will accept the time as an integer value and the second parameter will accept the time measurement in terms of SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.
		Thread.sleep(5000);
		
		//Step4
		//TakeScreenshot is a Interface
		
		File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//((TakesScreenshot)driver) : Typecaste(its not from downcasting and upcasting) 
		//reference name driver add karna padega as Webdriver direct permission nahi dega
		
		System.out.println(S1);
		
		//getScreenshotAs(OutputType.FILE); jo bhi screenshot lega voh store hoga File source mee local drive me
		
		File S2 = new File("C:\\Users\\samit\\Desktop\\Selenium Screenshot/Demo.jpg ");
		//Destination Folder ka path
		//Drawback : can't create files with same name need to change name
		
		File S3 = new File("C:\\Users\\samit\\Desktop\\Selenium Screenshot/DemoTest.jpg ");
		
		FileHandler.copy(S1, S2);
		FileHandler.copy(S1, S3);
		//But apko local driver se ek dusrefolder me(destination folder) me dal na hai
		//so use COPY() method present in FileHandler Class
		
		//Random String name ka class: Randomly strings create karta hai
		
		driver.close();
		
		

	}

}
