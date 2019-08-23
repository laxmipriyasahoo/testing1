package com.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Snapdeal_login {
	WebDriver driver=null;
	@BeforeTest
public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		String url=("https://www.snapdeal.com/");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	@Test
	public void Registerform() {
		WebElement signin=  driver.findElement(By.className("accountInner"));
		Actions act = new Actions(driver);
		act.moveToElement(signin).perform();
		WebElement newuser=driver.findElement(By.className("newUserRegister"));
		newuser.click();
		
		
				
		
	}

}
