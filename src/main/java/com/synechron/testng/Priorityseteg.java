package com.synechron.testng;

import org.testng.annotations.Test;

public class Priorityseteg {
	
	@Test(enabled = false)
 public void m1() {
		System.out.println("method1");
	 
 }
	@Test
 public void m2() {
		System.out.println("method2");
	 
 }
	@Test
	 public void m3() {
			System.out.println("method3");
		 
	 }
	@Test
	 public void m4() {
			System.out.println("method4");
		 
	 }
	
}
