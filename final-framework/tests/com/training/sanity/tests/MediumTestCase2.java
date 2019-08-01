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
import com.training.pom.AdminLoginPOM;
import com.training.pom.DashboardPOM;
import com.training.pom.ProductsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class MediumTestCase2 {
	//Sample Test Case
			private WebDriver driver; 
			private String baseUrl; 
			private AdminLoginPOM adminLoginPOM; 
			private DashboardPOM dashboardPOM ;
			private ProductsPOM productsPOM ;
			private static Properties properties; 
			private ScreenShot screenShot; 
			
			
			@BeforeClass
			public static void setUpBeforeClass() throws IOException {
				properties = new Properties();
				FileInputStream inStream = new FileInputStream("./resources/others2.properties");
				properties.load(inStream);
			}

			@BeforeMethod
			public void setUp() throws Exception {
				driver = DriverFactory.getDriver(DriverNames.CHROME);
				adminLoginPOM = new AdminLoginPOM(driver); 
				dashboardPOM = new DashboardPOM(driver);
				productsPOM = new ProductsPOM(driver); 
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
			public void mediumProductTest() {
				try {
				adminLoginPOM.sendUsernameEdt("admin");
				adminLoginPOM.sendPasswordEdt("admin@123");
				adminLoginPOM.clickLoginBtn();
				dashboardPOM.clickCatelogIconBtn();
				dashboardPOM.clickProductIconBtn();
				productsPOM.clickAddNewIcon();
				productsPOM.sendProductNameEdt("Blazer Girls(7-8)");
				productsPOM.sendMetaTagEdt("Blazer for Girls");
				productsPOM.clickDataTab();
				productsPOM.sendModelEdt("BLG-112");
				productsPOM.sendPriceEdt("3000");
				productsPOM.sendQuantityEdt("100");
				productsPOM.clickLinksTab();
				productsPOM.clickCategoriesEdt();
				productsPOM.clickCategoriesListEdt();
				productsPOM.clickDiscountTab();
				productsPOM.clickAddDiscountTab();
				productsPOM.sendQuantityValue("5");
				productsPOM.sendPriceAmt("200");
				productsPOM.clickStartCalendr();
				//productsPOM.clickStartDate();
				//productsPOM.clickEndDate();
				productsPOM.clickRewardPointsTab();
				productsPOM.sendPointsEdt("20");
				productsPOM.clickSaveIcon();
				screenShot.captureScreenShot("MSecond");
				}catch(Exception e) {
					e.printStackTrace();
					Assert.fail();
				}
				
				
				}

}
