package com.synechron.testng;

import org.testng.annotations.Test;

public class Dependsmethod {
	@Test(enabled = false)
	public void login() {
		System.out.println("login");
	}
	
	@Test(dependsOnMethods = {"login"})
	public void addcoat() {
		System.out.println("addcoat");
	}

}
