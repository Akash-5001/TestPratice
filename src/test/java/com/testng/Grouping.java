package com.testng;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "VEG")
	private void idly() {
		System.out.println("Idly");
	}
	@Test(groups = "VEG")
	private void curdRice() {
		System.out.println("CurdRice");
	}
	@Test(groups = "VEG")
    private void poori() {
    	System.out.println("Poori");
	}
	@Test(groups = "NONVEG")
	private void briyani() {
		System.out.println("Briyani");
	}
	@Test(groups = "NONVEG")
	private void chicken65() {
		System.out.println("chickens65");
	}
   @Test(groups = "NONVEG")
    private void fish() {
    	System.out.println("Fish");	
    }
   @Test(groups ="EC")
    private void mobile() {
    	System.out.println("Moblie");
    	
	}
       @Test(groups = "EC")
    private void laptop() {
	   System.out.println("Laptop");
}
       @Test(groups = "EC")
	private void watch() {
	   System.out.println("Watch");
}
}