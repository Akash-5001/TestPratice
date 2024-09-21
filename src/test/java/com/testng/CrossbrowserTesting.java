package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.akash.testing.BaseClass;

public class CrossbrowserTesting extends BaseClass {
@Ignore
@Test(invocationCount = 2)
	private void chrome() throws Exception {
		getBrowser("chrome");
		urlLaunch("https:///www.google.com");
	    System.out.println("brower name:"+Thread.currentThread().threadId());
	    quit();
	}
@Test(expectedExceptions = ArithmeticException.class)
private void edge() throws Exception {
	getBrowser("edge");
	urlLaunch("https:///www.google.com");
	int a = 10;
    System.out.println(a/0);
    quit();
}
@Test(priority = -5)
private void firefox() throws Exception {
	getBrowser("firefox");
	urlLaunch("https:///www.google.com");
    System.out.println("brower name:"+Thread.currentThread().threadId());
    quit();
}
}