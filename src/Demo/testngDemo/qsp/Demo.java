package Demo.testngDemo.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void tc_1() throws Exception {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("Hi....!");
	}
	@Test
	public void tc_2() throws Exception {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.name("h"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("Hi....!");
	}
}
