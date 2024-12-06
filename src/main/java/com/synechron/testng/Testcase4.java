package com.synechron.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4 {
	
	@Test
 public void scroll() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
 WebDriver driver = new ChromeDriver();
 
driver.navigate().to("https://practicetestautomation.com");
Thread.sleep(2000);

driver.manage().window().maximize(); 
WebElement scroll= driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
Actions act = new Actions(driver);

act.scrollToElement(scroll);
Thread.sleep(2000);
scroll.click();
}
}
