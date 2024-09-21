package com.facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Facelogin {
	
		
		static WebDriver driver;
	
		       
		public static WebDriver getDriver() {
			return driver;
		}

		public WebElement getUser() {
			return username;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLogin() {
			return login;
		}

		public WebElement getForgetacc() {
			return forgetacc;
		}

		public WebElement getSignup() {
			return signup;
		}
		
		@FindBy(id="username_id")
		private WebElement username;

		@FindBy(name="password_name")
		private WebElement pass;
		
		@FindBy(id="loginbtn_id")
		private WebElement login;
		
		@FindBy(xpath="//a[text()='Forgotten account?']")
		private WebElement forgetacc;
		
		@FindBy(xpath="//a[@'class=\"_97w5\']")
		private WebElement signup;

         public Facelogin(WebDriver driver) {
         this.driver =driver;
         PageFactory.initElements(driver, this);


         }
         }





