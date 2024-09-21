package com.AdactinPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ConfigReader.ConfigReader;
import com.InterfaceValues.HotelSearchPage;
import com.akash.testing.BaseClass;

public class SearchHotelPOM extends BaseClass implements HotelSearchPage{
	static WebDriver driver;

	 public  SearchHotelPOM (WebDriver driver) {
	     this.driver =driver;
	     PageFactory.initElements(driver, this);
	 }
	@FindBy(id=location_id)
	private WebElement location;
	
	@FindBy(id=hotels_id)
	private WebElement hotels;
	
	@FindBy(xpath=roomType_Xpath)
	private WebElement Room;
	
	@FindBy(xpath=rooms_Xpath)
	private WebElement rooms;
	
	@FindBy(id=adults_id)
	private WebElement adult;
	
	@FindBy(id=child_id)
	private WebElement children;
	
	@FindBy(id=search_id)
	private WebElement search;
	

public void getHotelSearchPage() throws IOException {
	ConfigReader cr=new ConfigReader();
	     selectDropDownOption(driver,location,"index",cr.getLocation());
			selectDropDownOption(driver,hotels,"index",cr.getHotels());
			selectDropDownOption(driver,Room,"value",cr.getRoomtype());
			selectDropDownOption(driver,rooms,"text",cr.getrooms());
			selectDropDownOption(driver,adult,"value",cr.getAdults());
			selectDropDownOption(driver,children,"index",cr.getchildrens());
			clickElement(driver,search);
}
}
