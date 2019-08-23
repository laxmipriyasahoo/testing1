package Datadriven;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver=null;
	@BeforeTest
	public void  launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		String url ="https://www.facebook.com/";
		driver.get(url);
	}

	@Test
	public void test()
	{
		FileInputStream = new FileInputStream()
	}
}
