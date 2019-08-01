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
import com.training.pom.LoginPagePOM;
import com.training.pom.OrderHistoryPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class MediumTestCase3 {
	//Sample Test Case
			private WebDriver driver; 
			private String baseUrl; 
			private HomePagePOM homePagePOM;
			private LoginPagePOM loginPagePOM ;
			private OrderHistoryPOM orderHistoryPOM ;
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
				orderHistoryPOM = new OrderHistoryPOM(driver); 
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
					homePagePOM.clickAccountLaunch();
					homePagePOM.clickLoginBtn();
					loginPagePOM.sendEmailAddressEdt("iamsonamani@gmail.com");
					loginPagePOM.sendPasswordEdt("Mar@2019");
					loginPagePOM.clickLoginLogoBtn();
					loginPagePOM.clickMyAccountBtn();
					loginPagePOM.clickOrderHistoryBtn();
					orderHistoryPOM.clickViewIcon();
					orderHistoryPOM.clickReturnBtn();
					orderHistoryPOM.clickReasonReturnBtn();
					orderHistoryPOM.clickProductOpenBtn();
					orderHistoryPOM.sendFaultyDetailsEdt("Incorrect Item");
					orderHistoryPOM.clickAgreeCheckBtn();
					orderHistoryPOM.clickSubmitBtn();
					screenShot.captureScreenShot("MThird");
				}catch(Exception e) {
					e.printStackTrace();
					Assert.fail();
				}
				
				
				}
}

