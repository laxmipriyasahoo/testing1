package day1;

import org.testng.annotations.Test;

public class Demo1 {
@Test(priority=1)
public void tc1() {
	System.out.println("first test case");
}
@Test(priority=3)
public void tc2() {
	System.out.println("second test case");
}
@Test(priority=4)
public void tc3() {
	System.out.println("third test case");
}
@Test(priority=2)
public void tc4() {
	System.out.println("fourth test case");
}
}
