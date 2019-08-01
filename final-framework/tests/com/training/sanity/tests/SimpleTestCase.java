package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class SimpleTestCase {
	
	//Sample Test Case
		private WebDriver driver; 
		private String baseUrl; 
		private HomePagePOM homePagePOM; 
		private LoginPagePOM loginPagePOM;
		private static Properties properties; 
		private ScreenShot screenShot; 
		
		
		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
	        homePagePOM = new HomePagePOM(driver); 
	        loginPagePOM = new LoginPagePOM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			driver.get(baseUrl);
		}

		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(5000);
			driver.quit();
		}
	
	@Test (priority = 1)
	public void simplePassTest() {
		try {
		    homePagePOM.clickAccountLaunch();
		    homePagePOM.clickRegisterBtn();
			homePagePOM.sendFirstName("Sonam");
			homePagePOM.sendLastName("Dutta");
			homePagePOM.sendEmailId("iamsonamani@gmail.com"); 
			homePagePOM.sendTelephone("7980759659");
			homePagePOM.sendAddress1("Newtown");
			homePagePOM.sendcityName("Kolkata");
			homePagePOM.sendPostcode("700156");
			homePagePOM.sendCountryName("India");
			homePagePOM.sendStateName("West Bengal");
			homePagePOM.sendPassword("Mar@2019");
			homePagePOM.sendPasswordConfirm("Mar@2019");
			homePagePOM.clickRadioBtn();
			homePagePOM.clickPrivacyPolicy();
			homePagePOM.clickContinueBtn();
			screenShot.captureScreenShot("SFirst");
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test (priority = 2)
	public void simpleLoginTest() {
		try {
		loginPagePOM.clickDrpAccount();
		loginPagePOM.clickLoginBtn();
		loginPagePOM.sendEmailAddressEdt("iamsonamani@gmail.com");
		loginPagePOM.sendPasswordEdt("Mar@2019");
		loginPagePOM.clickLoginLogoBtn();
		screenShot.captureScreenShot("Ssecond");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	@Test (priority = 3)
	public void simplePasswordRecoverTest() {
		try {
		loginPagePOM.clickDrpAccount();
		loginPagePOM.clickLoginBtn();
		loginPagePOM.sendEmailAddressEdt("iamsonamani@gmail.com");
		loginPagePOM.sendPasswordEdt("Mar@1111");
		loginPagePOM.clickLoginLogoBtn();
		loginPagePOM.clickForgotPasswordBtn();
		loginPagePOM.sendEmailRecoverEdt("iamsonamani@gmail.com");
		loginPagePOM.clickContinueBtn();
		screenShot.captureScreenShot("SThird");
	}catch(Exception e) {
		e.printStackTrace();

}
}
}
