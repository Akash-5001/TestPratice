package com.AdactinPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ConfigReader.ConfigReader;
import com.InterfaceValues.LoginPageElements;
import com.akash.testing.BaseClass;

public class AdactinLoginPOM extends BaseClass implements LoginPageElements {

	static WebDriver driver;

    public AdactinLoginPOM(WebDriver driver) {
    this.driver =driver;
    PageFactory.initElements(driver, this);
    }


	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(name=password_name)
	private WebElement password;
	
	@FindBy(xpath=login_xpath)
	private WebElement loginBtn ;
	
	public void getLoginPageElements() throws IOException {
		
	ConfigReader cr=new ConfigReader();
	inputValues(username,cr.getusername());
	inputValues(password,cr.getPassword());
	clickElement(loginBtn);
	
     }


}

