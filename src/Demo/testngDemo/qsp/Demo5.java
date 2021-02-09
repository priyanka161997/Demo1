package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {
@Test(invocationCount = 5)
public void tc() {
	Reporter.log("hiiii", true);
}
}
