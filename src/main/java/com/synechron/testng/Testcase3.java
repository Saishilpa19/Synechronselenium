package com.synechron.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {
	@Test(groups="Regression")
 public void alerts() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
Thread.sleep(2000);
driver.manage().window().maximize();

WebElement prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
prompt.click();
Alert alt2 = driver.switchTo().alert();
String alttext = alt2.getText();
System.out.println(alttext);
alt2.sendKeys("sai");
alt2.accept();


//
Thread.sleep(2000);

 }
}
