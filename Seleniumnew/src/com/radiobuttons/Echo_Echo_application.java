package com.radiobuttons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echo_Echo_application {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		String url ="http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	WebElement	radiobuttonsblock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement>group1radiobuttons=radiobuttonsblock.findElements(By.name("group1"));
		System.out.println("the group1 radio buttons are:"+group1radiobuttons.size());
		for(int i=0;i<group1radiobuttons.size();i++)
		{
			group1radiobuttons.get(i).click();
			System.out.println(group1radiobuttons);
			for(int j=0;j<group1radiobuttons.size();j++)
			
					{
		 System.out.println(group1radiobuttons.get(j).getAttribute(("value")+"-"+group1radiobuttons.get(j).isSelected()));
				
					}
		
			
		}
				
		
		
	}

}
