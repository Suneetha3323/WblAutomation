package com.wbl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wbl.base.BasePage;

public class RegisterPage extends BasePage {
	@FindBy(id="loginButton")
	WebElement login;
	@FindBy(id="register")
	WebElement Register;
	@FindBy(id="check")
	WebElement checkbtn;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	public boolean Register() throws InterruptedException {
		login.click();
		Register.click();
		boolean b=checkbtn.isSelected();
		
		return b ;
		
	}
	

}
