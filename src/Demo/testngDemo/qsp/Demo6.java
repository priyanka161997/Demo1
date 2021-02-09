package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6 {
@Test(priority = 2)
public void tc1(){
	Reporter.log("1hii", true);
}
@Test(priority = 3)
public void tc2(){
	Reporter.log("2hii", true);
}
@Test(priority = 1,invocationCount = 2)
public void tc3(){
	Reporter.log("3hii", true);
}
@Test(enabled =false)
public void tc4() {
	Reporter.log("4hiii", true);
}
@Test(invocationCount = 0)
public void tc5() {
	Reporter.log("5hiii", true);
}
}
