package com.synechron.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterseg {
	
	@Test
	@Parameters("browser")
 public void launchbrow(String browser) {
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			
			 WebDriver driver = new ChromeDriver();
			 
	driver.navigate().to("https://the-internet.herokuapp.com/download");

			
		}else {
			WebDriverManager.edgedriver().setup();
   			
  			 WebDriver driver = new EdgeDriver();
  			 
  	driver.navigate().to("https://the-internet.herokuapp.com/download");
			
		}
	}
	 
 }

