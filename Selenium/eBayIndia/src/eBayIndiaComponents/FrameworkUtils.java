package eBayIndiaComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkUtils {

	public static WebDriver driverUtil(){
		System.setProperty("webdriver.chrome.driver", "/Users/chaitanya/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
