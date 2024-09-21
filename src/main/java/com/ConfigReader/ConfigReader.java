
package com.ConfigReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	FileInputStream fis;
	Properties pro;
	
	private Properties getPropertyValues() {
		
		
			File file = new File("E:\\course\\akash.testing\\src\\main\\java\\com\\ConfigProperties\\test1.properties"); 
		try {	
			fis =new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			 pro = new Properties();
        try {
				pro.load(fis);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;
		
	}

	public String getBrowserName() throws IOException {
		
		String browsername = getPropertyValues().getProperty("browser");
		
		return browsername;
		
	}
	
	public String getUrl() throws IOException{

		String Url = getPropertyValues().getProperty("Url");
		return Url;
		
		
	}
	
	public String getusername() throws IOException{

		String user = getPropertyValues().getProperty("username");
		return user;
	
	}
	public String getPassword() throws IOException{

		String pass = getPropertyValues().getProperty("password");
		return pass;
	
	}
	
	public String getLocation()throws IOException {

		String location = getPropertyValues().getProperty("location");
		return location;
	
	}
	public String getHotels() throws IOException{

		String hotels = getPropertyValues().getProperty("hotels");
		return hotels;
	
	}
	
	public String getRoomtype() throws IOException{

		String Room = getPropertyValues().getProperty("roomtype");
		return Room;
	
	}
	
	public String getrooms() throws IOException{

		String rooms = getPropertyValues().getProperty("numberofrooms");
		return rooms;
	
	}
	
	public String getCheckin() throws IOException{

		String in = getPropertyValues().getProperty("checkin");
		return in;
	
	}
	
	public String getCheckout() throws IOException{

		String out = getPropertyValues().getProperty("checkout");
		return out;
	
	}
	public String getAdults() throws IOException{

		String adults = getPropertyValues().getProperty("adults");
		return adults ;
	
	}
	
	public String getchildrens() {

		String child = getPropertyValues().getProperty("childrens");
		return child;
	
	}
	public String getFirstName() {

		String firstName = getPropertyValues().getProperty("firstName");
		return firstName;
	}
	public String getLastName() {

		String lastName = getPropertyValues().getProperty("lastName");
		return lastName;
	}
		public String getAddress() {

			String addrerss = getPropertyValues().getProperty("addrerss");
			return addrerss;
		}
		public String getCreditCardNo() {

			String creditCardNo = getPropertyValues().getProperty("creditCardNo");
			return creditCardNo;
		}
		public String getCreditCardType() {

			String creditCardType = getPropertyValues().getProperty("creditCardType");
			return creditCardType;
		}

		public String getExpiryMonth() {

			String expiryMonth = getPropertyValues().getProperty("expiryMonth");
			return expiryMonth;
		}
		public String getExpiryYear() {

			String expiryYear = getPropertyValues().getProperty("expiryYear");
			return expiryYear;
		}
		public String getCvv() {

			String cvv = getPropertyValues().getProperty("cvv");
			return cvv;
		}
}
		