package day1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test(priority=1)
public void tc1() {
	Reporter.log("first test case");
}
@Test(priority=3)
public void tc2() {
	
	Reporter.log("second test case");
}
@Test(priority=4)
public void tc3() {
	Reporter.log("third test case");
}
@Test(priority=2)
public void tc4() {
	Reporter.log("fourth test case");
}
}
