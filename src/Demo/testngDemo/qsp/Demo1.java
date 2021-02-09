package Demo.testngDemo.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
WebDriver driver;
	@BeforeMethod
	public void before() throws Exception {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void tc_1() throws Exception {

		WebElement search =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("tc1....!");
	}
	@Test
	public void tc_2() throws Exception {
		
		WebElement search =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("testng",Keys.ENTER);
		System.out.println("tc2....!");
	}
	@AfterMethod
	public void after(){
		driver.close();
	}
}
