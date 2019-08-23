package com.practice.laxmipriya.sanpdeal.login;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {
	public static void name(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")).click();
		driver.findElement(By.id("userName")).sendKeys("laxmipriyasahootestengineer@gmail.com");
		driver.findElement(By.id("checkUser")).click();
		driver.findElement(By.id("j_username_new")).sendKeys("laxmipriyasahootestengineer@gmail.com");
		driver.findElement(By.name("j_number")).sendKeys("7978041541");
		driver.findElement(By.name("j_name")).sendKeys("laxmipriya sahoo");
		driver.findElement(By.name("j_dob")).sendKeys("19/03/1994");
		driver.findElement(By.name("j_password")).sendKeys("9437774257");
	driver.findElement(By.id("continue")).click();