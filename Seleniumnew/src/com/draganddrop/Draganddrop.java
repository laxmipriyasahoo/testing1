package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	WebDriver driver = null;
	
	@BeforeTest
	public void launch()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		String url ="https://jqueryui.com/droppable/";
		driver.get(url);
		
	}

	@Test
	public void draganddrop()
	{
	 //WebElement frame=driver.findElement(By.className("demo-frame"));
	 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	String title= driver.getTitle();
	System.out.println(title);
	String expectedtitle="jquery";
	System.out.println("the expected title of webpage is :"+expectedtitle);
WebElement draggable=driver.findElement(By.id("draggable"));
	 WebElement  droppable =driver.findElement(By.id("droppable"));
	 Actions act = new Actions(driver);
	 act.dragAndDrop(draggable, droppable).perform();
	 if(driver.getTitle().equals(expectedtitle));
	 {
		 System.out.println(expectedtitle);
		 
	 }

	 {
		 System.out.println();
		
		 
		 System.out.println(driver.getTitle());
	 }
	}

		
	}


