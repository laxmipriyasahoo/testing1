package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:/Users/lonovo/Desktop/chromedriver.exe");
		String url ="https://www.facebook.com/";
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				driver.findElement(By.id("email")).sendKeys("thadi.gowthami12@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.id("pass")).sendKeys("gowthami123");
				driver.findElement(By.id("u_0_a")).click();
				
				
	}

}
