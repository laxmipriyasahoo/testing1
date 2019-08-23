package com.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		String url ="https://www.facebook.com/";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("goowthami@gmail.com");
		Actions act =new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys("1234").perform();
	
	}
}
