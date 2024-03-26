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
import net.bytebuddy.utility.RandomString;


public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Step1
				WebDriverManager.chromedriver().setup();
				//Step2
				WebDriver driver = new ChromeDriver();
				//Step3
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(5000);
				File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				System.out.println(S1);
				
				//Random : bar bar manually name nahi dalsakte
				//Random class creates random name with help of creating random strings and characters
				
				String Random  = RandomString.make(5);
				
				//Make Method , Random String K class me present hai
				//maker (5), name k age every next time no. add hoga and newfile name create hoga koi bhi int or string me
				//Random me 5 numbers store honge
				
				String ImgName = "Facebookpage";
				
				
				
				File S3 = new File("C:\\Users\\samit\\Desktop\\Selenium Screenshot/"+ImgName+"_"+Random+".jpg");
			
				FileHandler.copy(S1, S3);
				
				
				

				driver.close();
				
	}

}
