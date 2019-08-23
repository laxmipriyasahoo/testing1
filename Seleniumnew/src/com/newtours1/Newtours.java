package com.newtours1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtours {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		String url ="http://newtours.demoaut.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		String expected_title ="flight";
		System.out.println("the expected title of webpage is:"+expected_title);
		String actual_title=driver.getTitle();
		System.out.println("the actual title:"+actual_title);
		
	WebElement	passenger=driver.findElement(By.name("passCount"));
	Select selection =new Select(passenger);
	selection.selectByValue("4");
	 WebElement depart=driver.findElement(By.name("fromPort"));
	Select selection1=new Select(depart);
	selection1.selectByValue("Seattle");
	 WebElement month=driver.findElement(By.name("fromMonth"));
	 Select selection2=new Select(month);
		selection2.selectByVisibleText("April");
		WebElement day = driver.findElement(By.name("fromDay"));
		 Select selection3=new Select(day);
			selection3.selectByVisibleText("4");
		
		
		 
	}

}
