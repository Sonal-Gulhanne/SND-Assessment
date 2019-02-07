package pages;

import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	//Object Declaration
		WebDriver driver = null;
		WebElement element = null;
		
		

	//Locators
		String xpathFirstNameTextbox = "//input[@id='first-name']"; 
		String xpathLastNameTestBox = "//input[@id=\"last-name\"]";
		String xpathEmailTestBox = "//input[@id=\"email-address\"]";
		String xpathPasswordTestBox = "//input[@id=\"password\"]";
		String xpathConfirmPasswordTestBox = "//input[@id=\"password-confirm\"]";
		String xpathCreateAccountButton = "//div[@class=\"btn btn-primary btn-monster\"]";
		String xpathCreateAccountConfirmation = "//*[@id=\"content\"]/h1";
		
		public void setFirstName(String firstName)
	    {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 element = driver.findElement(By.xpath(xpathFirstNameTextbox));
			 element.sendKeys(firstName);

	    }
		
		public void setLastName(String LastName)
	    {
	        element = driver.findElement(By.xpath(xpathLastNameTestBox));
	        element.sendKeys(LastName);

	    }
		
		public void setEmail(String email)
	    {
	        element = driver.findElement(By.xpath(xpathEmailTestBox));
	        element.sendKeys(email);

	    }
		
		
		public void setPassword(String password)
	    {
	        element = driver.findElement(By.xpath(xpathPasswordTestBox));
	        element.sendKeys(password);

	    }
		
		public void setConfirmPassword(String passwordConfirm)
	    {
	        element = driver.findElement(By.xpath(xpathConfirmPasswordTestBox));
	        element.sendKeys(passwordConfirm);

	    }
		
		public void clickCreateAccount()
	    {
	        element = driver.findElement(By.xpath(xpathCreateAccountButton));
	        element.click();

	    }
		
		
		
		public void enterRegistrationDetails(Map<String, String> map) {
			if(map.containsKey("FirstName")) 
				setFirstName(map.get("FirstName"));
			if(map.containsKey("LastName"))
				setLastName(map.get("LastName"));
			if(map.containsKey("Email"))
				setEmail(map.get("Email"));
			if(map.containsKey("Password"))
				setPassword(map.get("Password"));
			if(map.containsKey("Password"))
				setConfirmPassword("Password");
				
		}

		public String getCreateAccountConfirmationMessage() {
			String confirmationMessage = driver.findElement(By.xpath(xpathCreateAccountConfirmation)).getText();
			return confirmationMessage;
			
		}

	  

}
