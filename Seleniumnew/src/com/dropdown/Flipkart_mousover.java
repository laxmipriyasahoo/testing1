package com.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart_mousover {
	WebDriver driver=null;
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		String url=("https://www.snapdeal.com/");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		
	}
	@Test
	public void dropdown()
	{
		////*[@id="container"]/div/div[2]/div/ul/li[1]/span
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
		Actions action=new Actions(driver);
		 action.moveToElement(signin).perform();
		WebElement orders= driver.findElement(By.linkText("Your Orders"));
		//orders.click();
		orders.getText();

	}
	
}


