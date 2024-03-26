package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public static void main(String[] args) {
	
      //PageObjectModel without DDF
		
		//Page Factory
		
		@FindBy(xpath = "//input[@name=\"username\"]") // @FindBy is an annotation
 private WebElement username;  
		
		
	}

}
