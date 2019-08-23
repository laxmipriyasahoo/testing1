package com.handlingalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
   WebDriver  driver = null;
   System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
   driver = new ChromeDriver();
   String url ="https://mail.rediff.com/cgi-bin/login.cgi";
   driver.get(url);
   driver.findElement(By.name("proceed")).click();
    Alert alt =driver.switchTo().alert();
    Thread.sleep(2000);
   String alert_message= alt.getText();
   System.out.println("the actual text of :"+alert_message);
    
    alt.accept();
	}

}
