package com.synechron.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	
	
	@Test(groups={"Regression ","sanity"})
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
driver.navigate().to("https://the-internet.herokuapp.com/download");

	}

}
