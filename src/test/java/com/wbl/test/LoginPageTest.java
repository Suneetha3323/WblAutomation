package com.wbl.test;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.utils.CsvHelper;
import com.wbl.utils.ExcelHelper;
import com.wbl.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	

	LoginPage lp;
	
	@DataProvider(name="loginData")
	public Object[][] testData() throws ClassNotFoundException, IOException {


		return ExcelHelper.getExcelData("loginData.xlsx", "loginData");
	}
	

	@Test(dataProvider = "loginData",groups= {"regression"})
	public void login(String email, String pwd) throws InterruptedException {
		lp = PageFactory.initElements(driver,LoginPage.class);
		
		Assert.assertEquals(lp.login(email,pwd),"QA/QE/SDET Training.");
		
		
	}
	
}
