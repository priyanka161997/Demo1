package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo8 {

		@Test(groups = "smoke",priority = 1)
		public void tc1() {
			Reporter.log("tc1", true);
		}

		@Test(groups = "functional",dependsOnGroups = "smoke")
		public void tc2() {
			Reporter.log("tc2", true);
		}

        @Test(groups = "smoke",priority = 2)
		public void tc3() {
			Reporter.log("tc3", true);
		}
		
		@Test(groups = "functional",dependsOnGroups = "smoke")
			public void tc4() {
				Reporter.log("tc4", true);
			}

		@Test(groups = "regration",dependsOnGroups = "functional")
			public void tc5() {
				Reporter.log("tc5", true);
			}

		@Test(groups = "smoke",priority = 3)
			public void tc6() {
				Reporter.log("tc6", true);
			}
		
		@Test(groups = "functional",priority = 0)
			public void tc7() {
				Reporter.log("tc7", true);
			}

}
