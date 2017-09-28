package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.BaseClass;

public class PractiseHomepage {

public PractiseHomepage() {
		
		PageFactory.initElements(BaseClass.driver, this);
	
	}

	@FindBy(xpath="//a[text()='My Account']")
	public WebElement MyAccountHomePage;
	
}
