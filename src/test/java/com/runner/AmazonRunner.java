package com.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.akash.testing.BaseClass;
import com.listener.ExtendReport_Test;
import com.listener.ITestListenerClass;
import com.pom.LoginPage;

@Listeners(ITestListenerClass.class)


public class AmazonRunner extends BaseClass {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUP() throws Exception {
		driver= BaseClass.getBrowser("chrome");
	}

	@Test (priority = -3)
	public static void validLoginTest() throws Exception {
		ExtendReport_Test.extenttest = extentReports.createTest("Login Test" +" : "+Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("valid Email ID and valid Password");
	LoginPage lp = new LoginPage(driver);
		Assert.assertTrue(lp.validLogin(ExtendReport_Test.extenttest));
}
	
	
	@Test (priority = -2)
	public static void invalidLogin() throws Exception {
		ExtendReport_Test.extenttest = extentReports.createTest("Login Test" +" : "+Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid Email ID ");
	LoginPage lp = new LoginPage(driver);
		lp.invalidMailID();
}

@AfterTest
public static void temination() {
	quit();
}
		@BeforeSuite
		private void extendStartup() {
			extentReportstart("E:\\course\\akash.testing\\Reports");
			
		}
		
		@AfterSuite
		private void ExtendReportEnd() throws IOException {
			extentReportTearDown("E:\\course\\akash.testing\\Reports");
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		