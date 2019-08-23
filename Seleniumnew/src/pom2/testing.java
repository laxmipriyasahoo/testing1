package pom2;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testing extends BaseClass{
	@Test
	public void test()
	{
		online_shoppingmenandwomen whs =PageFactory.initElements(driver,online_shoppingmenandwomen.class);
		whs.Women();
		driver.navigate().back();
		whs.kids();
		
	}
	

}
