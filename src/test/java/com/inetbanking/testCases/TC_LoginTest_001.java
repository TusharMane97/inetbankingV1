package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws IOException {
		
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login is passed");
		}
		else {
			captureScreen(driver,"logingTest()");
		Assert.assertTrue(false);
		logger.info("Login is failed");
		}
	}

}
