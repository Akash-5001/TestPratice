package com.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.akash.testing.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPage extends BaseClass{
	public WebDriver driver;
	
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='Hello, sign in']")
	private WebElement signinbtn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signinbtn1;
	
	@FindBy(xpath="//div[contains(text(),'Enter a valid email address')]")
	private WebElement emailError;
	
	@FindBy(xpath="//div[contains(text(),'Enter your email')]")
	private WebElement emptyEmail;
	
	@FindBy(xpath="//*[@class='a-list-item']")
	private WebElement passwordError;

	@FindBy(xpath="//div[contains(text(),'Enter your')]")
	private WebElement emptypassword;
	
	public boolean validLogin(ExtentTest extenttest) throws Exception{
		//try {
			urlLaunch("https://www.amazon.in/");
			clickElement(signinbtn);
			inputValues(emailid,"akashvijay22a@gmail.com");
			clickElement(continueBtn);
			inputValues(password,"Akash22a");
			clickElement(signinbtn1);
			String title=driver.getTitle();
			Assert.assertEquals(title,"Online Shopping ");
//			extenttest.log(Status.PASS, "Login Sucessfull");
//			extenttest.log(Status.FAIL, "Login UnSucessfull");
//		} catch (AssertionError e) {
//			extenttest.log(Status.FAIL, "Login Failed:" + e.getMessage());
//			return false;
//		}
		return true;
	}
	
	
	public void invalidMailID() throws Exception {
		urlLaunch("https://www.amazon.in/");
		clickElement(signinbtn);
		inputValues(emailid,"akashvijay22a@gmail.com");
		clickElement(continueBtn);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Enter a valid email address or phone number");
	}
	public void emailEmptyLogin() throws Exception {
		urlLaunch("https://www.amazon.in/");
		clickElement(signinbtn);
		inputValues(emailid," ");
		clickElement(continueBtn);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Enter your email or mobile phone number");
	}
//	
//    public void passwordError() throws Exception {
//	    getBrowser("https://www.amazon.in/");
//	    clickElement(signinbtn);
//     	inputValues(emailid,"akashvijay22a@gmail.com");
//    	clickElement(continueBtn);
//    	inputValues(password,"Akash22a");
//	    clickElement(signinbtn1);
//	    String title=driver.getTitle();
//	    Assert.assertEquals(title,"Your password is incorrect");
//}
//    public void passwordEmpty() throws Exception {
//        getBrowser("https://www.amazon.in/");
//	    clickElement(signinbtn);
//	    inputValues(emailid,"akashvijay22a@gmail.com");
//	    clickElement(continueBtn);
//	    inputValues(password,"Akash22a");
//	    clickElement(signinbtn1);
//     	String title=driver.getTitle();
//     	Assert.assertEquals(title,"Enter your password");
//}
}