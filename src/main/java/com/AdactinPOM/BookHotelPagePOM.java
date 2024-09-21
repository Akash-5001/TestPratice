package com.AdactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ConfigReader.ConfigReader;
import com.InterfaceValues.BookHotelPageElements;
import com.akash.testing.BaseClass;

public class BookHotelPagePOM extends BaseClass implements BookHotelPageElements{
	
	static WebDriver driver;
	
	public BookHotelPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath=firstName_Xpath)
	   private WebElement firstName;
	 
	 @FindBy(xpath=lastName_Xpath)
	   private WebElement lastName;
	 
	 @FindBy(id=address_id)
	   private WebElement address;
	 
	 @FindBy(id=creditCardNo_id)
	   private WebElement creditCardNo;
	 
	 @FindBy(id=creditCardType_id)
	   private WebElement creditCardType;
	 
	 @FindBy(id=expiryMonth_id)
	   private WebElement expiryMonth;
	 
	 @FindBy(xpath=expiryYear_id)
	   private WebElement expiryYear ;
	 
	 @FindBy(id=cvv_id)
	   private WebElement cvv;
	 
	 @FindBy(xpath=book_Xpath)
	   private WebElement book;
	 
	 @FindBy(id=cancel_id)
	   private WebElement cancel;
	 
	public void getBookHotelElements() {
		ConfigReader cr=new ConfigReader();
		inputValues(driver,firstName,cr.getFirstName());
		inputValues(driver,lastName,cr.getLastName());
		inputValues(driver,address,cr.getAddress());
		inputValues(driver,creditCardNo,cr.getCreditCardNo());
		selectDropDownOption(driver,creditCardType,"index",cr.getCreditCardType());
		selectDropDownOption(driver,expiryMonth,"value",cr.getExpiryMonth());
		selectDropDownOption(driver,expiryYear,"value",cr.getExpiryYear());
		inputValues(driver,cvv,cr.getCvv());
		clickElement(driver,book);
		
	}	
}