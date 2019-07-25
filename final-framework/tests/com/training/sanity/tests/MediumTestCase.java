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
import com.training.pom.SportsTshirtPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class MediumTestCase {
	
	//Sample Test Case
		private WebDriver driver; 
		private String baseUrl; 
		private HomePagePOM homePagePOM; 
		private SportsTshirtPOM sportsTshirtPOM ;
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
			homePagePOM.clickShopUniformBtn();
			homePagePOM.clickSportsTshirtBtn();
			sportsTshirtPOM.clickChestSizeBtn();
			sportsTshirtPOM.clickAddToCartBtn();
			sportsTshirtPOM.clickCartIcon();
			sportsTshirtPOM.clickViewCartBtn();
			sportsTshirtPOM.clickGuestCheckoutBtn();
		}
}


