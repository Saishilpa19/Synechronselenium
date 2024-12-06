package com.synechron.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugg {
	 String expectedtext = "orangehrm";
	 
	 @Test
	public void autosuggeston() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
driver.get("httos://ww.google.com");
driver.manage().window().maximize();
WebElement searchbox =  driver.findElement(By.id("input")); //xpath of searchbox

searchbox.sendKeys("orange");
Thread.sleep(2000);
 List<WebElement> autosugg = searchbox.findElements(By.xpath(".//li"));// getting the names with li webelement
 
 for(WebElement listerner : autosugg) {
	 
	 WebElement term = listerner.findElement(By.xpath("//span"));
	 System.out.println(listerner.getText());
 }
 
 
		
	}

}
