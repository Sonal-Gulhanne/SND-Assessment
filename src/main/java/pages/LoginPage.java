package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.RunnerUtil;

public class LoginPage {

	//Object Declaration
	public static Properties prop;
	RunnerUtil runner = new RunnerUtil();
	WebDriver driver = null;
	
	//Locators
	String xpathSignUpLink = "//*[@id=\"header\"]/div[1]/div[1]/a";
	String xpathLoginPageHeading = "//*[@id=\"content\"]/h1[1]";
	

	
	public void landHomePage() {
		driver = runner.launchBrowser();
		
	}
	
	public void clickSignUpLink() {
		driver.findElement(By.xpath(xpathSignUpLink)).click();;
	}

	public String getPageHeading() {
		String pageHeading = driver.findElement(By.xpath(xpathLoginPageHeading)).getText();
		return pageHeading;
	}}
