package com.wbl.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.wbl.base.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath = "//*[@id=\"promo-slider\"]/ul[@class='slides']//img ")
	List<WebElement> slides;
	@FindBy(id="logo")
	WebElement logo;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public int slideCount() {
//		List<WebElement> slides = driver.findElements(By.xpath("//*[@id=\"promo-slider\"]/ul[@class='slides']//img"));
//		 
//		System.out.println("the number of slides present are "+ slides.size());
//		
//		return(slides.size());
//		return driver.findElements(By.xpath("//*[@id=\"promo-slider\"]/ul[@class='slides']//img")).size();
		return slides.size();
	}
	public boolean verifylogo() {
		boolean isDisplayed = logo.isDisplayed();
		return isDisplayed;
		
	}
	
}
