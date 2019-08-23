 package com.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Monster {
	WebDriver driver =null;
	@BeforeTest
	public void lanch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();	
		String url="https://my.monsterindia.com/sponsered_popup.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void dropdown()
	{
	WebElement location=driver.findElement(By.name("currentloc"));
		Select selection= new Select(location);
		//selection.selectByValue("34");
		selection.selectByVisibleText("Bhubaneswar");
		WebElement value=driver.findElement(By.name("exp_in_years"));
		Select select=new Select(value);
		select.selectByValue("1");
		WebElement exp=driver.findElement(By.name("industry"));
		Select select1=new Select(exp);
		select1.selectByValue("16");
		select1.selectByVisibleText("IT/Computers - Hardware");
		
		;
		
		
	}
	
	
	

}
