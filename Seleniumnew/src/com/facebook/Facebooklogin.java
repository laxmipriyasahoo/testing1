package com.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebooklogin {
	WebDriver driver =null;
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		String url ="https://www.facebook.com/";
		driver.get(url);
	}

	@Testas `
	public void login() throws IOException
	{
		FileInputStream file = new FileInputStream("D:\\java\\Seleniumnew\\excellfile\\sheet1.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
			
		{
			Row r=sheet.getRow(i);
			driver.findElement(By.id("email")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("pass")).sendKeys(r.getCell(0).getStringCellValue());
			
		}
	}
	
}
