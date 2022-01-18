package com.wbl.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.LoginPage;
import com.wbl.pages.RegisterPage;

public class RegisterPageTest extends BaseTest {
	RegisterPage RP;
	
	@Test(groups= {"sanity"})
	public void Register() throws InterruptedException {
		
	
		RP = PageFactory.initElements(driver,RegisterPage.class);
		
		Assert.assertEquals(RP.Register(),false);
}
}