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
import com.training.pom.CategoriesPOM;
import com.training.pom.DashboardPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ComplexTestCase {
	//Sample Test Case
			private WebDriver driver; 
			private String baseUrl; 
			private AdminLoginPOM adminLoginPOM; 
			private DashboardPOM dashboardPOM ;
			private CategoriesPOM categoriesPOM;
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
				categoriesPOM = new CategoriesPOM(driver); 
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
			public void complexCategoryTest() {
				try {
				adminLoginPOM.sendUsernameEdt("admin");
				adminLoginPOM.sendPasswordEdt("admin@123");
				adminLoginPOM.clickLoginBtn();
				dashboardPOM.clickCatelogIconBtn();
				categoriesPOM.clickCategoriesBtn();
				categoriesPOM.clickAddNewBtn();
				categoriesPOM.sendCategoriesTextEdt("Sports wear");
				categoriesPOM.sendDescriptionEdt("Sports");
				categoriesPOM.sendMetaTagEdt("Sports");
				categoriesPOM.sendMetaDescribeEdt("Sports");
				categoriesPOM.clickSaveBtn();
				System.out.println("The message is displayed:Success:You have modified categories!");
				screenShot.captureScreenShot("CFirst");
				}catch(Exception e) {
					e.printStackTrace();
					Assert.fail();
				}
				
				
				}
}
