package com.wbl.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;

public class HomePageTest extends BaseTest {
	HomePage hm;
	
	@Test(groups= {"sanity"})
	public void slideCount() {
		hm =PageFactory.initElements(driver,HomePage.class);
		Assert.assertEquals(hm.slideCount(),6);
	}
	
	@Test(dependsOnMethods = {"slideCount"},groups= {"regression"})
	public void verifylogo() {
		hm =PageFactory.initElements(driver,HomePage.class);
		Assert.assertEquals(hm.verifylogo(),false);
	}
	
	

}
