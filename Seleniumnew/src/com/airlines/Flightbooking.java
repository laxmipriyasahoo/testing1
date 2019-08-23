package com.airlines;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightbooking {

	public static void main(String[] args) {
		
		WebDriver driver =null;
		String url = "https://www.happyeasygo.com";
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			
			WebElement  flight =driver.findElement(By.id("cityname"));
			flight.clear();
			flight.sendKeys("mumbai");
		driver.findElement(By.id("check-in")).sendKeys("wed");
		driver.findElement(By.id("ui-datepicker-div")).click();																												
	

	}

}
