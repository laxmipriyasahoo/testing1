 package com.newtours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours {
	WebDriver driver =null;
	String url = "https://www.happyeasygo.com";
	@BeforeTest
	public void launch()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}

	@Test(priority=0)
	public void test()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
	}
	@Test
	public void flight()
	{
	/*WebElement passenger=	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select"));
Select selection=new Select(passenger);
selection.selectByValue("1");
*/
		WebElement  flight =driver.findElement(By.id("cityname"));
		flight.clear();
		flight.sendKeys("mumbai");
	driver.findElement(By.id("check-in")).sendKeys("wed");
	}
}
