package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerUtil {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public RunnerUtil() {
					try {
				prop=new Properties();
				FileInputStream fis=new FileInputStream("C:\\Users\\Sonal\\git\\SND-Assessment-Test\\SND-Assessment\\src\\main\\resources\\application.properties");
				prop.load(fis);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	

public WebDriver launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\git\\SND-Assessment-Test\\SND-Assessment\\src\\main\\resources\\browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
	return driver;
	
}

}
