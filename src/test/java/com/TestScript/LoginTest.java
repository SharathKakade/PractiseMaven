package com.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.library.BaseClass;
import com.library.GenericClass;
import com.pageobjectmodel.Loginpage;
import com.pageobjectmodel.PractiseHomepage;

public class LoginTest extends BaseClass {
	
	@Test
	public void logintopracticeapplication() throws InterruptedException {
		
		Loginpage login=new Loginpage();
//		NXGReports.addStep("Username address text is displayed", LogAs.PASSED, null);
//		Assert.assertTrue(login.Username_email_address_Text_Label.isDisplayed(),"The Username_email_address lable is not present");
		Thread.sleep(3000);
		NXGReports.addStep("Username address Text box is displayed", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		login.UsernameTextBox.sendKeys(GenericClass.getExcelData("Register", 1, 0));
		Thread.sleep(10000);
		NXGReports.addStep("PasswordTextbox is displayed", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		login.LoginPasswordTextBox.sendKeys(GenericClass.getExcelData("Register", 1, 1));
		Thread.sleep(10000);
		login.LoginButton.click();
		Thread.sleep(10000);
		
	}

}
