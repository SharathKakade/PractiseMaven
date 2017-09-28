package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.BaseClass;

public class Registerpage {

	public Registerpage() {
		
		PageFactory.initElements(BaseClass.driver, this);
	
	}
	
	@FindBy(xpath="//label[contains(text(),'Email address')]")
	public static WebElement EmailaddressTextlabel;
	
	@FindBy(id="reg_email")
	public WebElement EmailaddressTextbox;
	
	@FindBy(xpath="//label[contains(text(),'Password')]")
	public WebElement PasswordTextlabel;
	
	@FindBy(id="reg_password")
	public WebElement PasswordTextbox;
	
	@FindBy(xpath="//input[@name='register']")
	public WebElement RegisterButton;
	
	@FindBy(xpath="//li[Contains(text(),'An account is already registered with your email address. Please login')]")
	public WebElement Register_EmailID_already_logged;
	
}
