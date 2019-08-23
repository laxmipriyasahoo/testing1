package com.mouseover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) {

		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\lonovo\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();
		String url="https://www.spicejet.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	}

}
