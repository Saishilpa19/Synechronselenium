package com.synechron.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {
  @Test
	 public void Login() {
		 WebDriverManager.chromedriver().setup();
			
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://practicetestautomation.com/practice-test-login/");

		 WebElement username=driver.findElement(By.id("username"));
		 
		 boolean flag= username.isDisplayed();
		 
		 System.out.println("username element is displayed: " +flag);
	 username.sendKeys("student");;
		 
		 //name locator
		 
		 WebElement password=driver.findElement(By.id("password"));
		 password.sendKeys("Password123");
		 
		 WebElement submit=driver.findElement(By.id("submit"));
	 submit.click();
		 
		 
	 }
}
