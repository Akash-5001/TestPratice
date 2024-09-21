package com.Maven;

import java.io.IOException;

import com.AdactinPOM.BookHotelPagePOM;
import com.POM_Manager.PageObjectmanager;
import com.akash.testing.BaseClass;

public class RunnerClass extends BaseClass {

	public static void main(String[] args) throws IOException{
		PageObjectmanager pom=new PageObjectmanager();
		browerlaunch(pom.getReader().getBrowserName());
		urlLaunch(pom.getReader().getUrl());
		pom.getLoginPage().getLoginPageElements();
//    	pom.getsearch().getHotelSearchPage();
//		pom.getSelect().getSelectPageElements();
//		pom.getBook().getBookHotelElements();
//		pom.getLogOut().getLogOutElements();
	}
}

