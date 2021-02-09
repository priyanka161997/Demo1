package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Myntra {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File ss=ts.getScreenshotAs(OutputType.FILE);
	File ss1=new File("./ScreenShot/myntra.png");
	Files.copy(ss, ss1);
}
}
