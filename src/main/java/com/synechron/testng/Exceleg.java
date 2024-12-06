package com.synechron.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceleg {
  WebDriver driver;
  XSSFWorkbook workbook;
  XSSFSheet sheet;
  XSSFCell cell;
  
  @Test
  public void login() throws IOException , FileNotFoundException {
	  WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
driver.get("https://practicetestautomation.com/practice-test-login/");
driver.manage().window().maximize();
File src = new File("C://Users//kiosk_user//eclipse-workspace//SelTestng//Testdata1.xls"); // execl path-to get the excel path - right click on ur project , select properties 

//load the file
FileInputStream fin = new FileInputStream(src);
workbook = new XSSFWorkbook();
sheet = workbook.getSheetAt(0);

for(int i=1 ; i<=sheet.getLastRowNum() ; i++) {
	
	//import data from excel for username attribute
	cell = sheet.getRow(i).getCell(0);
	
	driver.findElement(By.id("username")).sendKeys(cell.getStringCellValue());
	 
	//import data from excel for passsword attribute
cell = sheet.getRow(i).getCell(1);
	
	driver.findElement(By.id("password")).sendKeys(cell.getStringCellValue());
	driver.findElement(By.id("submit")).click();
	
	//write to excel sheet
	
	String title = driver.getTitle();	
	FileOutputStream fout = new FileOutputStream(src);
	 
	//create a nwe cell where data will be added
	sheet.getRow(i).createCell(2).setCellValue(title);
	workbook.write(fout);
	fout.close();
}


  }
}
