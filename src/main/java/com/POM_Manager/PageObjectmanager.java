package com.POM_Manager;

import org.openqa.selenium.WebDriver;

import com.AdactinPOM.AdactinLoginPOM;
import com.AdactinPOM.BookHotelPagePOM;
import com.AdactinPOM.LogOutPOM;
import com.AdactinPOM.SearchHotelPOM;
import com.AdactinPOM.SelectHotelPagePOM;
import com.ConfigReader.ConfigReader;
import com.akash.testing.BaseClass;


public class PageObjectmanager extends BaseClass {
	
	 static WebDriver driver;

    private AdactinLoginPOM login;
    
	public AdactinLoginPOM getLoginPage() {
		
		if(login==null) {
			login = new AdactinLoginPOM(driver);
		}
		return login;
	}
	
	private SearchHotelPOM searchHotel;
	 
	public SearchHotelPOM getsearch() {
		if(searchHotel==null) {
			searchHotel = new SearchHotelPOM(driver);
		}
		return searchHotel;
	}

   
    private ConfigReader reader;

     public ConfigReader getReader() {
	      if(reader==null) {
		      reader = new ConfigReader();
	  }
     	return reader;
   }

     private SelectHotelPagePOM select;
     public SelectHotelPagePOM getSelect() {
    	 if (select==null) {
    		 select = new SelectHotelPagePOM(driver);
    	 }
    	 return select;
     }

     private BookHotelPagePOM book;
     public BookHotelPagePOM getBook() {
    	 if (book==null) {
    		 book = new BookHotelPagePOM(driver);
    	 }
    	 return book;
     }
     private LogOutPOM logOut;
     
     public LogOutPOM getLogOut() {
    	 if(logOut==null) {
    	 logOut = new LogOutPOM(driver);
     }
     return logOut;
}
}
