package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7 {
@Test(dependsOnMethods = "tc3")
public void tc1() {
	Reporter.log("tc1", true);
}

@Test(dependsOnMethods = "tc1")
public void tc2() {
	Reporter.log("tc2", true);
}

@Test
public void tc3() {
	Reporter.log("tc3", true);
}

}
