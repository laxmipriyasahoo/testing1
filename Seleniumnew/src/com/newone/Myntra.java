package com.newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntra {
	WebDriver driver = null;
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		String url ="https://www.amazon.in/";
		driver.get(url);
		
	}
	@Test
	public void mouseover() throws InterruptedException
	{
	 WebElement	signin=driver.findElement(By.id("nav-link-accountList"));
	 Actions act = new Actions(driver);
	 act.moveToElement(signin).perform();
	 Thread.sleep(1000);
	  WebElement seller=driver.findElement(By.linkText("Seller Account"));
	  seller.getText();
	  seller.click();
	  System.out.println(seller);
	 }
	

}
