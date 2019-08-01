package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;
import com.training.pom.SportsTshirtPOM;
import com.training.pom.CheckOutPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class MediumTestCase {
	
	//Sample Test Case
		private WebDriver driver; 
		private String baseUrl; 
		private HomePagePOM homePagePOM; 
		private SportsTshirtPOM sportsTshirtPOM ;
		private CheckOutPOM checkOutPOM ;
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
	        checkOutPOM = new CheckOutPOM(driver);
	        sportsTshirtPOM = new SportsTshirtPOM(driver); 
	        baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			driver.get(baseUrl);
		}

		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(5000);
			driver.quit();
		}
		@Test
		public void mediumOrderTest() {
			try {
			homePagePOM.clickShopUniformBtn();
			homePagePOM.clickSportsTshirtBtn();
			sportsTshirtPOM.clickChestSizeBtn();
			sportsTshirtPOM.clickAddToCartBtn();
			sportsTshirtPOM.clickCartIcon();
			sportsTshirtPOM.clickViewCartBtn();
			sportsTshirtPOM.clickCheckoutBtn();
			checkOutPOM.clickGuestCheckoutBtn();
			//Assert.assertEquals(checkOutPOM.getGuestCheckoutBtn().isSelected(), "Guest button not selected");
			checkOutPOM.clickContinueBtn();
			checkOutPOM.sendFirstNameEdt("Sonam");
			checkOutPOM.sendLastNameEdt("Dutta");
			checkOutPOM.sendEmailEdt("iamsonamani@gmail.com");
			checkOutPOM.sendTelephoneEdt("9831541830");
			checkOutPOM.sendAddressEdt("Newtown");
			checkOutPOM.sendCityEdt("Kolkata");
			checkOutPOM.sendPostcodeEdt("700156");
			checkOutPOM.sendCountryName("India");
			checkOutPOM.sendStateName("West Bengal");
			//checkOutPOM.clickShippingCheckbox();
			checkOutPOM.clickContinue1Btn();
			checkOutPOM.sendAddComment("Proper packaging");
			checkOutPOM.clickShippingContinueBtn();
			checkOutPOM.clickAgreeBtn();
			checkOutPOM.clickContinue2Btn();
			checkOutPOM.clickConfirmOrderBtn();
			screenShot.captureScreenShot("MFirst");	
			}catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}
}