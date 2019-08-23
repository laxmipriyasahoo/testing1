package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotgoogle {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		String url ="https://www.google.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		File google =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(google,new File("D:\\java\\Seleniumnew\\screenshot\\google.png"));
		
		
	}

}
