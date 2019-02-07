package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerUtil {
	

public WebDriver launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\git\\SND-Assessment-Test\\SND-Assessment\\src\\main\\resources\\browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://link.springer.com");
	return driver;
	
}

}
