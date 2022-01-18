package com.wbl.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wbl.base.BasePage;

public class LoginPage extends BasePage {
	private static Logger Log = LogManager.getLogger(LoginPage.class);

	@FindBy(id = "loginButton")
	WebElement login;

	@FindBy(id = "username")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(name = "submit")
	WebElement submit;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public String login(String email, String pwd) throws InterruptedException {

		Log.info("Login Page Test");

		login.click();
		username.sendKeys(email);
		password.sendKeys(pwd);
		submit.click();

		return driver.getTitle();

	}

}
