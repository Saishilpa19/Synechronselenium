package com.synechron.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annottionseg {
	@Test
	public void tc1() {
		System.out.println("am tc1");
		
	}
	@AfterClass
	public void tc2() {
		System.out.println("am aftrcls");
		
	}
	@BeforeClass
	public void tc3() {
		System.out.println("am befcls");
		
	}
	@Test
	public void tc4() {
		System.out.println("am tc4");
		
	}
	@AfterMethod
	public void beforemeth() {
		System.out.println("am beforemeth");
		
	}
	@AfterMethod
	public void aftermeth() {
		System.out.println("am aftermeth");
		
	}

}
