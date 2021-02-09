package org.demoframe.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant{
	public WebDriver driver = null;
	public String browserName = null;
	public String url = null;

	@BeforeMethod
	public void openBrowser() throws Exception {
		browserName = ExcelData.readValue(excel_path, browserInfoSheet, "browsername");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(chrome_key, chrome_value);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(firefox_key, firefox_value);
			driver = new FirefoxDriver();
		} else {
			driver = null;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TO, TimeUnit.SECONDS);
		url = ExcelData.readValue(excel_path, browserInfoSheet, "URl");
		driver.get(url);
		@AfterMethod
		public void closeBrowser(ITestResult itestresult) throws IOException {
			int status = itestresult.getStatus();
			String name = itestresult.getName();
			if (status == 1) {
				Reporter.log("TestCase : " + name + " is pass", true);
			} else {
				ScreenShot.takePic(driver, name + ssExt, screenShotFolder);
				Reporter.log("TestCase : " + name + " is fail", true);
			}

			driver.close();
		}

}
}