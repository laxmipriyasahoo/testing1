package screensot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url ="https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get(url);

	
		File google =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(google,new File("D:\\java\\screensot\\screenshots/GOOGLE.png"));
}
}