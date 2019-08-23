package com.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Timeandclock {
 WebDriver driver =null;
 
  @BeforeTest
  public void launch()
  {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
	 driver= new ChromeDriver();
	 String url ="https://www.timeanddate.com/worldclock/";
	 driver.get(url);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  @Test
  public void webtable()
  {
	  WebElement CITYNAME= driver.findElement(By.linkText("Boston"));
	  String text_city=CITYNAME.getText();
	  System.out.println(CITYNAME);
	  
  }
}
