package com.wbl.utils;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebDriverUtil {
	private static Logger Log = LogManager.getLogger(WebDriverUtil.class);
	
	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
	try {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					Constants.Resources_path+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					Constants.Resources_path+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver",
					Constants.Resources_path+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		}catch(Exception e) {
			Log.error(e.getMessage());
		}
		return driver;

	}

}
