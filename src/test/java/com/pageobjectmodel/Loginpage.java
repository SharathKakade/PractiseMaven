package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.BaseClass;

public class Loginpage {

	public Loginpage() {
		
		PageFactory.initElements(BaseClass.driver, this);
		
	}
		
		
//		@FindBy(xpath="//label[Contains(text(),'Username or email address')]")
//		public WebElement Username_email_address_Text_Label;
		
		@FindBy(id="username")
		public WebElement UsernameTextBox;
		
		@FindBy(xpath="//label[contains(text(),'Password')]")
		public WebElement LoginPassowrdTextlabel;
		
		@FindBy(id="password")
		public WebElement LoginPasswordTextBox;
		
		@FindBy(name="login")
		public WebElement LoginButton;
		
		
	}

