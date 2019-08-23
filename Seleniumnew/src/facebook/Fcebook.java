package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fcebook {
	WebDriver driver =null;
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		String url ="https://www.facebook.com/r.php";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
	}

	@Test
	public void login()
	{
		driver.findElement(By.id("u_0_r")).sendKeys("gowthami");
		driver.findElement(By.id("u_0_o")).sendKeys("thadi");
		driver.findElement(By.name("reg_email__")).sendKeys("thadi.gowthami@gmail.com");
		driver.findElement(By.id("u_0_y")).sendKeys("1234");
		WebElement day =driver.findElement(By.name("birthday_day"));
		Select selection=new  Select(day);
		selection.selectByValue("11");
		WebElement month=driver.findElement(By.id("month"));
		Select selection1= new Select(month);
		selection1.selectByValue("11");
		driver.findElement(By.id("u_0_5")).click();
		driver.findElement(By.id("u_0_6")).click();
		
		
	}
	
}
