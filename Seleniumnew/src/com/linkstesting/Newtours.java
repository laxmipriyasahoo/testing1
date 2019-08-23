package com.linkstesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {

	public static void main(String[] args) {

		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();
		String url ="http://newtours.demoaut.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
           
	   WebElement signon=   driver.findElement(By.linkText("REGISTER"));
	 String attribute=  signon.getAttribute("href");
          System.out.println(attribute);
          signon.click();
	    		
		
	
				
	}

}
