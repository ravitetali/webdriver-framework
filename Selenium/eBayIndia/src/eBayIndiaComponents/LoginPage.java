package eBayIndiaComponents;

import org.openqa.selenium.WebDriver;

	

public class LoginPage {
	
	public static void main(String[] args){
	final WebDriver driver = FrameworkUtils.driverUtil();	
	driver.get("http://www.ebay.in");
	System.out.println(driver.getTitle());
	if (driver.getTitle().contains("Online Shopping | eBay")) {
	System.out.println("You are on the correct page");
	} else
	{
		System.out.println("You are on the wrong page");
	}
	}
}
