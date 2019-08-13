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
import com.training.pom.ReturnPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ComplexTestCase3 {
	//Sample Test Case
			private WebDriver driver; 
			private String baseUrl; 
			private AdminLoginPOM adminLoginPOM; 
			private ReturnPOM returnPOM;
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
				new DashboardPOM(driver);
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
           public void complexThirdTest() {
				try {
					adminLoginPOM.sendUsernameEdt("admin");
					adminLoginPOM.sendPasswordEdt("admin@123");
					adminLoginPOM.clickLoginBtn();
					//returnPOM.clickDateStartBtn();
					//returnPOM.clickDateEndBtn();
					returnPOM.clickFilterBtn();
					screenShot.captureScreenShot("CThird");
				}catch(Exception e) {
					e.printStackTrace();
					Assert.fail();
				}
				
				
				}
}
