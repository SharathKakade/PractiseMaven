package com.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.library.BaseClass;
import com.library.GenericClass;
import com.pageobjectmodel.PractiseHomepage;
import com.pageobjectmodel.Registerpage;

public class PractiseLoginTest extends BaseClass{
	
	@Test
	public void PratciseLoginpage() throws InterruptedException {
	
		PractiseHomepage home=new PractiseHomepage();
		Registerpage page=new Registerpage();
		home.MyAccountHomePage.click();
		NXGReports.addStep("My Account HomePage", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		Thread.sleep(10000);
		NXGReports.addStep("Email address text is displayed", LogAs.PASSED, null);
		Assert.assertTrue(page.EmailaddressTextlabel.isDisplayed(),"The Email address text is not present");
		Thread.sleep(3000);
//		page.EmailaddressTextbox.sendKeys("sharathkakade1@gmail.com");
		NXGReports.addStep("EmailaddressTextbox is displayed", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		page.EmailaddressTextbox.sendKeys(GenericClass.getExcelData("Register", 1, 0));
		Thread.sleep(10000);
//		page.PasswordTextbox.sendKeys("bangaloresk29@");
		NXGReports.addStep("PasswordTextbox is displayed", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		page.PasswordTextbox.sendKeys(GenericClass.getExcelData("Register", 1, 1));
		Thread.sleep(10000);
		page.RegisterButton.click();
		Thread.sleep(10000);
		NXGReports.addStep("Register_EmailID_already_logged is displayed", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		Assert.assertTrue(page.Register_EmailID_already_logged.isDisplayed(), "Register_EmailID_already_is not logged");
		Thread.sleep(3000);

	}
}