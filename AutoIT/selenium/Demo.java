package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/upload/");
	Thread.sleep(1000);
	driver.findElement(By.id("file_wraper0")).click();
	Thread.sleep(1000);
	Runtime r=Runtime.getRuntime();
	String st="C://AutoITFiles/Demo.exe";
	r.exec(st);
}
}
