package com.wbl.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.wbl.utils.ConfigUtil;
import com.wbl.utils.Constants;
import com.wbl.utils.ScreenshotUtil;
import com.wbl.utils.WebDriverUtil;

public class BaseTest {
	protected WebDriver driver;
	protected static String url;
	protected static String browser;
	
	@BeforeSuite
	public void beforeSuite() {
	ConfigUtil configUtil=new ConfigUtil(Constants.Resources_path+ "/config.properties");
	url = configUtil.getProperty("url");
	browser = configUtil.getProperty("browser");
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = WebDriverUtil.getDriver("browser");
//		ConfigUtil configUtil=new ConfigUtil(Constants.Resources_path+ "/config.properties");
//		driver.get(configUtil.getProperty("url"));
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	@AfterMethod
	public void teardown(ITestResult rs) {
		if(ITestResult.FAILURE==rs.getStatus()) {
			ScreenshotUtil.takeScreenShot(rs.getName(), driver);
		}
		driver.quit();
	}
}
