package com.synechron.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assereg {
	@Test
	public void soft() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
driver.navigate().to("https://the-internet.herokuapp.com/download");
Thread.sleep(2000);

//soft Assertiion
String exp="orange";
String actual=driver.getTitle();
SoftAssert A= new SoftAssert();
A.assertEquals(actual, exp);


// Hard aseertion

String exp1="orange";
String actual1=driver.getTitle();

Assert.assertEquals(actual1, exp1);
	}

}
